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

public class TraCuuKH_GUI extends JPanel {

	private JTextField txtMaKH;
	private JTextField txtHoKH;
	private JTextField txtDiaChi;
	private JTextField txtSDT;
	private JTextField txtEmail;
	private JTextField txt;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public TraCuuKH_GUI() {
		setLayout(null);
		
		JLabel lblThongTinNVHC = new JLabel("THÔNG TIN KHÁCH HÀNG");
		lblThongTinNVHC.setFont(new Font("Arial", Font.BOLD, 24));
		lblThongTinNVHC.setBounds(421, 23, 371, 55);
		add(lblThongTinNVHC);
		
		JLabel lblMaKH = new JLabel("Mã khách hàng");
		lblMaKH.setFont(new Font("Arial", Font.PLAIN, 16));
		lblMaKH.setBounds(26, 94, 128, 17);
		add(lblMaKH);
		
		JLabel lblTenNV = new JLabel("Họ khách hàng");
		lblTenNV.setFont(new Font("Arial", Font.PLAIN, 16));
		lblTenNV.setBounds(26, 127, 111, 26);
		add(lblTenNV);
		
		JLabel lblDiaChi = new JLabel("Địa chỉ");
		lblDiaChi.setFont(new Font("Arial", Font.PLAIN, 16));
		lblDiaChi.setBounds(26, 198, 111, 26);
		add(lblDiaChi);
		
		JLabel lblSDT = new JLabel("Số điện thoại");
		lblSDT.setFont(new Font("Arial", Font.PLAIN, 16));
		lblSDT.setBounds(659, 97, 133, 26);
		add(lblSDT);
		
		JLabel lblTenKH = new JLabel("Tên khách hàng");
		lblTenKH.setFont(new Font("Arial", Font.PLAIN, 16));
		lblTenKH.setBounds(26, 164, 128, 23);
		add(lblTenKH);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Arial", Font.PLAIN, 16));
		lblEmail.setBounds(659, 131, 69, 18);
		add(lblEmail);
		
		txtMaKH = new JTextField();
		txtMaKH.setBounds(163, 94, 227, 20);
		add(txtMaKH);
		txtMaKH.setColumns(10);
		
		txtHoKH = new JTextField();
		txtHoKH.setBounds(163, 127, 227, 20);
		add(txtHoKH);
		txtHoKH.setColumns(10);
		
		txtDiaChi = new JTextField();
		txtDiaChi.setBounds(163, 203, 227, 20);
		add(txtDiaChi);
		txtDiaChi.setColumns(10);
		
		txtSDT = new JTextField();
		txtSDT.setBounds(804, 94, 287, 20);
		add(txtSDT);
		txtSDT.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(804, 127, 287, 20);
		add(txtEmail);
		txtEmail.setColumns(10);
		
		txt = new JTextField();
		txt.setBounds(163, 163, 224, 20);
		add(txt);
		txt.setColumns(10);
		
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 244, 1139, 324);
		add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Arial", Font.PLAIN, 16));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
			},
			new String[] {
				"M\u00E3 kh\u00E1ch h\u00E0ng", "H\u1ECD kh\u00E1ch h\u00E0ng", "T\u00EAn kh\u00E1ch h\u00E0ng", "\u0110\u1ECBa ch\u1EC9", "S\u1ED1 \u0111i\u1EC7n tho\u1EA1i", "Email"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(78);
		scrollPane.setViewportView(table);


	}
}
