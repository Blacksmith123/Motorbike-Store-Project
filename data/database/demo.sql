USE [master]
GO
/****** Object:  Database [BikeStores]    Script Date: 5/6/2023 10:36:35 PM ******/
CREATE DATABASE [BikeStores]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'BikeStores', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.SQLEXPRESS\MSSQL\DATA\BikeStores.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'BikeStores_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.SQLEXPRESS\MSSQL\DATA\BikeStores_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
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
/****** Object:  Table [dbo].[ChiTietHoaDon]    Script Date: 5/6/2023 10:36:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChiTietHoaDon](
	[maHoaDon] [varchar](10) NOT NULL,
	[maLoaiXe] [varchar](10) NOT NULL,
	[soLuong] [int] NOT NULL,
	[thanhTien] [int] NOT NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[CuaHang]    Script Date: 5/6/2023 10:36:35 PM ******/
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
/****** Object:  Table [dbo].[HoaDon]    Script Date: 5/6/2023 10:36:35 PM ******/
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
/****** Object:  Table [dbo].[KhachHang]    Script Date: 5/6/2023 10:36:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhachHang](
	[maKhachHang] [varchar](10) NOT NULL,
	[hoKhachHang] [nvarchar](30) NOT NULL,
	[tenKhachHang] [nvarchar](10) NOT NULL,
	[diaChi] [nvarchar](50) NOT NULL,
	[soDienThoaii] [int] NOT NULL,
	[email] [nvarchar](40) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[maKhachHang] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhanVienHanhChanh]    Script Date: 5/6/2023 10:36:35 PM ******/
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
/****** Object:  Table [dbo].[NhanVienKiThuat]    Script Date: 5/6/2023 10:36:35 PM ******/
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
/****** Object:  Table [dbo].[NhaPhanPhoi]    Script Date: 5/6/2023 10:36:35 PM ******/
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
/****** Object:  Table [dbo].[PhieuNhanXet]    Script Date: 5/6/2023 10:36:35 PM ******/
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
/****** Object:  Table [dbo].[TaiKhoan]    Script Date: 5/6/2023 10:36:35 PM ******/
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
/****** Object:  Table [dbo].[ThongTinXe]    Script Date: 5/6/2023 10:36:35 PM ******/
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
/****** Object:  Table [dbo].[XE]    Script Date: 5/6/2023 10:36:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[XE](
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
/****** Object:  Table [dbo].[XeTrongKho]    Script Date: 5/6/2023 10:36:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[XeTrongKho](
	[maCuaHang] [varchar](10) NOT NULL,
	[maXe] [varchar](10) NOT NULL,
	[soLuong] [int] NOT NULL
) ON [PRIMARY]
GO
INSERT [dbo].[ChiTietHoaDon] ([maHoaDon], [maLoaiXe], [soLuong], [thanhTien]) VALUES (N'KYM121', N'YN12', 12, 480000)
INSERT [dbo].[ChiTietHoaDon] ([maHoaDon], [maLoaiXe], [soLuong], [thanhTien]) VALUES (N'KYM121', N'HD111', 1, 230000)
INSERT [dbo].[ChiTietHoaDon] ([maHoaDon], [maLoaiXe], [soLuong], [thanhTien]) VALUES (N'THD111', N'HD111', 1, 230000)
GO
INSERT [dbo].[CuaHang] ([maCuaHang], [tenCuaHang], [soDienThoai], [email], [duong], [thanhPho], [tinhTrang], [maBuuDien]) VALUES (N'CH123', N'Tân Hiệp Phát', 2234324, N'hieppha@gmail.com', N'Bùi quang là', N'Ho chi minh', N'mở cửa', 1234)
INSERT [dbo].[CuaHang] ([maCuaHang], [tenCuaHang], [soDienThoai], [email], [duong], [thanhPho], [tinhTrang], [maBuuDien]) VALUES (N'CH125', N'Tân Hiệp Thành', 123232, N'thanh@gmail.com', N'dà lạt', N'Ðà lạt', N'mở cửa', 2234)
INSERT [dbo].[CuaHang] ([maCuaHang], [tenCuaHang], [soDienThoai], [email], [duong], [thanhPho], [tinhTrang], [maBuuDien]) VALUES (N'CH127', N'Tân Hiệp Chánh', 9283442, N'chanh@gmail.com', N'vung tàu', N'Bà rịa', N'nâng cấp', 1222)
GO
INSERT [dbo].[HoaDon] ([maHoaDon], [ngayLap], [thoiGianBaoHanh], [maKhachHang], [maCuaHang], [maNhanVien]) VALUES (N'KYM121', NULL, N'3 tháng', N'N123', N'CH123', N'NV723')
INSERT [dbo].[HoaDon] ([maHoaDon], [ngayLap], [thoiGianBaoHanh], [maKhachHang], [maCuaHang], [maNhanVien]) VALUES (N'THD111', NULL, N'12 tháng', N'N345', N'CH125', N'NV222')
GO
INSERT [dbo].[KhachHang] ([maKhachHang], [hoKhachHang], [tenKhachHang], [diaChi], [soDienThoaii], [email]) VALUES (N'N123', N'Trịnh', N'Minh Kha', N'269/67 Phan Huy Ích', 921599432, N'minhkha20031996@gmail.com')
INSERT [dbo].[KhachHang] ([maKhachHang], [hoKhachHang], [tenKhachHang], [diaChi], [soDienThoaii], [email]) VALUES (N'N234', N'Phạm ', N'Van Thành', N'Đh công nghiệp', 9234134, N'thanh123@gmail.com')
INSERT [dbo].[KhachHang] ([maKhachHang], [hoKhachHang], [tenKhachHang], [diaChi], [soDienThoaii], [email]) VALUES (N'N345', N'Trần ', N'Van Tèo', N'Thành phố Hồ Chí Minh', 92344421, N'teocuto@gmail.com')
GO
INSERT [dbo].[NhanVienHanhChanh] ([maNhanVien], [tenNhanVien], [diaChi], [soDienThoai], [chucVu], [email], [soNamKinhNghiem], [maCuaHang], [taiKhoan]) VALUES (N'NV222', N'Trần Van C', N'Hồ Chí Minh', 45554, N'Bán hàng', N'cc@gmail.com', 4, N'CH125', N'123')
INSERT [dbo].[NhanVienHanhChanh] ([maNhanVien], [tenNhanVien], [diaChi], [soDienThoai], [chucVu], [email], [soNamKinhNghiem], [maCuaHang], [taiKhoan]) VALUES (N'NV723', N'Trần Van B', N'Vung tàu', 1122456, N'Bán hàng', N'Bb@gmail.com', 2, N'CH125', N'123')
INSERT [dbo].[NhanVienHanhChanh] ([maNhanVien], [tenNhanVien], [diaChi], [soDienThoai], [chucVu], [email], [soNamKinhNghiem], [maCuaHang], [taiKhoan]) VALUES (N'NV789', N'Trần Van A', N'Hồ chí minh', 221133, N'Kế toán', N'aa@gmail.com', 3, N'CH123', N'123')
GO
INSERT [dbo].[NhanVienKiThuat] ([maNhanVien], [tenNhanVien], [soDienThoai], [email], [bacTho], [chucVu], [soNamKinhNghiem], [diaChi], [maCuaHang], [taiKhoan]) VALUES (N'NV11', N'Lê Quang Vinh', 123111, N'vinhcuto@gmail.com', N'thợ phụ', N'nhân viên kiểm xe', 4, N'cầu thị nghè', N'CH123', N'121')
INSERT [dbo].[NhanVienKiThuat] ([maNhanVien], [tenNhanVien], [soDienThoai], [email], [bacTho], [chucVu], [soNamKinhNghiem], [diaChi], [maCuaHang], [taiKhoan]) VALUES (N'NV14', N'Trần Ðức Ðộ', 912344, N'docunho@gmail.com', N'thợ chính', N'nhân viên sửa xe', 6, N'chợ bà chiểu', N'CH125', N'121')
INSERT [dbo].[NhanVienKiThuat] ([maNhanVien], [tenNhanVien], [soDienThoai], [email], [bacTho], [chucVu], [soNamKinhNghiem], [diaChi], [maCuaHang], [taiKhoan]) VALUES (N'NV15', N'Lê Tông', 123455, N'tong@gmail.com', N'thợ chính', N'nhân viên sửa xe', 3, N'gầm cầu', N'CH123', N'121')
GO
INSERT [dbo].[NhaPhanPhoi] ([maNhaPhanPhoi], [tenNhaPhanPhoi], [diaChi], [soDienThoai], [email]) VALUES (N'111', N'Yamaha', N'Hồ chí minh', 99999, N'mahaahaa@gmail.com')
INSERT [dbo].[NhaPhanPhoi] ([maNhaPhanPhoi], [tenNhaPhanPhoi], [diaChi], [soDienThoai], [email]) VALUES (N'222', N'Honda', N'Hồ chí minh', 88888, N'hoooda@gmail.com')
GO
INSERT [dbo].[PhieuNhanXet] ([maPhieu], [liDoBaoHanh], [loiThuocVe], [giaTien], [linhKien], [maKhachHang], [maNhanVien]) VALUES (N'123', N'Hu chân chóng', N'khách hàng', 123000, N'Chân chóng', N'N123', N'NV11')
INSERT [dbo].[PhieuNhanXet] ([maPhieu], [liDoBaoHanh], [loiThuocVe], [giaTien], [linhKien], [maKhachHang], [maNhanVien]) VALUES (N'129', N'Hu yên xe', N'Xe', 222000, N'yên xe', N'N234', N'NV14')
GO
INSERT [dbo].[TaiKhoan] ([taiKhoan], [matKhau]) VALUES (N'121', N'1212')
INSERT [dbo].[TaiKhoan] ([taiKhoan], [matKhau]) VALUES (N'123', N'1234')
GO
INSERT [dbo].[ThongTinXe] ([maLoaiXe], [tenLoaiXe], [giaNiemYet], [giaGiam], [moTaXe], [phienBan]) VALUES (N'HD111', N'Win150', 230000, 20000, N'Xe bô ngon', N'2022')
INSERT [dbo].[ThongTinXe] ([maLoaiXe], [tenLoaiXe], [giaNiemYet], [giaGiam], [moTaXe], [phienBan]) VALUES (N'YN12', N'Ex150', 400000, 0, N'Xe ngon', N'2023')
GO
INSERT [dbo].[XE] ([maXe], [soMay], [soKhung], [ngayNhapXe], [maNhaPhanPhoi], [maLoaiXe]) VALUES (N'HD342', N'F12', N'1HD344', NULL, N'222', N'HD111')
INSERT [dbo].[XE] ([maXe], [soMay], [soKhung], [ngayNhapXe], [maNhaPhanPhoi], [maLoaiXe]) VALUES (N'YMHCM12', N'G123', N'1YM123', NULL, N'111', N'YN12')
GO
INSERT [dbo].[XeTrongKho] ([maCuaHang], [maXe], [soLuong]) VALUES (N'CH123', N'YMHCM12', 23)
INSERT [dbo].[XeTrongKho] ([maCuaHang], [maXe], [soLuong]) VALUES (N'CH125', N'HD342', 55)
GO
ALTER TABLE [dbo].[ChiTietHoaDon]  WITH CHECK ADD  CONSTRAINT [FK_maLoaiXe] FOREIGN KEY([maLoaiXe])
REFERENCES [dbo].[ThongTinXe] ([maLoaiXe])
GO
ALTER TABLE [dbo].[ChiTietHoaDon] CHECK CONSTRAINT [FK_maLoaiXe]
GO
ALTER TABLE [dbo].[ChiTietHoaDon]  WITH CHECK ADD  CONSTRAINT [FKChiTietHoa903135] FOREIGN KEY([maHoaDon])
REFERENCES [dbo].[HoaDon] ([maHoaDon])
GO
ALTER TABLE [dbo].[ChiTietHoaDon] CHECK CONSTRAINT [FKChiTietHoa903135]
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
ALTER TABLE [dbo].[XE]  WITH CHECK ADD  CONSTRAINT [Phân phối] FOREIGN KEY([maNhaPhanPhoi])
REFERENCES [dbo].[NhaPhanPhoi] ([maNhaPhanPhoi])
GO
ALTER TABLE [dbo].[XE] CHECK CONSTRAINT [Phân phối]
GO
ALTER TABLE [dbo].[XE]  WITH CHECK ADD  CONSTRAINT [Thuộc] FOREIGN KEY([maLoaiXe])
REFERENCES [dbo].[ThongTinXe] ([maLoaiXe])
GO
ALTER TABLE [dbo].[XE] CHECK CONSTRAINT [Thuộc]
GO
ALTER TABLE [dbo].[XeTrongKho]  WITH CHECK ADD  CONSTRAINT [FKXeTrongKho869282] FOREIGN KEY([maXe])
REFERENCES [dbo].[XE] ([maXe])
GO
ALTER TABLE [dbo].[XeTrongKho] CHECK CONSTRAINT [FKXeTrongKho869282]
GO
ALTER TABLE [dbo].[XeTrongKho]  WITH CHECK ADD  CONSTRAINT [FKXeTrongKho955490] FOREIGN KEY([maCuaHang])
REFERENCES [dbo].[CuaHang] ([maCuaHang])
GO
ALTER TABLE [dbo].[XeTrongKho] CHECK CONSTRAINT [FKXeTrongKho955490]
GO
USE [master]
GO
ALTER DATABASE [BikeStores] SET  READ_WRITE 
GO
