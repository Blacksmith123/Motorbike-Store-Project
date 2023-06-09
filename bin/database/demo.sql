USE [master]
GO
/****** Object:  Database [BikeStores]    Script Date: 13/05/2023 23:46:05 ******/
CREATE DATABASE [BikeStores]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'BikeStores', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL16.MSSQLSERVER\MSSQL\DATA\BikeStores.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'BikeStores_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL16.MSSQLSERVER\MSSQL\DATA\BikeStores_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT, LEDGER = OFF
GO
ALTER DATABASE [BikeStores] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [BikeStores].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [BikeStores] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [BikeStores] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [BikeStores] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [BikeStores] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [BikeStores] SET ARITHABORT OFF 
GO
ALTER DATABASE [BikeStores] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [BikeStores] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [BikeStores] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [BikeStores] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [BikeStores] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [BikeStores] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [BikeStores] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [BikeStores] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [BikeStores] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [BikeStores] SET  DISABLE_BROKER 
GO
ALTER DATABASE [BikeStores] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [BikeStores] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [BikeStores] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [BikeStores] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [BikeStores] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [BikeStores] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [BikeStores] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [BikeStores] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [BikeStores] SET  MULTI_USER 
GO
ALTER DATABASE [BikeStores] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [BikeStores] SET DB_CHAINING OFF 
GO
ALTER DATABASE [BikeStores] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [BikeStores] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [BikeStores] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [BikeStores] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
ALTER DATABASE [BikeStores] SET QUERY_STORE = OFF
GO
USE [BikeStores]
GO
/****** Object:  Table [dbo].[ChiTietHoaDon]    Script Date: 13/05/2023 23:46:05 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChiTietHoaDon](
	[maHoaDon] [varchar](10) NOT NULL,
	[maLoaiXe] [varchar](10) NOT NULL,
	[soLuong] [int] NOT NULL,
	[donGia] [int] NOT NULL,
	[thanhTien] [int] NOT NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[CuaHang]    Script Date: 13/05/2023 23:46:05 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CuaHang](
	[maCuaHang] [varchar](10) NOT NULL,
	[tenCuaHang] [nvarchar](20) NOT NULL,
	[soDienThoai] [int] NOT NULL,
	[email] [nvarchar](20) NOT NULL,
	[duong] [nvarchar](30) NOT NULL,
	[thanhPho] [nvarchar](30) NOT NULL,
	[tinhTrang] [nvarchar](15) NOT NULL,
	[maBuuDien] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[maCuaHang] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HoaDon]    Script Date: 13/05/2023 23:46:05 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDon](
	[maHoaDon] [varchar](10) NOT NULL,
	[ngayLap] [date] NULL,
	[thoiGianBaoHanh] [nvarchar](30) NOT NULL,
	[maKhachHang] [varchar](10) NOT NULL,
	[maCuaHang] [varchar](10) NOT NULL,
	[maNhanVien] [varchar](10) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[maHoaDon] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KhachHang]    Script Date: 13/05/2023 23:46:05 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhachHang](
	[maKhachHang] [varchar](10) NOT NULL,
	[hoKhachHang] [nvarchar](10) NOT NULL,
	[tenKhachHang] [nvarchar](30) NOT NULL,
	[diaChi] [nvarchar](100) NOT NULL,
	[soDienThoai] [int] NOT NULL,
	[email] [nvarchar](40) NOT NULL,
 CONSTRAINT [PK__KhachHan__0CCB3D496DBD21A4] PRIMARY KEY CLUSTERED 
(
	[maKhachHang] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhanVienHanhChanh]    Script Date: 13/05/2023 23:46:05 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanVienHanhChanh](
	[maNhanVien] [varchar](10) NOT NULL,
	[tenNhanVien] [nvarchar](30) NOT NULL,
	[diaChi] [nvarchar](50) NOT NULL,
	[soDienThoai] [int] NOT NULL,
	[chucVu] [nvarchar](20) NOT NULL,
	[email] [nvarchar](40) NOT NULL,
	[soNamKinhNghiem] [int] NOT NULL,
	[maCuaHang] [varchar](10) NOT NULL,
	[taiKhoan] [varchar](10) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[maNhanVien] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhanVienKiThuat]    Script Date: 13/05/2023 23:46:05 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanVienKiThuat](
	[maNhanVien] [varchar](10) NOT NULL,
	[tenNhanVien] [nvarchar](30) NOT NULL,
	[soDienThoai] [int] NOT NULL,
	[email] [nvarchar](40) NOT NULL,
	[bacTho] [nvarchar](10) NOT NULL,
	[chucVu] [nvarchar](20) NOT NULL,
	[soNamKinhNghiem] [int] NOT NULL,
	[diaChi] [nvarchar](50) NOT NULL,
	[maCuaHang] [varchar](10) NOT NULL,
	[taiKhoan] [varchar](10) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[maNhanVien] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhaPhanPhoi]    Script Date: 13/05/2023 23:46:05 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhaPhanPhoi](
	[maNhaPhanPhoi] [varchar](10) NOT NULL,
	[tenNhaPhanPhoi] [nvarchar](30) NOT NULL,
	[diaChi] [nvarchar](50) NOT NULL,
	[soDienThoai] [int] NOT NULL,
	[email] [nvarchar](20) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[maNhaPhanPhoi] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[PhieuNhanXet]    Script Date: 13/05/2023 23:46:05 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PhieuNhanXet](
	[maPhieu] [varchar](10) NOT NULL,
	[liDoBaoHanh] [nvarchar](50) NOT NULL,
	[loiThuocVe] [nvarchar](30) NOT NULL,
	[giaTien] [int] NOT NULL,
	[linhKien] [nvarchar](20) NOT NULL,
	[maKhachHang] [varchar](10) NOT NULL,
	[maNhanVien] [varchar](10) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[maPhieu] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[TaiKhoan]    Script Date: 13/05/2023 23:46:05 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TaiKhoan](
	[taiKhoan] [varchar](10) NOT NULL,
	[matKhau] [varchar](20) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[taiKhoan] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ThongTinXe]    Script Date: 13/05/2023 23:46:05 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ThongTinXe](
	[maLoaiXe] [varchar](10) NOT NULL,
	[tenLoaiXe] [nvarchar](30) NOT NULL,
	[giaNiemYet] [int] NOT NULL,
	[giaGiam] [int] NOT NULL,
	[moTaXe] [nvarchar](150) NOT NULL,
	[phienBan] [nvarchar](20) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[maLoaiXe] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Xe]    Script Date: 13/05/2023 23:46:05 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Xe](
	[maXe] [varchar](10) NOT NULL,
	[soMay] [varchar](20) NOT NULL,
	[soKhung] [varchar](20) NOT NULL,
	[ngayNhapXe] [date] NULL,
	[maNhaPhanPhoi] [varchar](10) NOT NULL,
	[maLoaiXe] [varchar](10) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[maXe] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[XeTrongKho]    Script Date: 13/05/2023 23:46:05 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[XeTrongKho](
	[maCuaHang] [varchar](10) NOT NULL,
	[maLoaiXe] [varchar](10) NOT NULL,
	[soLuong] [int] NOT NULL
) ON [PRIMARY]
GO
INSERT [dbo].[ChiTietHoaDon] ([maHoaDon], [maLoaiXe], [soLuong], [donGia], [thanhTien]) VALUES (N'HD122', N'LX111', 5, 230000, 1150000)
INSERT [dbo].[ChiTietHoaDon] ([maHoaDon], [maLoaiXe], [soLuong], [donGia], [thanhTien]) VALUES (N'HD111', N'LX111', 1, 230000, 230000)
GO
INSERT [dbo].[CuaHang] ([maCuaHang], [tenCuaHang], [soDienThoai], [email], [duong], [thanhPho], [tinhTrang], [maBuuDien]) VALUES (N'CH123', N'Tân Hiệp Phát', 2234324, N'hieppha@gmail.com', N'Bùi quang là', N'Ho chi minh', N'mở cửa', 1234)
INSERT [dbo].[CuaHang] ([maCuaHang], [tenCuaHang], [soDienThoai], [email], [duong], [thanhPho], [tinhTrang], [maBuuDien]) VALUES (N'CH125', N'Tân Hiệp Thành', 123232, N'thanh@gmail.com', N'dà lạt', N'Ðà lạt', N'mở cửa', 2234)
INSERT [dbo].[CuaHang] ([maCuaHang], [tenCuaHang], [soDienThoai], [email], [duong], [thanhPho], [tinhTrang], [maBuuDien]) VALUES (N'CH127', N'Tân Hiệp Chánh', 9283442, N'chanh@gmail.com', N'vung tàu', N'Bà rịa', N'nâng cấp', 1222)
GO
INSERT [dbo].[HoaDon] ([maHoaDon], [ngayLap], [thoiGianBaoHanh], [maKhachHang], [maCuaHang], [maNhanVien]) VALUES (N'HD111', CAST(N'2022-12-12' AS Date), N'12 tháng', N'KH345', N'CH125', N'NVHC222')
INSERT [dbo].[HoaDon] ([maHoaDon], [ngayLap], [thoiGianBaoHanh], [maKhachHang], [maCuaHang], [maNhanVien]) VALUES (N'HD121', CAST(N'2022-10-20' AS Date), N'3 tháng', N'KH123', N'CH123', N'NVHC723')
INSERT [dbo].[HoaDon] ([maHoaDon], [ngayLap], [thoiGianBaoHanh], [maKhachHang], [maCuaHang], [maNhanVien]) VALUES (N'HD122', CAST(N'2023-05-13' AS Date), N'12 tháng', N'KH234', N'CH125', N'NVHC723')
GO
INSERT [dbo].[KhachHang] ([maKhachHang], [hoKhachHang], [tenKhachHang], [diaChi], [soDienThoai], [email]) VALUES (N'KH123', N'Trịnh', N'Minh Kha', N'269/67 Phan Huy Ích', 921599433, N'minhkha20031996@gmail.com')
INSERT [dbo].[KhachHang] ([maKhachHang], [hoKhachHang], [tenKhachHang], [diaChi], [soDienThoai], [email]) VALUES (N'KH234', N'Phạm', N'Văn Thành', N'206 Gò Xoài, BHHA, Bình Tân', 934004621, N'thanh13@gmail.com')
INSERT [dbo].[KhachHang] ([maKhachHang], [hoKhachHang], [tenKhachHang], [diaChi], [soDienThoai], [email]) VALUES (N'KH345', N'Đoàn', N'Phạm Bích Hợp', N'Thành phố Hồ Chí Minh', 708985897, N'bich@gmail.com')
INSERT [dbo].[KhachHang] ([maKhachHang], [hoKhachHang], [tenKhachHang], [diaChi], [soDienThoai], [email]) VALUES (N'KH346', N'Nguyễn', N'Thị Tường Vy', N'1374/1c tổ 11 khu phố 4, P.An Phú Đông, Q.12', 383068801, N'tuongvy@gmail.com')
INSERT [dbo].[KhachHang] ([maKhachHang], [hoKhachHang], [tenKhachHang], [diaChi], [soDienThoai], [email]) VALUES (N'KH347', N'Lê', N'Hữu Nam Kha', N'Thành phố Hồ Chí Minh', 936903351, N'lehuukha@gmail.com')
INSERT [dbo].[KhachHang] ([maKhachHang], [hoKhachHang], [tenKhachHang], [diaChi], [soDienThoai], [email]) VALUES (N'KH348', N'Bùi', N'Thị Thanh Tuyền', N'11/1B ấp Nam Lân Bà Điểm, Hóc Môn', 968105419, N'thanhtuyen@gmail.com')
INSERT [dbo].[KhachHang] ([maKhachHang], [hoKhachHang], [tenKhachHang], [diaChi], [soDienThoai], [email]) VALUES (N'KH349', N'Phạm', N'Hà Minh Hương', N'16C5 đường DN3, P.Tân Hưng Thuận, Q.12', 916836933, N'huong@gmail.com')
INSERT [dbo].[KhachHang] ([maKhachHang], [hoKhachHang], [tenKhachHang], [diaChi], [soDienThoai], [email]) VALUES (N'KH350', N'Hồ', N'Tuấn Ngọc', N'66 Thống Nhất, P.10, Q.Gò Vấp', 777959011, N'ngocho@gmail.com')
INSERT [dbo].[KhachHang] ([maKhachHang], [hoKhachHang], [tenKhachHang], [diaChi], [soDienThoai], [email]) VALUES (N'KH351', N'Thái', N'Doãn Hoàng An', N'220/120 đường số 10, P.9, Q.Gò Vấp', 901762781, N'anthai@gmail.com')
INSERT [dbo].[KhachHang] ([maKhachHang], [hoKhachHang], [tenKhachHang], [diaChi], [soDienThoai], [email]) VALUES (N'KH352', N'Đặng', N'Phước Tuyền', N'157/20 Phạm Văn Chiêu, P.14, Q.Gò Vấp ', 932012306, N'phuoctuyen@gmail.com')
INSERT [dbo].[KhachHang] ([maKhachHang], [hoKhachHang], [tenKhachHang], [diaChi], [soDienThoai], [email]) VALUES (N'KH353', N'Trần', N'Phương Uyên', N'47/3A Trung Lân, Bà Điểm, Hóc Môn', 797935560, N'phuonguyen@gmail.com')
INSERT [dbo].[KhachHang] ([maKhachHang], [hoKhachHang], [tenKhachHang], [diaChi], [soDienThoai], [email]) VALUES (N'KH354', N'Nguyễn', N'Thị Tuyết Nhi', N'48 Phố Mỹ Hưng, Q.7', 352215311, N'nguyennhi@gmail.com')
INSERT [dbo].[KhachHang] ([maKhachHang], [hoKhachHang], [tenKhachHang], [diaChi], [soDienThoai], [email]) VALUES (N'KH355', N'Trần', N'Tiến Đạt', N'42 Hòa Hưng, Q.3', 342010311, N'dattran@gmail.com')
GO
INSERT [dbo].[NhanVienHanhChanh] ([maNhanVien], [tenNhanVien], [diaChi], [soDienThoai], [chucVu], [email], [soNamKinhNghiem], [maCuaHang], [taiKhoan]) VALUES (N'NVHC222', N'Lê Đăng Khoa', N'50 Đinh Tiên Hoàng, Q1, TP.HCM', 350980812, N'Bán hàng', N'khoale@gmail.com', 4, N'CH125', N'123')
INSERT [dbo].[NhanVienHanhChanh] ([maNhanVien], [tenNhanVien], [diaChi], [soDienThoai], [chucVu], [email], [soNamKinhNghiem], [maCuaHang], [taiKhoan]) VALUES (N'NVHC723', N'Lê Thanh Tuấn Anh', N'50 Phan Văn Trị, Gò Vấp, TP.HCM', 362347860, N'Bán hàng', N'anhle@gmail.com', 2, N'CH125', N'123')
INSERT [dbo].[NhanVienHanhChanh] ([maNhanVien], [tenNhanVien], [diaChi], [soDienThoai], [chucVu], [email], [soNamKinhNghiem], [maCuaHang], [taiKhoan]) VALUES (N'NVHC789', N'Diệp Lâm Anh', N'Hồ chí minh', 386877499, N'Kế toán', N'lamanh@gmail.com', 3, N'CH123', N'123')
INSERT [dbo].[NhanVienHanhChanh] ([maNhanVien], [tenNhanVien], [diaChi], [soDienThoai], [chucVu], [email], [soNamKinhNghiem], [maCuaHang], [taiKhoan]) VALUES (N'NVHC790', N'Nguyễn Ngọc Anh', N'Tân Bình,TP.HCM', 957178889, N'CSKH', N'anhnguyen1213@gmail.com', 2, N'CH127', N'123')
INSERT [dbo].[NhanVienHanhChanh] ([maNhanVien], [tenNhanVien], [diaChi], [soDienThoai], [chucVu], [email], [soNamKinhNghiem], [maCuaHang], [taiKhoan]) VALUES (N'NVHC791', N'Lê Bảo Anh', N'23 Phú Mỹ Hưng quận 7,TP.HCM', 968596397, N'CSKH', N'baoanh@gmail.com', 2, N'CH123', N'123')
INSERT [dbo].[NhanVienHanhChanh] ([maNhanVien], [tenNhanVien], [diaChi], [soDienThoai], [chucVu], [email], [soNamKinhNghiem], [maCuaHang], [taiKhoan]) VALUES (N'NVHC792', N'Nguyễn Tố Ngọc Trang', N'68 Tân Kỳ Tân Qúy, TP. HCM', 973626737, N'Bán hàng', N'trangnguyen121@gmail.com', 3, N'CH127', N'123')
INSERT [dbo].[NhanVienHanhChanh] ([maNhanVien], [tenNhanVien], [diaChi], [soDienThoai], [chucVu], [email], [soNamKinhNghiem], [maCuaHang], [taiKhoan]) VALUES (N'NVHC793', N'Nguyễn Đình Thái Ngân', N'123 Trần Quốc Thảo quận  3,TP.HCM', 362033036, N'Kế toán', N'thaingan@gmail.com', 1, N'CH127', N'123')
INSERT [dbo].[NhanVienHanhChanh] ([maNhanVien], [tenNhanVien], [diaChi], [soDienThoai], [chucVu], [email], [soNamKinhNghiem], [maCuaHang], [taiKhoan]) VALUES (N'NVHC794', N'Trần Anh Khoa', N'867 Quang Trung, Gò Vấp, TP.HCM', 978047896, N'Bán hàng', N'anhkhoa@gmail.com', 6, N'CH123', N'123')
INSERT [dbo].[NhanVienHanhChanh] ([maNhanVien], [tenNhanVien], [diaChi], [soDienThoai], [chucVu], [email], [soNamKinhNghiem], [maCuaHang], [taiKhoan]) VALUES (N'NVHC795', N'Nguyễn Thu Phương', N'15 Nguyễn Kiệm, Q.Gò Vấp', 938135702, N'CSKH', N'phuongnguyen1234@gmail.com', 3, N'CH125', N'123')
GO
INSERT [dbo].[NhanVienKiThuat] ([maNhanVien], [tenNhanVien], [soDienThoai], [email], [bacTho], [chucVu], [soNamKinhNghiem], [diaChi], [maCuaHang], [taiKhoan]) VALUES (N'NVKT011', N'Lê Quang Vinh', 938135702, N'vinh@gmail.com', N'thợ phụ', N'nhân viên kiểm xe', 4, N'60 Thống Nhất, p10, Q.Gò Vấp', N'CH123', N'121')
INSERT [dbo].[NhanVienKiThuat] ([maNhanVien], [tenNhanVien], [soDienThoai], [email], [bacTho], [chucVu], [soNamKinhNghiem], [diaChi], [maCuaHang], [taiKhoan]) VALUES (N'NVKT014', N'Trần Ðức Ðộ', 777610987, N'do@gmail.com', N'thợ chính', N'nhân viên sửa xe', 6, N'34 Nguyễn Văn Linh, Q.7', N'CH125', N'121')
INSERT [dbo].[NhanVienKiThuat] ([maNhanVien], [tenNhanVien], [soDienThoai], [email], [bacTho], [chucVu], [soNamKinhNghiem], [diaChi], [maCuaHang], [taiKhoan]) VALUES (N'NVKT015', N'Lê Tông', 944302210, N'tong@gmail.com', N'thợ chính', N'nhân viên sửa xe', 3, N'15 Nguyễn Kiệm, Q.Gò Vấp', N'CH123', N'121')
INSERT [dbo].[NhanVienKiThuat] ([maNhanVien], [tenNhanVien], [soDienThoai], [email], [bacTho], [chucVu], [soNamKinhNghiem], [diaChi], [maCuaHang], [taiKhoan]) VALUES (N'NVKT016', N'Phạm Vũ Hoài An', 966105479, N'an@gmail.com', N'thợ phụ', N'nhân viên kiểm xe', 1, N'60 Thống Nhất, p10, Q.Gò Vấp', N'CH127', N'121')
INSERT [dbo].[NhanVienKiThuat] ([maNhanVien], [tenNhanVien], [soDienThoai], [email], [bacTho], [chucVu], [soNamKinhNghiem], [diaChi], [maCuaHang], [taiKhoan]) VALUES (N'NVKT017', N'Nguyễn Thanh Toàn', 777610987, N'thnhtoan16234@gmail.com', N'thợ phụ', N'nhân viên sửa xe', 2, N'53 thống nhất, P11, gò vấp, TP. HCM', N'CH125', N'121')
INSERT [dbo].[NhanVienKiThuat] ([maNhanVien], [tenNhanVien], [soDienThoai], [email], [bacTho], [chucVu], [soNamKinhNghiem], [diaChi], [maCuaHang], [taiKhoan]) VALUES (N'NVKT018', N'Quang Tuấn', 944302210, N'qtuan@gmail.com', N'thợ chính', N'nhân viên sửa xe', 6, N'118 Hoàng Văn Thụ, Q.Phú Nhuận', N'CH127', N'121')
INSERT [dbo].[NhanVienKiThuat] ([maNhanVien], [tenNhanVien], [soDienThoai], [email], [bacTho], [chucVu], [soNamKinhNghiem], [diaChi], [maCuaHang], [taiKhoan]) VALUES (N'NVKT019', N'Phan Hữu Trọng', 363435019, N'phantrong@gmail.com', N'thợ chính', N'nhân viên sửa xe', 3, N'12 Nguyễn Văn Bảo, Gò Vấp, HCM', N'CH125', N'121')
GO
INSERT [dbo].[NhaPhanPhoi] ([maNhaPhanPhoi], [tenNhaPhanPhoi], [diaChi], [soDienThoai], [email]) VALUES (N'NPP111', N'Yamaha', N'Hồ chí minh', 18001588, N'yamaha@gmail.com')
INSERT [dbo].[NhaPhanPhoi] ([maNhaPhanPhoi], [tenNhaPhanPhoi], [diaChi], [soDienThoai], [email]) VALUES (N'NPP222', N'Honda', N'Hồ chí minh', 18000001, N'honda@gmail.com')
INSERT [dbo].[NhaPhanPhoi] ([maNhaPhanPhoi], [tenNhaPhanPhoi], [diaChi], [soDienThoai], [email]) VALUES (N'NPP223', N'Suzuki', N'Hồ chí minh', 18001534, N'suzuki@gmail.com')
GO
INSERT [dbo].[PhieuNhanXet] ([maPhieu], [liDoBaoHanh], [loiThuocVe], [giaTien], [linhKien], [maKhachHang], [maNhanVien]) VALUES (N'MP123', N'Hu chân chóng', N'khách hàng', 123000, N'Chân chóng', N'KH123', N'NVKT011')
INSERT [dbo].[PhieuNhanXet] ([maPhieu], [liDoBaoHanh], [loiThuocVe], [giaTien], [linhKien], [maKhachHang], [maNhanVien]) VALUES (N'MP129', N'Hu yên xe', N'Xe', 222000, N'yên xe', N'KH234', N'NVKT014')
GO
INSERT [dbo].[TaiKhoan] ([taiKhoan], [matKhau]) VALUES (N'121', N'1212')
INSERT [dbo].[TaiKhoan] ([taiKhoan], [matKhau]) VALUES (N'123', N'1234')
GO
INSERT [dbo].[ThongTinXe] ([maLoaiXe], [tenLoaiXe], [giaNiemYet], [giaGiam], [moTaXe], [phienBan]) VALUES (N'LX012', N'Exciter 150', 47100000, 0, N'bản RC Đen', N'2023')
INSERT [dbo].[ThongTinXe] ([maLoaiXe], [tenLoaiXe], [giaNiemYet], [giaGiam], [moTaXe], [phienBan]) VALUES (N'LX111', N'Win150', 45990000, 500000, N'Winner cao cấp màu đen nhám', N'2022')
INSERT [dbo].[ThongTinXe] ([maLoaiXe], [tenLoaiXe], [giaNiemYet], [giaGiam], [moTaXe], [phienBan]) VALUES (N'LX112', N'Blade 2023', 19250000, 0, N'Honda Blade 2023 là sự kết hợp hoàn hảo giữa phong cách thể thao khỏe khoắn cùng với thiết kế gọn gàng tiện lợi', N'Phiên bản 2023')
INSERT [dbo].[ThongTinXe] ([maLoaiXe], [tenLoaiXe], [giaNiemYet], [giaGiam], [moTaXe], [phienBan]) VALUES (N'LX113', N'Exciter 155', 50000000, 0, N'bản RC Đen mới nhất', N'Phiên bản 2023')
INSERT [dbo].[ThongTinXe] ([maLoaiXe], [tenLoaiXe], [giaNiemYet], [giaGiam], [moTaXe], [phienBan]) VALUES (N'LX114', N'Future 125 FI', 31090000, 0, N'Honda Future 125 FI với thiết kế trẻ trung, lịch lãm và hiện đại được bổ sung màu mới', N'2022')
INSERT [dbo].[ThongTinXe] ([maLoaiXe], [tenLoaiXe], [giaNiemYet], [giaGiam], [moTaXe], [phienBan]) VALUES (N'LX115', N'Wave Alpha 110cc', 18190000, 0, N'Wave Alpha phiên bản 2023 trẻ trung và năng động với màu đen mờ hoàn toàn mới cùng thiết kế bộ tem mới ấn tượng', N'2022')
INSERT [dbo].[ThongTinXe] ([maLoaiXe], [tenLoaiXe], [giaNiemYet], [giaGiam], [moTaXe], [phienBan]) VALUES (N'LX116', N'Super Cub C125', 87890000, 0, N'Thiết kế cổ điển, thanh lịch đậm chất Super CUB', N'2023')
INSERT [dbo].[ThongTinXe] ([maLoaiXe], [tenLoaiXe], [giaNiemYet], [giaGiam], [moTaXe], [phienBan]) VALUES (N'LX117', N'Sh mode 125cc', 58190000, 1000000, N'4 phiên bản với màu sắc đa dạng

', N'2023')
INSERT [dbo].[ThongTinXe] ([maLoaiXe], [tenLoaiXe], [giaNiemYet], [giaGiam], [moTaXe], [phienBan]) VALUES (N'LX118', N'Vision', 31690000, 1000000, N'Thuộc phân khúc xe tay ga phổ thông', N'2023')
INSERT [dbo].[ThongTinXe] ([maLoaiXe], [tenLoaiXe], [giaNiemYet], [giaGiam], [moTaXe], [phienBan]) VALUES (N'LX119', N'Honda VARIO 160', 51990000, 200000, N'với thiết kế của mẫu xe ga thể thao độc đáo', N'2022')
INSERT [dbo].[ThongTinXe] ([maLoaiXe], [tenLoaiXe], [giaNiemYet], [giaGiam], [moTaXe], [phienBan]) VALUES (N'LX120', N'LEAD 125cc', 40290000, 5000000, N'Kế thừa ngôn ngữ thiết kế hiện đại', N'2023')
GO
INSERT [dbo].[Xe] ([maXe], [soMay], [soKhung], [ngayNhapXe], [maNhaPhanPhoi], [maLoaiXe]) VALUES (N'X012', N'G123N75M', N'1YM145', CAST(N'2019-10-10' AS Date), N'NPP111', N'LX012')
INSERT [dbo].[Xe] ([maXe], [soMay], [soKhung], [ngayNhapXe], [maNhaPhanPhoi], [maLoaiXe]) VALUES (N'X344', N'HF3E4VV5', N'YG3489', CAST(N'2022-05-09' AS Date), N'NPP222', N'LX012')
INSERT [dbo].[Xe] ([maXe], [soMay], [soKhung], [ngayNhapXe], [maNhaPhanPhoi], [maLoaiXe]) VALUES (N'X345', N'H23U5VW5', N'FH378S', CAST(N'2023-05-12' AS Date), N'NPP111', N'LX112')
INSERT [dbo].[Xe] ([maXe], [soMay], [soKhung], [ngayNhapXe], [maNhaPhanPhoi], [maLoaiXe]) VALUES (N'X346', N'H23WYW5', N'T3JNHG', CAST(N'2023-05-12' AS Date), N'NPP111', N'LX112')
INSERT [dbo].[Xe] ([maXe], [soMay], [soKhung], [ngayNhapXe], [maNhaPhanPhoi], [maLoaiXe]) VALUES (N'X347', N'H23WVTW5', N'T3Q2HG53', CAST(N'2023-01-02' AS Date), N'NPP223', N'LX120')
INSERT [dbo].[Xe] ([maXe], [soMay], [soKhung], [ngayNhapXe], [maNhaPhanPhoi], [maLoaiXe]) VALUES (N'X348', N'H23WV5V5', N'TV5V5G53', CAST(N'2022-01-04' AS Date), N'NPP222', N'LX119')
INSERT [dbo].[Xe] ([maXe], [soMay], [soKhung], [ngayNhapXe], [maNhaPhanPhoi], [maLoaiXe]) VALUES (N'X349', N'3VT3BYYT', N'V5TV6V5T', CAST(N'2022-06-25' AS Date), N'NPP111', N'LX118')
INSERT [dbo].[Xe] ([maXe], [soMay], [soKhung], [ngayNhapXe], [maNhaPhanPhoi], [maLoaiXe]) VALUES (N'X350', N'35Y53Y35', N'34TV3YV5', CAST(N'2022-06-02' AS Date), N'NPP223', N'LX117')
INSERT [dbo].[Xe] ([maXe], [soMay], [soKhung], [ngayNhapXe], [maNhaPhanPhoi], [maLoaiXe]) VALUES (N'X351', N'STHTHJJH', N'55YVG44T', CAST(N'2022-02-16' AS Date), N'NPP111', N'LX116')
INSERT [dbo].[Xe] ([maXe], [soMay], [soKhung], [ngayNhapXe], [maNhaPhanPhoi], [maLoaiXe]) VALUES (N'X352', N'55YB53B5Y', N'E5YVW5W', CAST(N'2022-02-27' AS Date), N'NPP111', N'LX115')
INSERT [dbo].[Xe] ([maXe], [soMay], [soKhung], [ngayNhapXe], [maNhaPhanPhoi], [maLoaiXe]) VALUES (N'X353', N'E6UE6NU', N'6NUE6U66', CAST(N'2022-02-10' AS Date), N'NPP222', N'LX111')
INSERT [dbo].[Xe] ([maXe], [soMay], [soKhung], [ngayNhapXe], [maNhaPhanPhoi], [maLoaiXe]) VALUES (N'X354', N'E6UE56U6', N'E6UE6U6', CAST(N'2022-02-10' AS Date), N'NPP223', N'LX113')
INSERT [dbo].[Xe] ([maXe], [soMay], [soKhung], [ngayNhapXe], [maNhaPhanPhoi], [maLoaiXe]) VALUES (N'X355', N'E6UE56U6', N'E6UE6U6', CAST(N'2022-02-10' AS Date), N'NPP223', N'LX113')
INSERT [dbo].[Xe] ([maXe], [soMay], [soKhung], [ngayNhapXe], [maNhaPhanPhoi], [maLoaiXe]) VALUES (N'X356', N'W574677Y', N'5EYE5BJJ', CAST(N'2022-06-10' AS Date), N'NPP223', N'LX114')
GO
INSERT [dbo].[XeTrongKho] ([maCuaHang], [maLoaiXe], [soLuong]) VALUES (N'CH125', N'LX111', 55)
GO
ALTER TABLE [dbo].[ChiTietHoaDon]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietHoaDon_HoaDon] FOREIGN KEY([maHoaDon])
REFERENCES [dbo].[HoaDon] ([maHoaDon])
GO
ALTER TABLE [dbo].[ChiTietHoaDon] CHECK CONSTRAINT [FK_ChiTietHoaDon_HoaDon]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FKHoaDon367914] FOREIGN KEY([maNhanVien])
REFERENCES [dbo].[NhanVienHanhChanh] ([maNhanVien])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FKHoaDon367914]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FKHoaDon457563] FOREIGN KEY([maCuaHang])
REFERENCES [dbo].[CuaHang] ([maCuaHang])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FKHoaDon457563]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FKHoaDon550538] FOREIGN KEY([maKhachHang])
REFERENCES [dbo].[KhachHang] ([maKhachHang])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FKHoaDon550538]
GO
ALTER TABLE [dbo].[NhanVienHanhChanh]  WITH CHECK ADD  CONSTRAINT [FKNhanVienHa869067] FOREIGN KEY([maCuaHang])
REFERENCES [dbo].[CuaHang] ([maCuaHang])
GO
ALTER TABLE [dbo].[NhanVienHanhChanh] CHECK CONSTRAINT [FKNhanVienHa869067]
GO
ALTER TABLE [dbo].[NhanVienHanhChanh]  WITH CHECK ADD  CONSTRAINT [FKNhanVienHa895784] FOREIGN KEY([taiKhoan])
REFERENCES [dbo].[TaiKhoan] ([taiKhoan])
GO
ALTER TABLE [dbo].[NhanVienHanhChanh] CHECK CONSTRAINT [FKNhanVienHa895784]
GO
ALTER TABLE [dbo].[NhanVienKiThuat]  WITH CHECK ADD  CONSTRAINT [FKNhanVienKi408171] FOREIGN KEY([maCuaHang])
REFERENCES [dbo].[CuaHang] ([maCuaHang])
GO
ALTER TABLE [dbo].[NhanVienKiThuat] CHECK CONSTRAINT [FKNhanVienKi408171]
GO
ALTER TABLE [dbo].[NhanVienKiThuat]  WITH CHECK ADD  CONSTRAINT [FKNhanVienKi798566] FOREIGN KEY([taiKhoan])
REFERENCES [dbo].[TaiKhoan] ([taiKhoan])
GO
ALTER TABLE [dbo].[NhanVienKiThuat] CHECK CONSTRAINT [FKNhanVienKi798566]
GO
ALTER TABLE [dbo].[PhieuNhanXet]  WITH CHECK ADD  CONSTRAINT [FKPhieuNhanX421077] FOREIGN KEY([maNhanVien])
REFERENCES [dbo].[NhanVienKiThuat] ([maNhanVien])
GO
ALTER TABLE [dbo].[PhieuNhanXet] CHECK CONSTRAINT [FKPhieuNhanX421077]
GO
ALTER TABLE [dbo].[PhieuNhanXet]  WITH CHECK ADD  CONSTRAINT [FKPhieuNhanX803023] FOREIGN KEY([maKhachHang])
REFERENCES [dbo].[KhachHang] ([maKhachHang])
GO
ALTER TABLE [dbo].[PhieuNhanXet] CHECK CONSTRAINT [FKPhieuNhanX803023]
GO
ALTER TABLE [dbo].[Xe]  WITH CHECK ADD  CONSTRAINT [Phân phối] FOREIGN KEY([maNhaPhanPhoi])
REFERENCES [dbo].[NhaPhanPhoi] ([maNhaPhanPhoi])
GO
ALTER TABLE [dbo].[Xe] CHECK CONSTRAINT [Phân phối]
GO
ALTER TABLE [dbo].[Xe]  WITH CHECK ADD  CONSTRAINT [Thuộc] FOREIGN KEY([maLoaiXe])
REFERENCES [dbo].[ThongTinXe] ([maLoaiXe])
GO
ALTER TABLE [dbo].[Xe] CHECK CONSTRAINT [Thuộc]
GO
ALTER TABLE [dbo].[XeTrongKho]  WITH CHECK ADD  CONSTRAINT [FK_CuaHang_XeTrongKho] FOREIGN KEY([maCuaHang])
REFERENCES [dbo].[CuaHang] ([maCuaHang])
GO
ALTER TABLE [dbo].[XeTrongKho] CHECK CONSTRAINT [FK_CuaHang_XeTrongKho]
GO
ALTER TABLE [dbo].[XeTrongKho]  WITH CHECK ADD  CONSTRAINT [FK_ThongTinXe_XeTrongKho] FOREIGN KEY([maLoaiXe])
REFERENCES [dbo].[ThongTinXe] ([maLoaiXe])
GO
ALTER TABLE [dbo].[XeTrongKho] CHECK CONSTRAINT [FK_ThongTinXe_XeTrongKho]
GO
USE [master]
GO
ALTER DATABASE [BikeStores] SET  READ_WRITE 
GO
