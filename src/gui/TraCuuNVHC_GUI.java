package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

public class TraCuuNVHC_GUI extends JPanel {
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
	public TraCuuNVHC_GUI() {
		setLayout(null);
		
		JLabel lblThongTinNVHC = new JLabel("THÔNG TIN NHÂN VIÊN HÀNH CHÍNH");
		lblThongTinNVHC.setFont(new Font("Arial", Font.BOLD, 24));
		lblThongTinNVHC.setBounds(391, 21, 452, 55);
		add(lblThongTinNVHC);
		
		JLabel lblMaNV = new JLabel("Mã nhân viên");
		lblMaNV.setFont(new Font("Arial", Font.PLAIN, 16));
		lblMaNV.setBounds(27, 89, 126, 22);
		add(lblMaNV);
		
		JLabel lblTenNV = new JLabel("Tên nhân viên");
		lblTenNV.setFont(new Font("Arial", Font.PLAIN, 16));
		lblTenNV.setBounds(27, 125, 126, 21);
		add(lblTenNV);
		
		JLabel lblDiaChi = new JLabel("Địa chỉ");
		lblDiaChi.setFont(new Font("Arial", Font.PLAIN, 16));
		lblDiaChi.setBounds(27, 171, 111, 19);
		add(lblDiaChi);
		
		JLabel lblSDT = new JLabel("Số điện thoại");
		lblSDT.setFont(new Font("Arial", Font.PLAIN, 16));
		lblSDT.setBounds(27, 201, 111, 32);
		add(lblSDT);
		
		JLabel lblChucVu = new JLabel("Chức vụ");
		lblChucVu.setFont(new Font("Arial", Font.PLAIN, 16));
		lblChucVu.setBounds(661, 93, 136, 18);
		add(lblChucVu);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Arial", Font.PLAIN, 16));
		lblEmail.setBounds(661, 210, 127, 14);
		add(lblEmail);
		
		txtMa = new JTextField();
		txtMa.setBounds(163, 94, 227, 20);
		add(txtMa);
		txtMa.setColumns(10);
		
		txtTenNV = new JTextField();
		txtTenNV.setBounds(163, 127, 227, 20);
		add(txtTenNV);
		txtTenNV.setColumns(10);
		
		txtDiaChi = new JTextField();
		txtDiaChi.setBounds(163, 170, 227, 20);
		add(txtDiaChi);
		txtDiaChi.setColumns(10);
		
		txtSDT = new JTextField();
		txtSDT.setBounds(163, 209, 227, 20);
		add(txtSDT);
		txtSDT.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(807, 216, 287, 20);
		add(txtEmail);
		txtEmail.setColumns(10);
		
		txtChucVu = new JTextField();
		txtChucVu.setBounds(807, 92, 287, 20);
		add(txtChucVu);
		txtChucVu.setColumns(10);
		
		JLabel lblPhongBan = new JLabel("Phòng ban");
		lblPhongBan.setFont(new Font("Arial", Font.PLAIN, 16));
		lblPhongBan.setBounds(661, 125, 127, 21);
		add(lblPhongBan);
		
		JLabel lblTrinhDoHocVan = new JLabel("Trình độ học vấn");
		lblTrinhDoHocVan.setFont(new Font("Arial", Font.PLAIN, 16));
		lblTrinhDoHocVan.setBounds(661, 169, 136, 22);
		add(lblTrinhDoHocVan);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(807, 125, 287, 22);
		add(comboBox);
		
		txtSoNamKinhNghiem = new JTextField();
		txtSoNamKinhNghiem.setBounds(807, 170, 287, 20);
		add(txtSoNamKinhNghiem);
		txtSoNamKinhNghiem.setColumns(10);
		
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 244, 1139, 315);
		add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Arial", Font.PLAIN, 16));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"M\u00E3 nh\u00E2n vi\u00EAn", "T\u00EAn nh\u00E2n vi\u00EAn", "\u0110\u1ECBa ch\u1EC9", "S\u1ED1 \u0111i\u1EC7n tho\u1EA1i", "Ch\u1EE9c v\u1EE5", "Ph\u00F2ng ban", "Tr\u00ECnh \u0111\u1ED9 h\u1ECDc v\u1EA5n", "Email"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(78);
		table.getColumnModel().getColumn(6).setPreferredWidth(108);
		scrollPane.setViewportView(table);


	}
}
