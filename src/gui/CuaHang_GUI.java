package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

public class CuaHang_GUI extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTable tableCuahang;
	private JTextField textMaCH;
	private JTable tableXetrongkho;
	private JTextField textTenCH;
	private JTextField textSdt;
	private JTextField textEmail;
	private JTextField textDuong;
	private JTextField textThanhPho;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public CuaHang_GUI() {
		setBorder(new LineBorder(new Color(0, 0, 0)));
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(165, 42, 42));
		panel.setBorder(new LineBorder(Color.CYAN));
		panel.setBounds(442, 299, 748, 401);
		add(panel);
		panel.setLayout(null);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 728, 381);
		panel.add(scrollPane);
		
		tableCuahang = new JTable();
		tableCuahang.setFont(new Font("Arial", Font.PLAIN, 16));
		tableCuahang.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"M\u00E3 c\u1EEDa h\u00E0ng", "T\u00EAn c\u1EEDa h\u00E0ng", "S\u1ED1 \u0111i\u1EC7n tho\u1EA1i", "Email", "\u0110\u01B0\u1EDDng", "Th\u00E0nh ph\u1ED1 ", "T\u00ECnh tr\u1EA1ng", "Zip code"
			}
		));
		scrollPane.setViewportView(tableCuahang);
		
		JPanel jpanel = new JPanel();
		jpanel.setBackground(SystemColor.text);
		jpanel.setBorder(new LineBorder(Color.CYAN));
		jpanel.setBounds(442, 39, 748, 236);
		add(jpanel);
		jpanel.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Mã cửa hàng:\r\n");
		lblNewLabel_4.setForeground(new Color(165, 42, 42));
		lblNewLabel_4.setBackground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(10, 10, 105, 34);
		jpanel.add(lblNewLabel_4);
		
		textMaCH = new JTextField();
		textMaCH.setFont(new Font("Arial", Font.PLAIN, 16));
		textMaCH.setBounds(160, 18, 206, 24);
		jpanel.add(textMaCH);
		textMaCH.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBorder(new LineBorder(new Color(165, 42, 42)));
		panel_2.setBounds(10, 378, 356, 147);
		jpanel.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnThem = new JButton("Thêm");
		btnThem.setBackground(Color.BLUE);
		btnThem.setForeground(new Color(165, 42, 42));
		btnThem.setFont(new Font("Arial", Font.PLAIN, 16));
		btnThem.setBounds(56, 32, 112, 27);
		panel_2.add(btnThem);
		
		JButton btnXoatrang = new JButton("Xóa Trắng");
		btnXoatrang.setForeground(new Color(165, 42, 42));
		btnXoatrang.setFont(new Font("Arial", Font.PLAIN, 16));
		btnXoatrang.setBackground(Color.BLUE);
		btnXoatrang.setBounds(212, 32, 112, 27);
		panel_2.add(btnXoatrang);
		
		JButton btnCapnhat = new JButton("Cập Nhật");
		btnCapnhat.setForeground(new Color(165, 42, 42));
		btnCapnhat.setFont(new Font("Arial", Font.PLAIN, 16));
		btnCapnhat.setBackground(Color.BLUE);
		btnCapnhat.setBounds(56, 69, 112, 27);
		panel_2.add(btnCapnhat);
		
		JButton btnXoa = new JButton("Xóa");
		btnXoa.setForeground(new Color(165, 42, 42));
		btnXoa.setFont(new Font("Arial", Font.PLAIN, 16));
		btnXoa.setBackground(Color.BLUE);
		btnXoa.setBounds(212, 69, 112, 27);
		panel_2.add(btnXoa);
		
		JButton btnLuu = new JButton("Lưu");
		btnLuu.setForeground(new Color(165, 42, 42));
		btnLuu.setFont(new Font("Arial", Font.PLAIN, 16));
		btnLuu.setBackground(Color.BLUE);
		btnLuu.setBounds(136, 106, 112, 27);
		panel_2.add(btnLuu);
		
		JLabel lblNewLabel_1_1 = new JLabel("Chức năng:");
		lblNewLabel_1_1.setForeground(Color.BLUE);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1_1.setBounds(10, 352, 322, 27);
		jpanel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("Tên cửa hàng:");
		lblNewLabel_4_1.setForeground(new Color(165, 42, 42));
		lblNewLabel_4_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4_1.setBackground(Color.WHITE);
		lblNewLabel_4_1.setBounds(10, 55, 132, 34);
		jpanel.add(lblNewLabel_4_1);
		
		textTenCH = new JTextField();
		textTenCH.setFont(new Font("Arial", Font.PLAIN, 16));
		textTenCH.setColumns(10);
		textTenCH.setBounds(160, 65, 206, 24);
		jpanel.add(textTenCH);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Số điện thoại");
		lblNewLabel_4_1_1.setForeground(new Color(165, 42, 42));
		lblNewLabel_4_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4_1_1.setBackground(Color.WHITE);
		lblNewLabel_4_1_1.setBounds(10, 99, 157, 34);
		jpanel.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1_2 = new JLabel("Email:");
		lblNewLabel_4_1_2.setForeground(new Color(165, 42, 42));
		lblNewLabel_4_1_2.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4_1_2.setBackground(Color.WHITE);
		lblNewLabel_4_1_2.setBounds(10, 143, 132, 34);
		jpanel.add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_4_1_3 = new JLabel("Đường:");
		lblNewLabel_4_1_3.setForeground(new Color(165, 42, 42));
		lblNewLabel_4_1_3.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4_1_3.setBackground(Color.WHITE);
		lblNewLabel_4_1_3.setBounds(10, 192, 105, 34);
		jpanel.add(lblNewLabel_4_1_3);
		
		JLabel lblNewLabel_4_1_4 = new JLabel("Tình trạng:");
		lblNewLabel_4_1_4.setForeground(new Color(165, 42, 42));
		lblNewLabel_4_1_4.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4_1_4.setBackground(Color.WHITE);
		lblNewLabel_4_1_4.setBounds(393, 10, 105, 34);
		jpanel.add(lblNewLabel_4_1_4);
		
		textSdt = new JTextField();
		textSdt.setFont(new Font("Arial", Font.PLAIN, 16));
		textSdt.setColumns(10);
		textSdt.setBounds(160, 104, 206, 24);
		jpanel.add(textSdt);
		
		JLabel lblNewLabel_4_1_4_1 = new JLabel("Zip code:\r\n");
		lblNewLabel_4_1_4_1.setForeground(new Color(165, 42, 42));
		lblNewLabel_4_1_4_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4_1_4_1.setBackground(Color.WHITE);
		lblNewLabel_4_1_4_1.setBounds(393, 55, 105, 34);
		jpanel.add(lblNewLabel_4_1_4_1);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBorder(new LineBorder(new Color(165, 42, 42)));
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setBounds(393, 89, 338, 137);
		jpanel.add(panel_2_1);
		
		JButton btnThem_1 = new JButton("Thêm");
		btnThem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnThem_1.setForeground(new Color(165, 42, 42));
		btnThem_1.setFont(new Font("Arial", Font.PLAIN, 16));
		btnThem_1.setBackground(Color.BLUE);
		btnThem_1.setBounds(56, 32, 112, 27);
		panel_2_1.add(btnThem_1);
		
		JButton btnXoatrang_1 = new JButton("Xóa Trắng");
		btnXoatrang_1.setForeground(new Color(165, 42, 42));
		btnXoatrang_1.setFont(new Font("Arial", Font.PLAIN, 16));
		btnXoatrang_1.setBackground(Color.BLUE);
		btnXoatrang_1.setBounds(212, 32, 112, 27);
		panel_2_1.add(btnXoatrang_1);
		
		JButton btnCapnhat_1 = new JButton("Cập Nhật");
		btnCapnhat_1.setForeground(new Color(165, 42, 42));
		btnCapnhat_1.setFont(new Font("Arial", Font.PLAIN, 16));
		btnCapnhat_1.setBackground(Color.BLUE);
		btnCapnhat_1.setBounds(56, 69, 112, 27);
		panel_2_1.add(btnCapnhat_1);
		
		JButton btnXoa_1 = new JButton("Xóa");
		btnXoa_1.setForeground(new Color(165, 42, 42));
		btnXoa_1.setFont(new Font("Arial", Font.PLAIN, 16));
		btnXoa_1.setBackground(Color.BLUE);
		btnXoa_1.setBounds(212, 69, 112, 27);
		panel_2_1.add(btnXoa_1);
		
		JButton btnLuu_1 = new JButton("Lưu");
		btnLuu_1.setForeground(new Color(165, 42, 42));
		btnLuu_1.setFont(new Font("Arial", Font.PLAIN, 16));
		btnLuu_1.setBackground(Color.BLUE);
		btnLuu_1.setBounds(136, 106, 112, 27);
		panel_2_1.add(btnLuu_1);
		
		textEmail = new JTextField();
		textEmail.setFont(new Font("Arial", Font.PLAIN, 16));
		textEmail.setColumns(10);
		textEmail.setBounds(160, 148, 206, 24);
		jpanel.add(textEmail);
		
		textDuong = new JTextField();
		textDuong.setFont(new Font("Arial", Font.PLAIN, 16));
		textDuong.setColumns(10);
		textDuong.setBounds(75, 197, 77, 24);
		jpanel.add(textDuong);
		
		JLabel lblNewLabel_4_1_3_1 = new JLabel("Thành phố:");
		lblNewLabel_4_1_3_1.setForeground(new Color(165, 42, 42));
		lblNewLabel_4_1_3_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4_1_3_1.setBackground(Color.WHITE);
		lblNewLabel_4_1_3_1.setBounds(160, 192, 105, 34);
		jpanel.add(lblNewLabel_4_1_3_1);
		
		textThanhPho = new JTextField();
		textThanhPho.setFont(new Font("Arial", Font.PLAIN, 16));
		textThanhPho.setColumns(10);
		textThanhPho.setBounds(241, 197, 125, 24);
		jpanel.add(textThanhPho);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_1.setColumns(10);
		textField_1.setBounds(508, 20, 206, 24);
		jpanel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_2.setColumns(10);
		textField_2.setBounds(508, 60, 206, 24);
		jpanel.add(textField_2);
		
		JLabel lblNewLabel_1 = new JLabel("Thông Tin:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_1.setBounds(442, 10, 322, 27);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("Quản Lí Cửa Hàng");
		lblNewLabel_3.setBackground(new Color(165, 42, 42));
		lblNewLabel_3.setForeground(Color.BLUE);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel_3.setBounds(10, 3, 1188, 37);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("Danh Sách Hóa Đơn:");
		lblNewLabel.setBounds(452, 275, 322, 27);
		add(lblNewLabel);
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(Color.CYAN));
		panel_3.setBackground(new Color(165, 42, 42));
		panel_3.setBounds(10, 39, 422, 661);
		add(panel_3);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 125, 402, 466);
		panel_3.add(scrollPane_1);
		
		tableXetrongkho = new JTable();
		tableXetrongkho.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
			},
			new String[] {
				"M\u00E3 c\u1EEDa h\u00E0ng", "M\u00E3 lo\u1EA1i xe", "S\u1ED1 l\u01B0\u1EE3ng"
			}
		));
		tableXetrongkho.setFont(new Font("Arial", Font.PLAIN, 16));
		scrollPane_1.setViewportView(tableXetrongkho);
		
		JLabel lblNewLabel_2 = new JLabel("Tìm Kiếm:");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(10, 10, 91, 54);
		panel_3.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 16));
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 16));
		textField.setBounds(10, 56, 402, 27);
		panel_3.add(textField);
		textField.setColumns(10);
		
		JComboBox cbTim = new JComboBox();
		cbTim.setBounds(10, 91, 198, 24);
		panel_3.add(cbTim);
		cbTim.setForeground(Color.RED);
		cbTim.setFont(new Font("Arial", Font.PLAIN, 16));
		
		JButton btnTim = new JButton("Tìm Kiếm");
		btnTim.setBounds(218, 90, 133, 27);
		panel_3.add(btnTim);
		btnTim.setHorizontalAlignment(SwingConstants.LEFT);
		btnTim.setIcon(new ImageIcon("D:\\Study\\OOPJava\\21091031_TrinhMinhKhaa\\Motorbike-Store-Project\\data\\image\\icons8-search-30.png"));
		btnTim.setForeground(new Color(165, 42, 42));
		btnTim.setFont(new Font("Arial", Font.PLAIN, 16));
		btnTim.setBackground(Color.BLUE);
		btnTim.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnTim.setVerticalTextPosition(SwingConstants.CENTER);
		btnTim.setHorizontalAlignment(SwingConstants.LEFT);
		
		JButton btnThemDong = new JButton("Thêm Dòng");
		btnThemDong.setForeground(new Color(165, 42, 42));
		btnThemDong.setFont(new Font("Arial", Font.PLAIN, 16));
		btnThemDong.setBackground(Color.BLUE);
		btnThemDong.setBounds(10, 601, 125, 27);
		panel_3.add(btnThemDong);

	}
}
