package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.SwingConstants;

public class TrangChu_GUI extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JMenuItem menuTrangChu;

	private JPanel contentPane;

	private JMenu menuCuaHang;
	private JMenuItem menuitemNhanVienHanhChinh;
	private JMenuItem menuitemTrangChu;
	private JMenuItem menuitemHoaDon;
	private JMenuItem menuitemThongTinXe;
	private JMenuItem menuitemCuaHang;
	private JMenuBar  menuBar;
	private JMenuItem menuitemNhaPhanPhoi;
	private JMenuItem menuitemQuanLyXe;
	private JMenuItem menuitemKhachHang;

	private JMenuItem menuitemNhanVienKyThuat;

	private JPanel tongJPanel;

	String trangChu = "Trang chủ";
	String quanLyCuaHang = "Quản Lý Cửa Hàng";
	String nhanVienKyThuat = "Nhân Viên Kỹ Thuật";
	String nhanVienHanhChanh = "Nhân Viên Hành Chánh";
	String hoaDon = "Hóa Đơn";
	String thongTinXe = "Thông Tin Xe";
	String quanLyXe = "Quản Lý Xe";
	String nhaPhanPhoi = "Nhà Phân Phối";
	String khachHang = "Khách Hàng";

	/**
	 * Create the frame.
	 */
	public TrangChu_GUI() {
		setTitle(trangChu);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(391, 21, 1210, 780);

		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		menuTrangChu = new JMenu(trangChu);
		menuTrangChu.setIcon(null);
		menuTrangChu.setForeground(new Color(0, 0, 255));
		menuTrangChu.setFont(new Font("Segoe UI", Font.BOLD, 18));
		menuBar.add(menuTrangChu);

		menuitemTrangChu = new JMenuItem("Trang chủ");
		menuitemTrangChu.setIcon(new ImageIcon(TrangChu_GUI.class.getResource("/image/home.png")));
		menuTrangChu.add(menuitemTrangChu);

		menuCuaHang = new JMenu("Cửa hàng");
		menuCuaHang.setForeground(new Color(0, 0, 255));
		menuCuaHang.setFont(new Font("Segoe UI", Font.BOLD, 18));
		menuBar.add(menuCuaHang);

		menuitemCuaHang = new JMenuItem("Quản lý cửa hàng");
		menuitemCuaHang.setIcon(new ImageIcon(TrangChu_GUI.class.getResource("/image/store.png")));
		menuCuaHang.add(menuitemCuaHang);

		JMenu menuNhanVien = new JMenu("Nhân viên");
		menuNhanVien.setForeground(new Color(0, 0, 255));
		menuNhanVien.setFont(new Font("Segoe UI", Font.BOLD, 18));
		menuBar.add(menuNhanVien);

		menuitemNhanVienKyThuat = new JMenuItem("Nhân viên kỹ thuật");
		menuitemNhanVienKyThuat.setIcon(new ImageIcon(TrangChu_GUI.class.getResource("/image/technical-support.png")));
		// menuitemNhanVienKyThuat.setIcon(new
		// ImageIcon(TrangChu_GUI.class.getResource("/image/worker.png")));
		menuitemNhanVienKyThuat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		menuNhanVien.add(menuitemNhanVienKyThuat);

		menuitemNhanVienHanhChinh = new JMenuItem("Nhân viên hành chính");
		menuitemNhanVienHanhChinh.setIcon(new ImageIcon(TrangChu_GUI.class.getResource("/image/team-management.png")));
		// menuitemNhanVienHanhChinh.setIcon(new
		// ImageIcon(TrangChu_GUI.class.getResource("/image/employee.png")));
		menuNhanVien.add(menuitemNhanVienHanhChinh);

		JMenu menuHoaDon = new JMenu("Hóa đơn");
		menuHoaDon.setForeground(new Color(0, 0, 255));
		menuHoaDon.setFont(new Font("Segoe UI", Font.BOLD, 18));
		menuBar.add(menuHoaDon);

		menuitemHoaDon = new JMenuItem("Hóa đơn");
		menuitemHoaDon.setIcon(new ImageIcon(TrangChu_GUI.class.getResource("/image/bill.png")));
		menuHoaDon.add(menuitemHoaDon);

		JMenu menuXe = new JMenu("Xe");
		menuXe.setForeground(new Color(0, 0, 255));
		menuXe.setFont(new Font("Segoe UI", Font.BOLD, 18));
		menuBar.add(menuXe);

		menuitemThongTinXe = new JMenuItem("Thông tin xe");
		menuitemThongTinXe.setIcon(new ImageIcon(TrangChu_GUI.class.getResource("/image/information-button.png")));
		menuXe.add(menuitemThongTinXe);

		menuitemQuanLyXe = new JMenuItem("Quản lý xe");
		menuitemQuanLyXe.setIcon(new ImageIcon(TrangChu_GUI.class.getResource("/image/project-management.png")));
		menuXe.add(menuitemQuanLyXe);

		menuitemNhaPhanPhoi = new JMenuItem("Nhà phân phối");
		menuitemNhaPhanPhoi.setIcon(new ImageIcon(TrangChu_GUI.class.getResource("/image/distribution.png")));
		menuXe.add(menuitemNhaPhanPhoi);

		JMenu menuKhachHang = new JMenu("Khách hàng");
		menuKhachHang.setForeground(new Color(0, 0, 255));
		menuKhachHang.setFont(new Font("Segoe UI", Font.BOLD, 18));
		menuBar.add(menuKhachHang);

		menuitemKhachHang = new JMenuItem("Khách hàng");
		menuitemKhachHang.setIcon(new ImageIcon(TrangChu_GUI.class.getResource("/image/customer.png")));
		menuKhachHang.add(menuitemKhachHang);

		
		JMenu menuThongKe = new JMenu("Thống kê");
		menuThongKe.setForeground(new Color(0, 0, 255));
		menuThongKe.setFont(new Font("Segoe UI", Font.BOLD, 18));
		menuBar.add(menuThongKe);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Thống kê ");
		menuThongKe.add(mntmNewMenuItem);


		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(TrangChu_GUI.class.getResource("/image/TrangChu.jpg")));
		lblNewLabel.setBounds(79, 156, 1003, 476);
		lblNewLabel.setBounds(54, 123, 830, 476);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("QUẢN LÝ BÁN XE MÁY", SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.red);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel_1.setBounds(0, 0, 1161, 74);
		contentPane.add(lblNewLabel_1);
		menuTrangChu.addActionListener(this);
		menuitemNhanVienHanhChinh.addActionListener(this);
		menuitemCuaHang.addActionListener(this);
		menuitemHoaDon.addActionListener(this);
		menuitemKhachHang.addActionListener(this);
		menuitemNhanVienKyThuat.addActionListener(this);
		menuitemNhaPhanPhoi.addActionListener(this);
		menuitemQuanLyXe.addActionListener(this);
		menuitemThongTinXe.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
		if (o.equals(menuitemNhanVienHanhChinh)) {
			try {
				setTitle(nhanVienHanhChanh);
				showMenu(new NhanVienHanhChinh_GUI());
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				System.out.println("LOI");
			}
		} else if (o.equals(menuitemCuaHang)) {
			setTitle(quanLyCuaHang);
			try {
				showMenu(new CuaHang_GUI());
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} else if (o.equals(menuitemKhachHang)) {
			setTitle(khachHang);
			try {
				showMenu(new KhachHang_GUI());
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} else if (o.equals(menuitemNhanVienKyThuat)) {
			try {
				setTitle(nhanVienKyThuat);
				showMenu(new NhanVienKyThuat_GUI());
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} else if (o.equals(menuitemHoaDon)) {
			try {
				setTitle(hoaDon);
				showMenu(new HoaDon_GUI());
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} else if (o.equals(menuitemNhaPhanPhoi)) {
			setTitle(nhaPhanPhoi);
			try {
				showMenu(new NhaPhanPhoi_GUI());
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} else if (o.equals(menuitemQuanLyXe)) {
			try {
				setTitle(quanLyXe);
				showMenu(new Xe_GUI());
			} catch (SQLException e1) {
				// TODO AutoX-generated catch block
				e1.printStackTrace();
			}
		} else if (o.equals(menuitemThongTinXe)) {
			try {
				setTitle(thongTinXe);
				showMenu(new ThongTinXe_GUI());
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} else if (o.equals(menuitemThongTinXe)) {
			showMenu(new ThongKe());
		}

	}

	public void showMenu(JPanel cn) {
		setContentPane(cn);
		validate();
		invalidate();
	}
}