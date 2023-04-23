package gui;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Font;
import java.awt.Panel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Xe_GUI extends JPanel {

	private JTable table;
	private Component txtSoNamKinhNghiem;
	private JTextField txtChucVu;
	private JTextField txtDiaChi;
	private Component txtSDT;
	private JTextField txtTenNV;
	private JTextField txtMa;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public Xe_GUI() {
		setLayout(null);

		JLabel lblNewLabel = new JLabel("THÔNG TIN XE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(411, 10, 313, 66);
		add(lblNewLabel);

		JLabel lblXe = new JLabel("Mã xe:");
		lblXe.setFont(new Font("Arial", Font.PLAIN, 16));
		lblXe.setBounds(59, 95, 100, 28);
		add(lblXe);

		JLabel lblSoMay = new JLabel("Số máy:\r\n");
		lblSoMay.setFont(new Font("Arial", Font.PLAIN, 16));
		lblSoMay.setBounds(59, 131, 100, 28);
		add(lblSoMay);

		JLabel lblSoKhung = new JLabel("Số khung:");
		lblSoKhung.setFont(new Font("Arial", Font.PLAIN, 16));
		lblSoKhung.setBounds(59, 169, 100, 28);
		add(lblSoKhung);

		JLabel lblNgayNhapXe = new JLabel("Ngày nhập xe:\r\n");
		lblNgayNhapXe.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNgayNhapXe.setBounds(59, 209, 100, 28);
		add(lblNgayNhapXe);

		JLabel lblNhaPhanPhoi = new JLabel("Nhà phân phối:");
		lblNhaPhanPhoi.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNhaPhanPhoi.setBounds(591, 97, 122, 28);
		add(lblNhaPhanPhoi);

		lblSoMay.setFont(new Font("Arial", Font.PLAIN, 16));

		txtMa = new JTextField();
		txtMa.setBounds(163, 102, 227, 20);
		add(txtMa);
		txtMa.setColumns(10);

		txtTenNV = new JTextField();
		txtTenNV.setBounds(163, 138, 227, 20);
		add(txtTenNV);
		txtTenNV.setColumns(10);

		txtDiaChi = new JTextField();
		txtDiaChi.setBounds(163, 176, 227, 20);
		add(txtDiaChi);
		txtDiaChi.setColumns(10);

		txtSDT = new JTextField();
		txtSDT.setBounds(163, 216, 227, 20);
		add(txtSDT);
		((JTextField) txtSDT).setColumns(10);

		txtChucVu = new JTextField();
		txtChucVu.setBounds(713, 102, 287, 20);
		add(txtChucVu);
		txtChucVu.setColumns(10);

		JLabel lbMaLoaiXe = new JLabel("Mã loại xe:");
		lbMaLoaiXe.setFont(new Font("Arial", Font.PLAIN, 16));
		lbMaLoaiXe.setBounds(591, 176, 122, 28);
		add(lbMaLoaiXe);

		txtSoNamKinhNghiem = new JTextField();
		txtSoNamKinhNghiem.setBounds(713, 183, 287, 20);
		add(txtSoNamKinhNghiem);
		((JTextField) txtSoNamKinhNghiem).setColumns(10);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 243, 1160, 313);
		add(scrollPane);

		table = new JTable();
		table.setFont(new Font("Arial", Font.PLAIN, 16));
		table.setBorder(new LineBorder(new Color(0, 191, 255)));
		table.setBackground(new Color(255, 255, 255));
		table.setModel(new DefaultTableModel(new Object[][] { { null, null, null, "", null, null }, },
				new String[] { "M\u00E3 xe", "S\u00F3 m\u00E1y", "S\u1ED1 khung", "Ng\u00E0y nh\u1EADp xe",
						"M\u00E3 nh\u00E0 ph\u00E2n ph\u1ED1i", "M\u00E3 lo\u1EA1i xe" }) {
			boolean[] columnEditables = new boolean[] { false, false, false, false, false, false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(1).setPreferredWidth(85);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(4).setPreferredWidth(99);
		scrollPane.setViewportView(table);

		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 0, 0));
		panel.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 255, 255), new Color(160, 160, 160)),
				"Ch\u1ECDn ch\u1EE9c n\u0103ng", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(0, 555, 1160, 112);
		add(panel);
		panel.setLayout(null);

		JButton btnThem = new JButton("Thêm");
		btnThem.setFont(new Font("Arial", Font.PLAIN, 14));
		btnThem.setBackground(Color.CYAN);
		btnThem.setForeground(new Color(0, 0, 0));
		btnThem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnThem.setBounds(470, 52, 100, 30);
		panel.add(btnThem);

		JButton btnCapNhat = new JButton("Cập nhật");
		btnCapNhat.setFont(new Font("Arial", Font.PLAIN, 14));
		btnCapNhat.setBackground(Color.CYAN);
		btnCapNhat.setBounds(580, 52, 100, 30);
		panel.add(btnCapNhat);

		JButton btnXoa = new JButton("Xóa");
		btnXoa.setFont(new Font("Arial", Font.PLAIN, 14));
		btnXoa.setBackground(Color.CYAN);
		btnXoa.setBounds(690, 52, 100, 30);
		panel.add(btnXoa);

		JButton btnXoaTrang = new JButton("Xóa trắng");
		btnXoaTrang.setFont(new Font("Arial", Font.PLAIN, 14));
		btnXoaTrang.setBackground(Color.CYAN);
		btnXoaTrang.setBounds(800, 52, 100, 30);
		panel.add(btnXoaTrang);

		textField = new JTextField();
		textField.setBounds(27, 63, 200, 19);
		panel.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Tìm mã xe:");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(27, 40, 110, 13);
		panel.add(lblNewLabel_1);

		JButton btnTimKiem = new JButton("Tìm ");
		btnTimKiem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTimKiem.setFont(new Font("Arial", Font.PLAIN, 14));
		btnTimKiem.setBackground(Color.CYAN);
		btnTimKiem.setBounds(237, 52, 100, 30);
		panel.add(btnTimKiem);

	}
}
