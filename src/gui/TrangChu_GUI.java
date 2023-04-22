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

public class TrangChu_GUI extends JFrame implements ActionListener{
	private JMenuItem menuTrangChu;

	private JPanel contentPane;

	private JMenuItem menuitemNhanVienHanhChinh;

	/**
	 * Launch the application.
	 */
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
	}

	/**
	 * Create the frame.
	 */
	public TrangChu_GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1137, 632);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
	    menuTrangChu = new JMenu("Trang chủ");
		menuBar.add(menuTrangChu);
		
		JMenu menuCuaHang = new JMenu("Cửa hàng");
		menuBar.add(menuCuaHang);
		
		JMenuItem menuitemCuaHang = new JMenuItem("Quản lý cửa hàng");
		menuCuaHang.add(menuitemCuaHang);
		
		JMenu menuNhanVien = new JMenu("Nhân viên");
		menuBar.add(menuNhanVien);
		
		JMenuItem menuitemNhanVienKyThuat = new JMenuItem("Nhân viên kỹ thuật");
		menuitemNhanVienKyThuat.setIcon(new ImageIcon("C:\\java\\workspace\\HSK\\src\\image\\worker.png"));
		menuitemNhanVienKyThuat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		menuNhanVien.add(menuitemNhanVienKyThuat);
		
		 menuitemNhanVienHanhChinh = new JMenuItem("Nhân viên hành chính");
		 menuitemNhanVienHanhChinh.setIcon(new ImageIcon("C:\\java\\workspace\\HSK\\src\\image\\employee.png"));
		menuNhanVien.add(menuitemNhanVienHanhChinh);
		
		JMenu menuHoaDon = new JMenu("Hóa đơn");
		menuBar.add(menuHoaDon);
		
		JMenuItem menuitemHoaDon = new JMenuItem("Hóa đơn");
		menuHoaDon.add(menuitemHoaDon);
		
		JMenu menuXe = new JMenu("Xe");
		menuBar.add(menuXe);
		
		JMenuItem menuitemQuanLyXe = new JMenuItem("Quản lý xe");
		menuitemQuanLyXe.setIcon(null);
		menuXe.add(menuitemQuanLyXe);
		
		JMenu menuKhachHang = new JMenu("Khách hàng");
		menuBar.add(menuKhachHang);
		
		JMenuItem menuitemKhachHang = new JMenuItem("Khách hàng");
		menuKhachHang.add(menuitemKhachHang);
		
		
	
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\java\\TrangChu.jpg"));
		lblNewLabel.setBounds(166, 64, 710, 461);
		contentPane.add(lblNewLabel);
		menuTrangChu.addActionListener(this);
		menuitemNhanVienHanhChinh.addActionListener(this);
		}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
		if(o.equals(menuitemNhanVienHanhChinh)) {
			showMenu(new NhanVienHanhChinh_GUI());
		}
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
