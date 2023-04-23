package gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class TraCuuNVKT_GUI extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtMa;
	private JTextField txtTenNV;
	private JTextField txtDiaChi;
	private JTextField txtSDT;
	private JTextField txtEmail;
	private JTextField txtChucVu;
	private JTextField txtSoNamKinhNghiem;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public TraCuuNVKT_GUI() {
		setLayout(null);
		
		JLabel lblThongTinNVKT = new JLabel("THÔNG TIN NHÂN VIÊN KỸ THUẬT");
		lblThongTinNVKT.setFont(new Font("Arial", Font.BOLD, 24));
		lblThongTinNVKT.setBounds(362, 11, 426, 55);
		add(lblThongTinNVKT);
		
		JLabel lblMaNV = new JLabel("Mã nhân viên");
		lblMaNV.setFont(new Font("Arial", Font.PLAIN, 16));
		lblMaNV.setBounds(10, 83, 143, 28);
		add(lblMaNV);
		
		JLabel lblTenNV = new JLabel("Tên nhân viên");
		lblTenNV.setFont(new Font("Arial", Font.PLAIN, 16));
		lblTenNV.setBounds(10, 125, 143, 21);
		add(lblTenNV);
		
		JLabel lblDiaChi = new JLabel("Địa chỉ");
		lblDiaChi.setFont(new Font("Arial", Font.PLAIN, 16));
		lblDiaChi.setBounds(10, 157, 143, 28);
		add(lblDiaChi);
		
		JLabel lblSDT = new JLabel("Số điện thoại");
		lblSDT.setFont(new Font("Arial", Font.PLAIN, 16));
		lblSDT.setBounds(10, 205, 143, 28);
		add(lblSDT);
		
		JLabel lblChucVu = new JLabel("Chức vụ");
		lblChucVu.setFont(new Font("Arial", Font.PLAIN, 16));
		lblChucVu.setBounds(653, 87, 144, 24);
		add(lblChucVu);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Arial", Font.PLAIN, 16));
		lblEmail.setBounds(653, 205, 90, 28);
		add(lblEmail);
		
		txtMa = new JTextField();
		txtMa.setBounds(163, 89, 227, 20);
		add(txtMa);
		txtMa.setColumns(10);
		
		txtTenNV = new JTextField();
		txtTenNV.setBounds(163, 127, 227, 20);
		add(txtTenNV);
		txtTenNV.setColumns(10);
		
		txtDiaChi = new JTextField();
		txtDiaChi.setBounds(163, 163, 227, 20);
		add(txtDiaChi);
		txtDiaChi.setColumns(10);
		
		txtSDT = new JTextField();
		txtSDT.setBounds(163, 211, 227, 20);
		add(txtSDT);
		txtSDT.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(807, 211, 287, 20);
		add(txtEmail);
		txtEmail.setColumns(10);
		
		txtChucVu = new JTextField();
		txtChucVu.setBounds(807, 94, 287, 20);
		add(txtChucVu);
		txtChucVu.setColumns(10);
		
		JLabel lblBacTho = new JLabel("Bậc thợ");
		lblBacTho.setFont(new Font("Arial", Font.PLAIN, 16));
		lblBacTho.setBounds(653, 122, 144, 20);
		add(lblBacTho);
		
		JLabel lblSoNamKinhNghiem = new JLabel("Số năm kinh nghiệm");
		lblSoNamKinhNghiem.setFont(new Font("Arial", Font.PLAIN, 16));
		lblSoNamKinhNghiem.setBounds(653, 157, 144, 28);
		add(lblSoNamKinhNghiem);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(807, 125, 287, 22);
		add(comboBox);
		
		txtSoNamKinhNghiem = new JTextField();
		txtSoNamKinhNghiem.setBounds(807, 163, 287, 20);
		add(txtSoNamKinhNghiem);
		txtSoNamKinhNghiem.setColumns(10);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 244, 1145, 315);
		add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Arial", Font.PLAIN, 16));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"M\u00E3 nh\u00E2n vi\u00EAn", "T\u00EAn nh\u00E2n vi\u00EAn", "\u0110\u1ECBa ch\u1EC9", "S\u1ED1 \u0111i\u1EC7n tho\u1EA1i", "Ch\u1EE9c v\u1EE5", "B\u1EADc th\u1EE3", "S\u1ED1 n\u0103m kinh nghi\u1EC7m", "Email"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(78);
		table.getColumnModel().getColumn(6).setPreferredWidth(108);
		scrollPane.setViewportView(table);

	}

}
