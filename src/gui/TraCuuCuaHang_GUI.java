package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class TraCuuCuaHang_GUI extends JPanel {
	private JTextField txtMaCH;
	private JTextField txtTenCH;
	private JTextField txtEmail;
	private JTextField txtSDT;
	private JTextField txtMaBuuDien;
	private JTextField txtDuong;
	private JTextField txtTT;
	private JTable table;
	private JTextField txtTP;

	/**
	 * Create the panel.
	 */
	public TraCuuCuaHang_GUI() {
		setLayout(null);
		
		JLabel lblCuaHang = new JLabel("THÔNG TIN CỬA HÀNG");
		lblCuaHang.setFont(new Font("Arial", Font.BOLD, 24));
		lblCuaHang.setBounds(403, 11, 336, 55);
		add(lblCuaHang);
		
		JLabel lblMaCuaHang = new JLabel("Mã cửa hàng");
		lblMaCuaHang.setFont(new Font("Arial", Font.PLAIN, 16));
		lblMaCuaHang.setBounds(31, 97, 110, 14);
		add(lblMaCuaHang);
		
		JLabel lblTenCuaHang = new JLabel("Tên cửa hàng");
		lblTenCuaHang.setFont(new Font("Arial", Font.PLAIN, 16));
		lblTenCuaHang.setBounds(31, 127, 110, 21);
		add(lblTenCuaHang);
		
		JLabel lblSDT = new JLabel("Số điện thoại");
		lblSDT.setFont(new Font("Arial", Font.PLAIN, 16));
		lblSDT.setBounds(31, 171, 110, 19);
		add(lblSDT);
		
		JLabel lblDuong = new JLabel("Đường");
		lblDuong.setFont(new Font("Arial", Font.PLAIN, 16));
		lblDuong.setBounds(698, 97, 99, 14);
		add(lblDuong);
		
		JLabel lblThanhPho = new JLabel("Thành phố");
		lblThanhPho.setFont(new Font("Arial", Font.PLAIN, 16));
		lblThanhPho.setBounds(698, 126, 98, 22);
		add(lblThanhPho);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Arial", Font.PLAIN, 16));
		lblEmail.setBounds(31, 217, 64, 14);
		add(lblEmail);
		
		txtMaCH = new JTextField();
		txtMaCH.setBounds(163, 94, 227, 20);
		add(txtMaCH);
		txtMaCH.setColumns(10);
		
		txtTenCH = new JTextField();
		txtTenCH.setBounds(163, 127, 227, 20);
		add(txtTenCH);
		txtTenCH.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(163, 216, 227, 20);
		add(txtEmail);
		txtEmail.setColumns(10);
		
		txtSDT = new JTextField();
		txtSDT.setBounds(163, 170, 227, 20);
		add(txtSDT);
		txtSDT.setColumns(10);
		
		txtMaBuuDien = new JTextField();
		txtMaBuuDien.setBounds(807, 216, 287, 20);
		add(txtMaBuuDien);
		txtMaBuuDien.setColumns(10);
		
		txtDuong = new JTextField();
		txtDuong.setBounds(807, 94, 287, 20);
		add(txtDuong);
		txtDuong.setColumns(10);
		
		JLabel lblTinhTrang = new JLabel("Tình trạng");
		lblTinhTrang.setFont(new Font("Arial", Font.PLAIN, 16));
		lblTinhTrang.setBounds(699, 173, 98, 21);
		add(lblTinhTrang);
		
		JLabel lblMaBuuDien = new JLabel("Mã bưu điện");
		lblMaBuuDien.setFont(new Font("Arial", Font.PLAIN, 16));
		lblMaBuuDien.setBounds(698, 219, 100, 14);
		add(lblMaBuuDien);
		
		txtTT = new JTextField();
		txtTT.setBounds(807, 170, 287, 20);
		add(txtTT);
		txtTT.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 255, 1211, 346);
		add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Arial", Font.PLAIN, 16));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, "", null, null, null},
			},
			new String[] {
				"M\u00E3 c\u1EEDa h\u00E0ng", "T\u00EAn c\u1EEDa h\u00E0ng", "S\u1ED1 \u0111i\u1EC7n tho\u1EA1i", "Email", "\u0110\u01B0\u1EDDng", "Th\u00E0nh ph\u1ED1", "T\u00ECnh tr\u1EA1ng", "M\u00E3 b\u01B0u \u0111i\u1EC7n"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(78);
		table.getColumnModel().getColumn(6).setPreferredWidth(108);
		scrollPane.setViewportView(table);
		
		txtTP = new JTextField();
		txtTP.setBounds(807, 127, 287, 20);
		add(txtTP);
		txtTP.setColumns(10);

	}

}
