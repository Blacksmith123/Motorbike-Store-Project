package gui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import connect.ConnectDB;
import dao.TaiKhoan_DAO;
import entity.TaiKhoan;

public class DangNhap_GUI extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblTitle;
	private JLabel lblUser;
	private JTextField txtUser;
	private JLabel lblPwd;
	private JPasswordField txtPwd;
	private JButton btnLogin;
	private JButton btnExit;
	private TaiKhoan_DAO taiKhoan_DAO;
	
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
		
		getContentPane().setLayout(null);
		setTitle("Login");
		setSize(650, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		// image
		Image img = Toolkit.getDefaultToolkit().createImage("image//private.png");
		setIconImage(img);
		// title
		lblTitle = new JLabel("ĐĂNG NHẬP");
		lblTitle.setFont(new Font("Times new roman", Font.BOLD, 40));
		lblTitle.setForeground(Color.blue);

		lblUser = new JLabel("Tài khoản:");
		lblUser.setSize(20, 300);
		lblUser.setFont(new Font("times new roman", Font.TRUETYPE_FONT, 28));

		// iconuser
		lblUser.setIcon(new ImageIcon("image//user.png"));
		txtUser = new JTextField(15);
		txtUser.setText("121");
		
		lblPwd = new JLabel("Mật khẩu:");
		lblPwd.setFont(new Font("times new roman", Font.TRUETYPE_FONT, 28));
		lblPwd.setIcon(new ImageIcon("image//pass.png"));
		txtPwd = new JPasswordField(15);
		txtPwd.setText("1212");
				
		// icon btn exit
		btnExit = new JButton("Thoát");


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
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 636, 363);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		btnLogin = new JButton("Đăng nhập");
		btnLogin.setBounds(175, 252, 138, 38);
		btnLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLogin.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnLogin.setBackground(new Color(0, 163, 163));
		btnLogin.setBorder(new LineBorder(Color.WHITE, 2, true));
		btnLogin.setForeground(Color.WHITE);
		panel.add(btnLogin);
		
		btnExit = new JButton("Thoát");
		btnExit.setFont(new Font("Arial", Font.PLAIN, 16));
		btnExit.setBounds(339, 252, 138, 38);
		btnExit.setIcon(new ImageIcon("image//exit.png"));
		btnExit.setBackground(new Color(0, 163, 163));
		btnExit.setForeground(Color.white);
		btnExit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnExit.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnExit.setBorder(new LineBorder(Color.WHITE, 2, true));
		panel.add(btnExit);
		
		txtPwd = new JPasswordField();
		txtPwd.setText("1212");
		txtPwd.setBounds(283, 192, 191, 32);
		txtPwd.setBorder(BorderFactory.createLineBorder(new Color(0, 209, 209)));
		panel.add(txtPwd);
		
		JLabel lblPwd = new JLabel("Mật khẩu:");
		lblPwd.setFont(new Font("Arial", Font.PLAIN, 16));
		lblPwd.setBounds(175, 192, 74, 32);
		panel.add(lblPwd);
		
		JLabel lblUser = new JLabel("Tài khoản:");
		lblUser.setFont(new Font("Arial", Font.PLAIN, 16));
		lblUser.setBounds(175, 150, 74, 32);
		panel.add(lblUser);
		
		txtUser = new JTextField();
		txtUser.setBounds(283, 150, 191, 32);
		txtUser.setText("121");
		txtUser.setBorder(BorderFactory.createLineBorder(new Color(0, 209, 209)));
		panel.add(txtUser);
		txtUser.setColumns(10);
		
		JLabel lblTitle = new JLabel("ĐĂNG NHẬP");
		lblTitle.setFont(new Font("Arial", Font.BOLD, 40));
		lblTitle.setForeground(new Color(0, 117, 117));
		lblTitle.setBounds(201, 68, 241, 47);
		panel.add(lblTitle);
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
		@SuppressWarnings("deprecation")
		String matKhau = txtPwd.getText().toString().trim();
		TaiKhoan taiKhoan = taiKhoan_DAO.getTaiKhoanTheoMa(maTaiKhoan);
		if (taiKhoan.getMaTK() == null) {
			JOptionPane.showMessageDialog(null, "Tài khoản không đúng!");
		}
		else if (!taiKhoan.getMatKhau().equals(matKhau)) {
			JOptionPane.showMessageDialog(null, "Mật khẩu không đúng!");
		}
		else {
			TrangChu trangChu = new TrangChu();
			trangChu.setVisible(true);
			this.setVisible(false);
		}
	}
}
