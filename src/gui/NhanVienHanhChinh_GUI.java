package gui;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import java.awt.Component;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class NhanVienHanhChinh_GUI extends JPanel {

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
	public NhanVienHanhChinh_GUI() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("THÔNG TIN NHÂN VIÊN HÀNH CHÍNH");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(391, 21, 371, 55);
		add(lblNewLabel);
		
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
		
		JLabel lblPhongBan = new JLabel("Phòng ban");
		lblPhongBan.setBounds(688, 129, 64, 14);
		add(lblPhongBan);
		
		JLabel lblTrinhDoHocVan = new JLabel("Trình độ học vấn");
		lblTrinhDoHocVan.setBounds(688, 173, 100, 14);
		add(lblTrinhDoHocVan);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(807, 125, 287, 22);
		add(comboBox);
		
		txtSoNamKinhNghiem = new JTextField();
		txtSoNamKinhNghiem.setBounds(807, 170, 287, 20);
		add(txtSoNamKinhNghiem);
		txtSoNamKinhNghiem.setColumns(10);
		
		JButton btnThem = new JButton("Thêm");
		btnThem.setBounds(376, 266, 89, 23);
		add(btnThem);
		
		JButton btnCapNhat = new JButton("Cập nhật");
		btnCapNhat.setBounds(475, 266, 89, 23);
		add(btnCapNhat);
		
		JButton btnXoa = new JButton("Xóa");
		btnXoa.setBounds(574, 266, 89, 23);
		add(btnXoa);
		
		JButton btnXoaTrang = new JButton("Xóa trắng");
		btnXoaTrang.setBounds(673, 266, 89, 23);
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
				"M\u00E3 nh\u00E2n vi\u00EAn", "T\u00EAn nh\u00E2n vi\u00EAn", "\u0110\u1ECBa ch\u1EC9", "S\u1ED1 \u0111i\u1EC7n tho\u1EA1i", "Ch\u1EE9c v\u1EE5", "Ph\u00F2ng ban", "Tr\u00ECnh \u0111\u1ED9 h\u1ECDc v\u1EA5n", "Email"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(78);
		table.getColumnModel().getColumn(6).setPreferredWidth(108);
		scrollPane.setViewportView(table);


	}

}
