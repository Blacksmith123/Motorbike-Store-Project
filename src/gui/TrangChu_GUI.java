package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;

public class TrangChu_GUI extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
<<<<<<< HEAD
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
	

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TrangChu_GUI frame = new TrangChu_GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		new TrangChu_GUI().setVisible(true);
	}

=======
>>>>>>> 10f1f0d5a51949c16da04b1289fad34a93de1c36

	/**
	 * Create the panel.
	 */
	public TrangChu_GUI() {
<<<<<<< HEAD
		setTitle(trangChu);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(391, 21, 1210, 780);

		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		menuTrangChu = new JMenu(trangChu);
		menuTrangChu.setIcon(new ImageIcon(TrangChu_GUI.class.getResource("/image/menuHome.png")));
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

=======
		setLayout(null);
>>>>>>> 10f1f0d5a51949c16da04b1289fad34a93de1c36
		
		JPanel panelTong = new JPanel();
		panelTong.setForeground(new Color(255, 0, 0));
		panelTong.setBounds(0, 0, 1200, 710);
		add(panelTong);
		panelTong.setLayout(null);
		
<<<<<<< HEAD
		JMenuItem menuitemThongKe = new JMenuItem("Thống kê ");
		menuThongKe.add(menuitemThongKe);


		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(TrangChu_GUI.class.getResource("/image/TrangChu.jpg")));
		
		// lblNewLabel.setIcon(new

		// ImageIcon(TrangChu_GUI.class.getResource("/image/TrangChu.jpg")));

		lblNewLabel.setBounds(54, 123, 960, 476);
		lblNewLabel.setBounds(54, 123, 830, 476);
		contentPane.add(lblNewLabel);

=======
>>>>>>> 10f1f0d5a51949c16da04b1289fad34a93de1c36
		JLabel lblNewLabel_1 = new JLabel("QUẢN LÝ BÁN XE MÁY", SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel_1.setBounds(0, 0, 1161, 74);
<<<<<<< HEAD
		contentPane.add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1184, 112);
		contentPane.add(panel);
		menuTrangChu.addActionListener(this);
		menuitemNhanVienHanhChinh.addActionListener(this);
		menuitemCuaHang.addActionListener(this);
		menuitemHoaDon.addActionListener(this);
		menuitemKhachHang.addActionListener(this);
		menuitemNhanVienKyThuat.addActionListener(this);
		menuitemNhaPhanPhoi.addActionListener(this);
		menuitemQuanLyXe.addActionListener(this);
		menuitemThongTinXe.addActionListener(this);
=======
		panelTong.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TrangChu_GUI.class.getResource("/image/TrangChu.jpg")));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(79, 156, 1003, 476);
		panelTong.add(lblNewLabel);
		
>>>>>>> 10f1f0d5a51949c16da04b1289fad34a93de1c36
	}
}
