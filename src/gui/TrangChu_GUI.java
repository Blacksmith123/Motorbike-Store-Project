package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

public class TrangChu_GUI extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JMenuItem menuTrangChu;

	private JPanel contentPane;

	private JMenuItem menuitemNhanVienHanhChinh;
	private JMenuItem menuitemTraCuuCuaHang;
	private JMenuItem menuitemTrangChu;
	private JMenuItem menuitemHoaDon;
	private JMenuItem menuitemThongTinXe;
	private JMenuItem menuitemCuaHang;
	private JMenuBar menuBar;

	private JMenu menuCuaHang;

	private JMenuItem menuitemNhaPhanPhoi;

	private JMenuItem menuitemQuanLyXe;

	private JMenuItem menuitemKhachHang;

	private JMenuItem menuitemTraCuuNVHC;

	private JMenuItem menuitemTraCuuNVKT;

	private JMenuItem menuitemTraCuuHD;

	private JMenuItem menuitemTraCuuXe;

	private JMenuItem menuitemTraCuuKH;

	private JMenuItem menuitemNhanVienKyThuat;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					TrangChu_GUI frame = new TrangChu_GUI();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
		new TrangChu_GUI().setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public TrangChu_GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(391, 21, 1175, 733);
		
		 menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		
	    menuTrangChu = new JMenu("Trang chủ");
	    menuTrangChu.setIcon(null);
	    menuTrangChu.setForeground(new Color(0, 0, 255));
	    menuTrangChu.setFont(new Font("Segoe UI", Font.BOLD, 18));
		menuBar.add(menuTrangChu);
		
		menuitemTrangChu = new JMenuItem("Trang chủ");
		menuTrangChu.add(menuitemTrangChu);
		
		menuCuaHang = new JMenu("Cửa hàng");
		menuCuaHang.setForeground(new Color(0, 0, 255));
		menuCuaHang.setFont(new Font("Segoe UI", Font.BOLD, 18));
		menuBar.add(menuCuaHang);
		
		menuitemCuaHang = new JMenuItem("Quản lý cửa hàng");
		menuCuaHang.add(menuitemCuaHang);
		
		JMenu menuNhanVien = new JMenu("Nhân viên");
		menuNhanVien.setForeground(new Color(0, 0, 255));
		menuNhanVien.setFont(new Font("Segoe UI", Font.BOLD, 18));
		menuBar.add(menuNhanVien);
		
		menuitemNhanVienKyThuat = new JMenuItem("Nhân viên kỹ thuật");
		//menuitemNhanVienKyThuat.setIcon(new ImageIcon(TrangChu_GUI.class.getResource("/image/worker.png")));
		menuitemNhanVienKyThuat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		menuNhanVien.add(menuitemNhanVienKyThuat);
		
		menuitemNhanVienHanhChinh = new JMenuItem("Nhân viên hành chính");
		// menuitemNhanVienHanhChinh.setIcon(new ImageIcon(TrangChu_GUI.class.getResource("/image/employee.png")));
		menuNhanVien.add(menuitemNhanVienHanhChinh);
		
		JMenu menuHoaDon = new JMenu("Hóa đơn");
		menuHoaDon.setForeground(new Color(0, 0, 255));
		menuHoaDon.setFont(new Font("Segoe UI", Font.BOLD, 18));
		menuBar.add(menuHoaDon);
		
		menuitemHoaDon = new JMenuItem("Hóa đơn");
		menuHoaDon.add(menuitemHoaDon);
		
		JMenu menuXe = new JMenu("Xe");
		menuXe.setForeground(new Color(0, 0, 255));
		menuXe.setFont(new Font("Segoe UI", Font.BOLD, 18));
		menuBar.add(menuXe);
		
		menuitemThongTinXe = new JMenuItem("Thông tin xe");
		menuXe.add(menuitemThongTinXe);
		
		menuitemQuanLyXe = new JMenuItem("Quản lý xe");
		menuitemQuanLyXe.setIcon(null);
		menuXe.add(menuitemQuanLyXe);
		
		menuitemNhaPhanPhoi = new JMenuItem("Nhà phân phối");
		menuXe.add(menuitemNhaPhanPhoi);
		
		JMenu menuKhachHang = new JMenu("Khách hàng");
		menuKhachHang.setForeground(new Color(0, 0, 255));
		menuKhachHang.setFont(new Font("Segoe UI", Font.BOLD, 18));
		menuBar.add(menuKhachHang);
		
		menuitemKhachHang = new JMenuItem("Khách hàng");
		menuKhachHang.add(menuitemKhachHang);
		
		JMenu menuTraCuu = new JMenu("Tra cứu");
		menuTraCuu.setForeground(new Color(0, 0, 255));
		menuTraCuu.setFont(new Font("Segoe UI", Font.BOLD, 18));
		menuBar.add(menuTraCuu);
		
		menuitemTraCuuCuaHang = new JMenuItem("Tra cứu cửa hàng");
		menuTraCuu.add(menuitemTraCuuCuaHang);
		
		menuitemTraCuuNVHC = new JMenuItem("Tra cứu nhân viên hành chính");
		menuTraCuu.add(menuitemTraCuuNVHC);
		
		menuitemTraCuuNVKT = new JMenuItem("Tra cứu nhân viên kỹ thuật");
		menuTraCuu.add(menuitemTraCuuNVKT);
		
		menuitemTraCuuHD = new JMenuItem("Tra cứu hóa đơn");
		menuTraCuu.add(menuitemTraCuuHD);
		
		menuitemTraCuuXe = new JMenuItem("Tra cứu xe");
		menuTraCuu.add(menuitemTraCuuXe);
		
		menuitemTraCuuKH = new JMenuItem("Tra cứu khách hàng");
		menuTraCuu.add(menuitemTraCuuKH);
		
		
	
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		//lblNewLabel.setIcon(new ImageIcon(TrangChu_GUI.class.getResource("/image/TrangChu.jpg")));
		lblNewLabel.setBounds(54, 123, 830, 476);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("QUẢN LÝ BÁN XE MÁY", SwingConstants.CENTER);
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
		menuitemTraCuuCuaHang.addActionListener(this);
		menuitemTraCuuHD.addActionListener(this);
		menuitemTraCuuKH.addActionListener(this);
		menuitemTraCuuNVHC.addActionListener(this);
		menuitemTraCuuNVKT.addActionListener(this);
		menuitemTraCuuXe.addActionListener(this);
		
		}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
		if(o.equals(menuitemNhanVienHanhChinh)) {
			showMenu(new NhanVienHanhChinh_GUI());
		}
		else if(o.equals(menuitemCuaHang)) {
			showMenu(new CuaHang_GUI());
		}
		else if(o.equals(menuitemKhachHang)) {
			showMenu(new KhachHang_GUI());
		}
		else if(o.equals(menuitemNhanVienKyThuat)) {
			showMenu(new NhanVienKyThuat_GUI());
		}
		else if(o.equals(menuitemHoaDon)) {
			showMenu(new HoaDon_GUI());
		}
		else if(o.equals(menuitemNhaPhanPhoi)) {
			showMenu(new NhaPhanPhoi_GUI());
		}
		else if(o.equals(menuitemQuanLyXe)) {
			showMenu(new Xe_GUI());
		}
//		else if(o.equals(menuitemTraCuuCuaHang)) {
//			showMenu(new TraCuuCuaHang_GUI());
//		}
//		else if(o.equals(menuitemTraCuuHD)) {
//			showMenu(new TraCuuHD_GUI());
//		}
//		else if(o.equals(menuitemTraCuuKH)) {
//			showMenu(new TraCuuKH_GUI());
//		}
//		else if(o.equals(menuitemTraCuuNVHC)) {
//			showMenu(new TraCuuNVHC_GUI());
//		}
//		else if(o.equals(menuitemTraCuuNVKT)) {
//			showMenu(new TraCuuNVKT_GUI());
//		}
//		else if(o.equals(menuitemTraCuuXe)) {
//			//showMenu(new );
//		}
//		else if(o.equals(menuitemTraCuuNVKT)) {
//			showMenu(new TraCuuNVKT_GUI());
//		}
//	else if(o.equals(menuitemNhanVienHanhChinh)) {
//		showMenu(new NhanVienHanhChinh_GUI());
//	}

	

}
	public void showMenu(JPanel cn) {
		setContentPane(cn);
		validate();
		invalidate();
	}
	}
