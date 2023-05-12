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

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import entity.TaiKhoan;


public class DangNhap_GUI extends JFrame implements ActionListener{

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
	public String hau;
	public static TaiKhoan tkd;
	public DangNhap_GUI() {
		// TODO Auto-generated constructor stub
		setLayout(null);
//		ConnectDB.getInstance().connect();
//		tk_dao = new Login_DAO();
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
		//
		
		// center

		// user
		jUser = new JPanel();
		//
		jUser.add(lblUser = new JLabel("Tài khoản: "));
		lblUser.setSize(20, 300);
		lblUser.setFont(new Font("times new roman", Font.TRUETYPE_FONT, 28));
		
		// iconuser
		lblUser.setIcon(new ImageIcon("image//user.png"));
		jUser.add(txtUser = new JTextField(15));
		jUser.setBounds(250, 120, 350, 70);
		// password
		jPwd = new JPanel();
		jPwd.add(lblPwd = new JLabel("Mật khẩu: "));
		lblPwd.setFont(new Font("times new roman", Font.TRUETYPE_FONT, 28));
		// iconpass
		lblPwd.setIcon(new ImageIcon("image//pass.png"));
		jPwd.add(txtPwd = new JPasswordField(15));
		jPwd.setBounds(250, 190, 350, 100);
		add(jUser);
		add(jPwd);
		// img background
		
		// button
		jSouth = new JPanel();
		
		jSouth.add(btnLogin = new JButton("Đăng nhập"));
		btnLogin.setBackground(Color.cyan);
		btnLogin.setFont(new Font("Times new roman", Font.BOLD, 18));
		// icon btn login
		btnLogin.setIcon(new ImageIcon("image//login1.png"));
		
		jSouth.add(btnExit = new JButton("Thoát"));
		// icon btn  exit
		btnExit.setIcon(new ImageIcon("image//exit.png"));
		btnExit.setBackground(Color.red);
		btnExit.setFont(new Font("Times new roman", Font.BOLD, 18));
		
		JPanel jImageBackground = new JPanel();
		
		try {
			BufferedImage myPic = ImageIO.read(new File("image//keyyy.png"));
			JLabel picLabel = new JLabel(new ImageIcon(myPic));
			jImageBackground.setBounds(-40, 30, 350, 250);
			jImageBackground.add(picLabel);
			add(jImageBackground);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		jSouth.setBounds(70, 300, 500, 100);
		add(jSouth);
		btnLogin.addActionListener(this);
		btnLogin.setMnemonic(KeyEvent.VK_ENTER);
		btnExit.addActionListener(this);
		btnExit.setMnemonic(KeyEvent.VK_X);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
		if(o.equals(btnLogin)) {
			if(login() == 1) {
				new TrangChu_GUI().setVisible(true);
				this.setVisible(false);
			}
		}
		else {
			exit();
		}
	}
	private int login() {
		return 1;
	}
	private void exit() {
		System.exit(0);
	}
	
	public static void main(String[] args) {
		new DangNhap_GUI().setVisible(true);
	}
}

