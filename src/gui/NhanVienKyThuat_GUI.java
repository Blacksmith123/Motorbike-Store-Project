package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class NhanVienKyThuat_GUI extends JPanel {
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
	public NhanVienKyThuat_GUI() {
		setLayout(null);
		
		JLabel lblThongTinNVKT = new JLabel("THÔNG TIN NHÂN VIÊN KỸ THUẬT");
		lblThongTinNVKT.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblThongTinNVKT.setBounds(380, 11, 341, 55);
		add(lblThongTinNVKT);
		
		JLabel lblMaNV = new JLabel("Mã nhân viên");
		lblMaNV.setBounds(59, 97, 64, 14);
		add(lblMaNV);
		
		JLabel lblTenNV = new JLabel("Tên nhân viên");
		lblTenNV.setBounds(59, 127, 79, 21);
		add(lblTenNV);
		
		JLabel lblDiaChi = new JLabel("Địa chỉ");
		lblDiaChi.setBounds(59, 173, 64, 14);
		add(lblDiaChi);
		
		JLabel lblSDT = new JLabel("Số điện thoại");
		lblSDT.setBounds(59, 219, 64, 14);
		add(lblSDT);
		
		JLabel lblChucVu = new JLabel("Chức vụ");
		lblChucVu.setBounds(688, 97, 46, 14);
		add(lblChucVu);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(688, 219, 46, 14);
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
		txtSDT.setBounds(163, 216, 227, 20);
		add(txtSDT);
		txtSDT.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(807, 216, 287, 20);
		add(txtEmail);
		txtEmail.setColumns(10);
		
		txtChucVu = new JTextField();
		txtChucVu.setBounds(807, 94, 287, 20);
		add(txtChucVu);
		txtChucVu.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Bậc thợ");
		lblNewLabel_1.setBounds(688, 129, 46, 14);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Số năm kinh nghiệm");
		lblNewLabel_2.setBounds(688, 173, 100, 14);
		add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(807, 125, 287, 22);
		add(comboBox);
		
		txtSoNamKinhNghiem = new JTextField();
		txtSoNamKinhNghiem.setBounds(807, 170, 287, 20);
		add(txtSoNamKinhNghiem);
		txtSoNamKinhNghiem.setColumns(10);
		
		JButton btnThem = new JButton("Thêm");
		btnThem.setBounds(348, 266, 89, 23);
		add(btnThem);
		
		JButton btnCapNhat = new JButton("Cập nhật");
		btnCapNhat.setBounds(447, 266, 89, 23);
		add(btnCapNhat);
		
		JButton btnXoa = new JButton("Xóa");
		btnXoa.setBounds(546, 266, 89, 23);
		add(btnXoa);
		
		JButton btnXoaTrang = new JButton("Xóa trắng");
		btnXoaTrang.setBounds(645, 266, 89, 23);
		add(btnXoaTrang);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 304, 1145, 315);
		add(scrollPane);
		
		table = new JTable();
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
