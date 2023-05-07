package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import connect.ConnectDB;
import dao.HoaDon_DAO;
import entity.HoaDon;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.DropMode;
import javax.swing.DefaultComboBoxModel;

public class HoaDon_GUI extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTable tableHd;
	private DefaultTableModel modelHd;
//	private DefaultTableModel modelHdDetail;
	private JTextField textMaHD;
	private JTable tableHddetail;
	private JTextField textNgaylap;
	private JTextField textThoigianbaohanh;
	private JTextField textField_3;
	HoaDon_DAO hoaDon;

	/**
	 * Create the panel.
	 * @throws SQLException 
	 */
	public HoaDon_GUI() throws SQLException {
		//bat buoc
		ConnectDB.getInstance().connect();
//		ở trên
		setBorder(new LineBorder(new Color(0, 0, 0)));
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(165, 42, 42));
		panel.setBorder(new LineBorder(Color.CYAN));
		panel.setBounds(442, 299, 748, 401);
		add(panel);
		panel.setLayout(null);
		//table
		String[] column = {"Mã hóa đơn","Ngày lập","Thời gian bảo hành","Mã khách hàng","Mã cửa hàng", "Mã nhân viên"};
		modelHd = new DefaultTableModel(column,2);
		tableHd = new JTable(modelHd);
		tableHd.setFont(new Font("Arial", Font.PLAIN, 16));
		JScrollPane scrollPane = new JScrollPane(tableHd, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setBounds(10, 10, 728, 381);
		panel.add(scrollPane);
		
		
		JPanel txtTongtien = new JPanel();
		txtTongtien.setBackground(SystemColor.text);
		txtTongtien.setBorder(new LineBorder(Color.CYAN));
		txtTongtien.setBounds(442, 39, 748, 236);
		add(txtTongtien);
		txtTongtien.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Mã Hóa Đơn:\r\n");
		lblNewLabel_4.setForeground(new Color(165, 42, 42));
		lblNewLabel_4.setBackground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(10, 10, 105, 34);
		txtTongtien.add(lblNewLabel_4);
		
		textMaHD = new JTextField();
		textMaHD.setFont(new Font("Arial", Font.PLAIN, 16));
		textMaHD.setBounds(160, 18, 206, 24);
		txtTongtien.add(textMaHD);
		textMaHD.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBorder(new LineBorder(new Color(165, 42, 42)));
		panel_2.setBounds(10, 378, 356, 147);
		txtTongtien.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnThem = new JButton("Thêm");
		btnThem.setBackground(Color.LIGHT_GRAY);
		btnThem.setForeground(new Color(165, 42, 42));
		btnThem.setFont(new Font("Arial", Font.PLAIN, 16));
		btnThem.setBounds(56, 32, 112, 27);
		panel_2.add(btnThem);
		
		JButton btnXoatrang = new JButton("Xóa Trắng");
		btnXoatrang.setForeground(new Color(165, 42, 42));
		btnXoatrang.setFont(new Font("Arial", Font.PLAIN, 16));
		btnXoatrang.setBackground(Color.LIGHT_GRAY);
		btnXoatrang.setBounds(212, 32, 112, 27);
		panel_2.add(btnXoatrang);
		
		JButton btnCapnhat = new JButton("Cập Nhật");
		btnCapnhat.setForeground(new Color(165, 42, 42));
		btnCapnhat.setFont(new Font("Arial", Font.PLAIN, 16));
		btnCapnhat.setBackground(Color.LIGHT_GRAY);
		btnCapnhat.setBounds(56, 69, 112, 27);
		panel_2.add(btnCapnhat);
		
		JButton btnXoa = new JButton("Xóa");
		btnXoa.setForeground(new Color(165, 42, 42));
		btnXoa.setFont(new Font("Arial", Font.PLAIN, 16));
		btnXoa.setBackground(Color.LIGHT_GRAY);
		btnXoa.setBounds(212, 69, 112, 27);
		panel_2.add(btnXoa);
		
		JButton btnLuu = new JButton("Lưu");
		btnLuu.setForeground(new Color(165, 42, 42));
		btnLuu.setFont(new Font("Arial", Font.PLAIN, 16));
		btnLuu.setBackground(Color.LIGHT_GRAY);
		btnLuu.setBounds(136, 106, 112, 27);
		panel_2.add(btnLuu);
		
	
		
		JLabel lblNewLabel_4_1 = new JLabel("Ngày Lập:\r\n");
		lblNewLabel_4_1.setForeground(new Color(165, 42, 42));
		lblNewLabel_4_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4_1.setBackground(Color.WHITE);
		lblNewLabel_4_1.setBounds(10, 55, 105, 34);
		txtTongtien.add(lblNewLabel_4_1);
		
		textNgaylap = new JTextField();
		textNgaylap.setFont(new Font("Arial", Font.PLAIN, 16));
		textNgaylap.setColumns(10);
		textNgaylap.setBounds(160, 65, 206, 24);
		txtTongtien.add(textNgaylap);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Thời gian bảo hành:");
		lblNewLabel_4_1_1.setForeground(new Color(165, 42, 42));
		lblNewLabel_4_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4_1_1.setBackground(Color.WHITE);
		lblNewLabel_4_1_1.setBounds(10, 99, 157, 34);
		txtTongtien.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1_2 = new JLabel("Mã khách hàng:\r\n");
		lblNewLabel_4_1_2.setForeground(new Color(165, 42, 42));
		lblNewLabel_4_1_2.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4_1_2.setBackground(Color.WHITE);
		lblNewLabel_4_1_2.setBounds(10, 143, 132, 34);
		txtTongtien.add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_4_1_3 = new JLabel("Mã cửa hàng:");
		lblNewLabel_4_1_3.setForeground(new Color(165, 42, 42));
		lblNewLabel_4_1_3.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4_1_3.setBackground(Color.WHITE);
		lblNewLabel_4_1_3.setBounds(10, 187, 105, 34);
		txtTongtien.add(lblNewLabel_4_1_3);
		
		JLabel lblNewLabel_4_1_4 = new JLabel("Mã nhân viên:");
		lblNewLabel_4_1_4.setForeground(new Color(165, 42, 42));
		lblNewLabel_4_1_4.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4_1_4.setBackground(Color.WHITE);
		lblNewLabel_4_1_4.setBounds(393, 10, 105, 34);
		txtTongtien.add(lblNewLabel_4_1_4);
		
		JComboBox cbMakhachhang = new JComboBox();
		cbMakhachhang.setFont(new Font("Arial", Font.PLAIN, 16));
		cbMakhachhang.setBounds(160, 152, 206, 21);
		txtTongtien.add(cbMakhachhang);
		
		JComboBox cbMacuahang = new JComboBox();
		cbMacuahang.setFont(new Font("Arial", Font.PLAIN, 16));
		cbMacuahang.setBounds(160, 196, 206, 21);
		txtTongtien.add(cbMacuahang);
		
		JComboBox cbManhanvien = new JComboBox();
		cbManhanvien.setFont(new Font("Arial", Font.PLAIN, 16));
		cbManhanvien.setBounds(508, 17, 206, 21);
		txtTongtien.add(cbManhanvien);
		
		textThoigianbaohanh = new JTextField();
		textThoigianbaohanh.setFont(new Font("Arial", Font.PLAIN, 16));
		textThoigianbaohanh.setColumns(10);
		textThoigianbaohanh.setBounds(160, 104, 206, 24);
		txtTongtien.add(textThoigianbaohanh);
		
		JLabel lblNewLabel_4_1_4_1 = new JLabel("Tổng tiền:");
		lblNewLabel_4_1_4_1.setForeground(new Color(165, 42, 42));
		lblNewLabel_4_1_4_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4_1_4_1.setBackground(Color.WHITE);
		lblNewLabel_4_1_4_1.setBounds(393, 55, 105, 34);
		txtTongtien.add(lblNewLabel_4_1_4_1);
		
		textField_3 = new JTextField();
		textField_3.setEnabled(false);
		textField_3.setEditable(false);
		textField_3.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_3.setColumns(10);
		textField_3.setBounds(508, 60, 206, 24);
		txtTongtien.add(textField_3);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBorder(new LineBorder(new Color(165, 42, 42)));
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setBounds(393, 89, 338, 137);
		txtTongtien.add(panel_2_1);
		
		JButton btnThem_1 = new JButton("Thêm");
		btnThem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnThem_1.setForeground(new Color(165, 42, 42));
		btnThem_1.setFont(new Font("Arial", Font.PLAIN, 16));
		btnThem_1.setBackground(Color.LIGHT_GRAY);
		btnThem_1.setBounds(56, 32, 112, 27);
		panel_2_1.add(btnThem_1);
		
		JButton btnXoatrang_1 = new JButton("Xóa Trắng");
		btnXoatrang_1.setForeground(new Color(165, 42, 42));
		btnXoatrang_1.setFont(new Font("Arial", Font.PLAIN, 16));
		btnXoatrang_1.setBackground(Color.LIGHT_GRAY);
		btnXoatrang_1.setBounds(212, 32, 112, 27);
		panel_2_1.add(btnXoatrang_1);
		
		JButton btnCapnhat_1 = new JButton("Cập Nhật");
		btnCapnhat_1.setForeground(new Color(165, 42, 42));
		btnCapnhat_1.setFont(new Font("Arial", Font.PLAIN, 16));
		btnCapnhat_1.setBackground(Color.LIGHT_GRAY);
		btnCapnhat_1.setBounds(56, 69, 112, 27);
		panel_2_1.add(btnCapnhat_1);
		
		JButton btnXoa_1 = new JButton("Xóa");
		btnXoa_1.setForeground(new Color(165, 42, 42));
		btnXoa_1.setFont(new Font("Arial", Font.PLAIN, 16));
		btnXoa_1.setBackground(Color.LIGHT_GRAY);
		btnXoa_1.setBounds(212, 69, 112, 27);
		panel_2_1.add(btnXoa_1);
		
		JButton btnLuu_1 = new JButton("Lưu");
		btnLuu_1.setForeground(new Color(165, 42, 42));
		btnLuu_1.setFont(new Font("Arial", Font.PLAIN, 16));
		btnLuu_1.setBackground(Color.LIGHT_GRAY);
		btnLuu_1.setBounds(136, 106, 112, 27);
		panel_2_1.add(btnLuu_1);
		
		JLabel lblNewLabel_1 = new JLabel("Thông Tin:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_1.setBounds(442, 10, 322, 27);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("Quản Lí Hóa Đơn");
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
		scrollPane_1.setBounds(10, 125, 402, 489);
		panel_3.add(scrollPane_1);
		
		tableHddetail = new JTable();
		tableHddetail.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"M\u00E3 h\u00F3a \u0111\u01A1n", "T\u00EAn lo\u1EA1i xe", "S\u1ED1 l\u01B0\u1EE3ng", "\u0110\u01A1n gi\u00E1", "Th\u00E0nh ti\u1EC1n"
			}
		));
		tableHddetail.setFont(new Font("Arial", Font.PLAIN, 16));
		scrollPane_1.setViewportView(tableHddetail);
		
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
		btnTim.setBackground(Color.LIGHT_GRAY);
		btnTim.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnTim.setVerticalTextPosition(SwingConstants.CENTER);
		btnTim.setHorizontalAlignment(SwingConstants.LEFT);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setEditable(true);
		comboBox.setFont(new Font("Arial", Font.PLAIN, 16));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Hóa Đơn", "Chi Tiết Hóa Đơn"}));
		comboBox.setBounds(90, 29, 133, 21);
		panel_3.add(comboBox);
		
		JButton btnThemDong = new JButton("Thêm Dòng");
		btnThemDong.setForeground(new Color(165, 42, 42));
		btnThemDong.setFont(new Font("Arial", Font.PLAIN, 16));
		btnThemDong.setBackground(Color.LIGHT_GRAY);
		btnThemDong.setBounds(10, 624, 125, 27);
		panel_3.add(btnThemDong);

	//	đổ dữ liệu vào table hóa đơn
		hoaDon = new HoaDon_DAO();
//		Database.getInstance().connect();
		for (HoaDon hd : hoaDon.getAllHoaDon()) {
			Object[] objects = {hd.getMa(),hd.getNgayLap(),hd.getMaKH(),hd.getMaCH(),hd.getMaNV()};
			 modelHd.addRow(objects);
		}
	}
}
