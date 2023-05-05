USE [master]
GO
/****** Object:  Database [BikeStores]    Script Date: 05/05/2023 21:03:07 ******/
CREATE DATABASE [BikeStores]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'BikeStores', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL16.MSSQLSERVER\MSSQL\DATA\BikeStores.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'BikeStores_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL16.MSSQLSERVER\MSSQL\DATA\BikeStores.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
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
/****** Object:  Table [dbo].[CuaHang]    Script Date: 05/05/2023 21:03:07 ******/
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
/****** Object:  Table [dbo].[HoaDon]    Script Date: 05/05/2023 21:03:07 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDon](
	[maHoaDon] [varchar](10) NOT NULL,
	[ngayLap] [date] NULL,
	[thoiGianBaoHanh] [nvarchar](30) NOT NULL,
	[donGia] [int] NOT NULL,
	[soLuong] [int] NOT NULL,
	[maKhachHang] [varchar](10) NOT NULL,
	[maCuaHang] [varchar](10) NOT NULL,
	[maNhanVien] [varchar](10) NOT NULL,
	[maXe] [varchar](10) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[maHoaDon] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KhachHang]    Script Date: 05/05/2023 21:03:07 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhachHang](
	[maKhachHang] [varchar](10) NOT NULL,
	[hoKhachHang] [nvarchar](30) NOT NULL,
	[tenKhachHang] [nvarchar](10) NOT NULL,
	[diaChi] [nvarchar](50) NOT NULL,
	[soDienThoai] [int] NOT NULL,
	[email] [nvarchar](40) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[maKhachHang] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhanVienHanhChanh]    Script Date: 05/05/2023 21:03:07 ******/
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
	[taiKhoan] [nvarchar](50) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[maNhanVien] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhanVienKyThuat]    Script Date: 05/05/2023 21:03:07 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanVienKyThuat](
	[maNhanVien] [varchar](10) NOT NULL,
	[tenNhanVien] [nvarchar](30) NOT NULL,
	[soDienThoai] [int] NOT NULL,
	[email] [nvarchar](40) NOT NULL,
	[bacTho] [nvarchar](10) NOT NULL,
	[chucVu] [nvarchar](20) NOT NULL,
	[soNamKinhNghiem] [int] NOT NULL,
	[diaChi] [nvarchar](50) NOT NULL,
	[maCuaHang] [varchar](10) NOT NULL,
	[taiKhoan] [nvarchar](50) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[maNhanVien] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhaPhanPhoi]    Script Date: 05/05/2023 21:03:07 ******/
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
/****** Object:  Table [dbo].[PhieuNhanXet]    Script Date: 05/05/2023 21:03:07 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PhieuNhanXet](
	[maPhieu] [varchar](10) NOT NULL,
	[lyDoBaoHanh] [nvarchar](50) NOT NULL,
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
/****** Object:  Table [dbo].[TaiKhoan]    Script Date: 05/05/2023 21:03:07 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TaiKhoan](
	[maTK] [nvarchar](50) NOT NULL,
	[matKhau] [nvarchar](255) NOT NULL,
 CONSTRAINT [PK_TaiKhoan] PRIMARY KEY CLUSTERED 
(
	[maTK] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ThongTinXe]    Script Date: 05/05/2023 21:03:07 ******/
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
/****** Object:  Table [dbo].[Xe]    Script Date: 05/05/2023 21:03:07 ******/
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
/****** Object:  Table [dbo].[XeTrongKho]    Script Date: 05/05/2023 21:03:07 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[XeTrongKho](
	[maCuaHang] [varchar](10) NOT NULL,
	[maXe] [varchar](10) NOT NULL,
	[soLuong] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[maCuaHang] ASC,
	[maXe] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [Có] FOREIGN KEY([maXe])
REFERENCES [dbo].[Xe] ([maXe])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [Có]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FKHoaDon431152] FOREIGN KEY([maKhachHang])
REFERENCES [dbo].[KhachHang] ([maKhachHang])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FKHoaDon431152]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FKHoaDon440981] FOREIGN KEY([maCuaHang])
REFERENCES [dbo].[CuaHang] ([maCuaHang])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FKHoaDon440981]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FKHoaDon706841] FOREIGN KEY([maNhanVien])
REFERENCES [dbo].[NhanVienHanhChanh] ([maNhanVien])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FKHoaDon706841]
GO
ALTER TABLE [dbo].[NhanVienHanhChanh]  WITH CHECK ADD  CONSTRAINT [FK_NhanVienHanhChanh_TaiKhoan] FOREIGN KEY([taiKhoan])
REFERENCES [dbo].[TaiKhoan] ([maTK])
GO
ALTER TABLE [dbo].[NhanVienHanhChanh] CHECK CONSTRAINT [FK_NhanVienHanhChanh_TaiKhoan]
GO
ALTER TABLE [dbo].[NhanVienHanhChanh]  WITH CHECK ADD  CONSTRAINT [FKNhân Viên 619153] FOREIGN KEY([maCuaHang])
REFERENCES [dbo].[CuaHang] ([maCuaHang])
GO
ALTER TABLE [dbo].[NhanVienHanhChanh] CHECK CONSTRAINT [FKNhân Viên 619153]
GO
ALTER TABLE [dbo].[NhanVienKyThuat]  WITH CHECK ADD  CONSTRAINT [FK_NhanVienKyThuat_TaiKhoan] FOREIGN KEY([taiKhoan])
REFERENCES [dbo].[TaiKhoan] ([maTK])
GO
ALTER TABLE [dbo].[NhanVienKyThuat] CHECK CONSTRAINT [FK_NhanVienKyThuat_TaiKhoan]
GO
ALTER TABLE [dbo].[NhanVienKyThuat]  WITH CHECK ADD  CONSTRAINT [FKNhân Viên 510861] FOREIGN KEY([maCuaHang])
REFERENCES [dbo].[CuaHang] ([maCuaHang])
GO
ALTER TABLE [dbo].[NhanVienKyThuat] CHECK CONSTRAINT [FKNhân Viên 510861]
GO
ALTER TABLE [dbo].[PhieuNhanXet]  WITH CHECK ADD  CONSTRAINT [FKPhiếu Nhận15466] FOREIGN KEY([maNhanVien])
REFERENCES [dbo].[NhanVienKyThuat] ([maNhanVien])
GO
ALTER TABLE [dbo].[PhieuNhanXet] CHECK CONSTRAINT [FKPhiếu Nhận15466]
GO
ALTER TABLE [dbo].[PhieuNhanXet]  WITH CHECK ADD  CONSTRAINT [FKPhiếu Nhận540629] FOREIGN KEY([maKhachHang])
REFERENCES [dbo].[KhachHang] ([maKhachHang])
GO
ALTER TABLE [dbo].[PhieuNhanXet] CHECK CONSTRAINT [FKPhiếu Nhận540629]
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
ALTER TABLE [dbo].[XeTrongKho]  WITH CHECK ADD  CONSTRAINT [FKXe Trong K65137] FOREIGN KEY([maXe])
REFERENCES [dbo].[Xe] ([maXe])
GO
ALTER TABLE [dbo].[XeTrongKho] CHECK CONSTRAINT [FKXe Trong K65137]
GO
ALTER TABLE [dbo].[XeTrongKho]  WITH CHECK ADD  CONSTRAINT [FKXe Trong K922372] FOREIGN KEY([maCuaHang])
REFERENCES [dbo].[CuaHang] ([maCuaHang])
GO
ALTER TABLE [dbo].[XeTrongKho] CHECK CONSTRAINT [FKXe Trong K922372]
GO
USE [master]
GO
ALTER DATABASE [BikeStores] SET  READ_WRITE 
GO
