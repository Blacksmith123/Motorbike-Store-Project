package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.ScrollPane;

public class ThongKe extends JPanel {

	private JTextField txtTuNgay;
	private JTextField txtDenNgay;
	private JTextField txtXeBanDuocNhieuNhat;
	private JTextField txtCuaHangBanNhieuXe;
	private JTable table;
	private JTable table_1;
	private JTextField txtNhanVienBanDuocNhieuXe;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public ThongKe() {
		setBorder(new LineBorder(new Color(0, 0, 0)));
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(165, 42, 42));
		panel.setBorder(new LineBorder(Color.CYAN));
		panel.setBounds(10, 148, 802, 545);
		add(panel);
		panel.setLayout(null);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 782, 251);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Arial", Font.PLAIN, 16));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
			},
			new String[] {
				"M\u00E3 lo\u1EA1i xe", "T\u00EAn lo\u1EA1i xe", "s\u1ED1 l\u01B0\u1EE3ng "
			}
		));
		scrollPane.setViewportView(table);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 277, 782, 251);
		panel.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
			},
			new String[] {
				"M\u00E3 c\u1EEDa h\u00E0ng", "T\u00EAn c\u1EEDa h\u00E0ng", "s\u1ED1 xe \u0111\u00E3 b\u00E1n "
			}
		));
		scrollPane_1.setViewportView(table_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.text);
		panel_1.setBorder(new LineBorder(Color.CYAN));
		panel_1.setBounds(812, 148, 376, 545);
		add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Từ ngày:");
		lblNewLabel_4.setForeground(new Color(165, 42, 42));
		lblNewLabel_4.setBackground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(10, 10, 140, 34);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Đến ngày:");
		lblNewLabel_4_1.setForeground(new Color(165, 42, 42));
		lblNewLabel_4_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4_1.setBounds(10, 45, 140, 34);
		panel_1.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Xe bán được nhiều nhất:");
		lblNewLabel_4_1_1.setForeground(new Color(165, 42, 42));
		lblNewLabel_4_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4_1_1.setBounds(10, 90, 176, 34);
		panel_1.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1_1_1 = new JLabel("Cửa hàng bán nhiều xe nhất:");
		lblNewLabel_4_1_1_1.setForeground(new Color(165, 42, 42));
		lblNewLabel_4_1_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4_1_1_1.setBounds(10, 158, 206, 34);
		panel_1.add(lblNewLabel_4_1_1_1);
		
		txtTuNgay = new JTextField();
		txtTuNgay.setFont(new Font("Arial", Font.PLAIN, 16));
		txtTuNgay.setBounds(91, 15, 183, 24);
		panel_1.add(txtTuNgay);
		txtTuNgay.setColumns(10);
		
		txtDenNgay = new JTextField();
		txtDenNgay.setFont(new Font("Arial", Font.PLAIN, 16));
		txtDenNgay.setColumns(10);
		txtDenNgay.setBounds(91, 50, 183, 24);
		panel_1.add(txtDenNgay);
		
		txtXeBanDuocNhieuNhat = new JTextField();
		txtXeBanDuocNhieuNhat.setFont(new Font("Arial", Font.PLAIN, 16));
		txtXeBanDuocNhieuNhat.setColumns(10);
		txtXeBanDuocNhieuNhat.setBounds(40, 123, 292, 24);
		panel_1.add(txtXeBanDuocNhieuNhat);
		
		txtCuaHangBanNhieuXe = new JTextField();
		txtCuaHangBanNhieuXe.setFont(new Font("Arial", Font.PLAIN, 16));
		txtCuaHangBanNhieuXe.setColumns(10);
		txtCuaHangBanNhieuXe.setBounds(40, 198, 292, 24);
		panel_1.add(txtCuaHangBanNhieuXe);
		
		JLabel lblNewLabel_4_1_1_1_1 = new JLabel("Nhân viên bán được nhiều xe nhất:");
		lblNewLabel_4_1_1_1_1.setForeground(new Color(165, 42, 42));
		lblNewLabel_4_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4_1_1_1_1.setBounds(10, 415, 257, 34);
		panel_1.add(lblNewLabel_4_1_1_1_1);
		
		JLabel lblNewLabel_4_1_1_1_2 = new JLabel("Khách hàng mua được nhiều xe nhất:");
		lblNewLabel_4_1_1_1_2.setForeground(new Color(165, 42, 42));
		lblNewLabel_4_1_1_1_2.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4_1_1_1_2.setBounds(10, 332, 267, 34);
		panel_1.add(lblNewLabel_4_1_1_1_2);
		
		JLabel lblNewLabel_4_1_1_1_3 = new JLabel("Cửa hàng có nhiều nhân viên nhất:");
		lblNewLabel_4_1_1_1_3.setForeground(new Color(165, 42, 42));
		lblNewLabel_4_1_1_1_3.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4_1_1_1_3.setBounds(10, 244, 246, 34);
		panel_1.add(lblNewLabel_4_1_1_1_3);
		
		txtNhanVienBanDuocNhieuXe = new JTextField();
		txtNhanVienBanDuocNhieuXe.setFont(new Font("Arial", Font.PLAIN, 16));
		txtNhanVienBanDuocNhieuXe.setColumns(10);
		txtNhanVienBanDuocNhieuXe.setBounds(40, 460, 292, 24);
		panel_1.add(txtNhanVienBanDuocNhieuXe);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 16));
		textField.setColumns(10);
		textField.setBounds(40, 298, 292, 24);
		panel_1.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_1.setColumns(10);
		textField_1.setBounds(40, 381, 292, 24);
		panel_1.add(textField_1);
		
		JLabel lblNewLabel_1 = new JLabel("Thông Tin:");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_1.setBounds(809, 123, 322, 27);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Thống kê:");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_2.setBounds(15, 96, 91, 54);
		add(lblNewLabel_2);
		
		JComboBox cbTim = new JComboBox();
		cbTim.setForeground(Color.RED);
		cbTim.setFont(new Font("Arial", Font.PLAIN, 16));
		cbTim.setBounds(116, 113, 125, 21);
		add(cbTim);
		
		
		JLabel lblNewLabel_3 = new JLabel("THỐNG KÊ");
		lblNewLabel_3.setBackground(new Color(165, 42, 42));
		lblNewLabel_3.setForeground(Color.BLUE);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel_3.setBounds(0, 70, 1198, 37);
		add(lblNewLabel_3);
		
		JButton btnLoc = new JButton("Lọc");
		btnLoc.setHorizontalAlignment(SwingConstants.LEFT);
		btnLoc.setIcon(new ImageIcon("D:\\Study\\OOPJava\\21091031_TrinhMinhKhaa\\Motorbike-Store-Project\\data\\image\\icons8-search-30.png"));
		btnLoc.setForeground(new Color(165, 42, 42));
		btnLoc.setFont(new Font("Arial", Font.PLAIN, 16));
		btnLoc.setBackground(Color.LIGHT_GRAY);
		btnLoc.setBounds(294, 110, 133, 27);
		btnLoc.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnLoc.setHorizontalAlignment(SwingConstants.LEFT);
		add(btnLoc);
	}
}
