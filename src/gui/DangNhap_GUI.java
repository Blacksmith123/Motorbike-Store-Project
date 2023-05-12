package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import connect.ConnectDB;
import dao.NhanVienHanhChinh_DAO;
import dao.TaiKhoan_DAO;
import entity.TaiKhoan;

public class DangNhap_GUI extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel jTitle;
	private JPanel jUser;
	private JPanel jPwd;
	private JLabel lblTitle;
	private JLabel lblUser;
	private JTextField txtUser;
	private JLabel lblPwd;
	private JPasswordField txtPwd;
	private JPanel jSouth;
	private JButton btnLogin;
	private JButton btnExit;
	private TaiKhoan_DAO taiKhoan_DAO;
	
	private NhanVienHanhChinh_DAO nhanVienHanhChinh_DAO;
	
	public static void main(String[] args) {
		try {
			new DangNhap_GUI().setVisible(true);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public DangNhap_GUI() throws SQLException {

		// connectDB
		connect();
		
		// khai bao dao
		taiKhoan_DAO = new TaiKhoan_DAO();
		nhanVienHanhChinh_DAO = new NhanVienHanhChinh_DAO();
		
		setLayout(null);
		setTitle("Login");
		setSize(650, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		// image
		Image img = Toolkit.getDefaultToolkit().createImage("image//private.png");
		setIconImage(img);
		// title
		jTitle = new JPanel();
		jTitle.add(lblTitle = new JLabel("ĐĂNG NHẬP"));
		lblTitle.setFont(new Font("Times new roman", Font.BOLD, 40));
		lblTitle.setForeground(Color.blue);

		jTitle.setBounds(240, 20, 250, 50);
		add(jTitle);
		
		jUser = new JPanel();
		jUser.add(lblUser = new JLabel("Tài khoản: "));
		lblUser.setSize(20, 300);
		lblUser.setFont(new Font("times new roman", Font.TRUETYPE_FONT, 28));

		// iconuser
		lblUser.setIcon(new ImageIcon("image//user.png"));
		txtUser = new JTextField(15);
		txtUser.setText("121");
		jUser.add(txtUser);
		jUser.setBounds(250, 120, 350, 70);
		// password
		jPwd = new JPanel();
		jPwd.add(lblPwd = new JLabel("Mật khẩu: "));
		lblPwd.setFont(new Font("times new roman", Font.TRUETYPE_FONT, 28));
		// iconpass
		lblPwd.setIcon(new ImageIcon("image//pass.png"));
		txtPwd = new JPasswordField(15);
		txtPwd.setText("1212");
		jPwd.add(txtPwd);
		jPwd.setBounds(250, 190, 350, 100);
		add(jUser);
		add(jPwd);
		// img background

		// button
		jSouth = new JPanel();

		jSouth.add(btnLogin = new JButton("Đăng nhập"));
		btnLogin.setBackground(Color.cyan);
		btnLogin.setFont(new Font("Times new roman", Font.BOLD, 18));
		btnLogin.setIcon(new ImageIcon("image//login1.png"));

		jSouth.add(btnExit = new JButton("Thoát"));
		// icon btn exit
		btnExit.setIcon(new ImageIcon("image//exit.png"));
		btnExit.setBackground(Color.red);
		btnExit.setFont(new Font("Times new roman", Font.BOLD, 18));

//		JPanel jImageBackground = new JPanel();
//
//		try {
//			BufferedImage myPic = ImageIO.read(new File("image//keyyy.png"));
//			JLabel picLabel = new JLabel(new ImageIcon(myPic));
//			jImageBackground.setBounds(-40, 30, 350, 250);
//			jImageBackground.add(picLabel);
//			add(jImageBackground);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		jSouth.setBounds(70, 300, 500, 100);
		add(jSouth);
		btnLogin.addActionListener(this);
		btnLogin.setMnemonic(KeyEvent.VK_ENTER);
		btnExit.addActionListener(this);
		btnExit.setMnemonic(KeyEvent.VK_X);
	}

	public void connect() throws SQLException {
		ConnectDB.getInstance();
		ConnectDB.connect();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(btnLogin)) {
			login();
		}
		else if (e.getSource().equals(btnExit)) {
			System.exit(0);
		}
	}
	
	public void login() {
		String maTaiKhoan = txtUser.getText().trim();
		String matKhau = txtPwd.getText().toString().trim();
		TaiKhoan taiKhoan = taiKhoan_DAO.getTaiKhoanTheoMa(maTaiKhoan);
		if (taiKhoan.getMaTK() == null) {
			JOptionPane.showMessageDialog(null, "Tài khoản không đúng!");
		}
		else if (!taiKhoan.getMatKhau().equals(matKhau)) {
			JOptionPane.showMessageDialog(null, "Mật khẩu không đúng!");
		}
		else {
			TrangChu_GUI trangChu_GUI = new TrangChu_GUI();
			trangChu_GUI.setVisible(true);
			this.setVisible(false);
		}
	}
}
