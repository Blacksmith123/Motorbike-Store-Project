package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HopDong_GUI extends JPanel {
	private JTextField txtMaHD;
	private JTextField txtTenHD;
	private JTable table;
	private JTextField txtNgayHopDong;
	private JTextField txtThoiGianBaoHanh;
	private JTextField txtTienPhaiThanhToan;
	private JTextField txtTienDaThanhToan;
	private JTextField txtNhanVienLapHopDong;

	/**
	 * Create the panel.
	 */
	public HopDong_GUI() {
		setLayout(null);
		
		JLabel lblThongTinHD = new JLabel("THÔNG TIN HỢP ĐỒNG");
		lblThongTinHD.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblThongTinHD.setBounds(463, 22, 360, 58);
		add(lblThongTinHD);
		
		JLabel lblMaHopDong = new JLabel("Mã hợp đồng");
		lblMaHopDong.setBounds(32, 115, 76, 14);
		add(lblMaHopDong);
		
		JLabel lblTenHopDong = new JLabel("Tên hợp đồng");
		lblTenHopDong.setBounds(32, 151, 66, 14);
		add(lblTenHopDong);
		
		txtMaHD = new JTextField();
		txtMaHD.setBounds(131, 112, 315, 20);
		add(txtMaHD);
		txtMaHD.setColumns(10);
		
		txtTenHD = new JTextField();
		txtTenHD.setBounds(130, 148, 316, 20);
		add(txtTenHD);
		txtTenHD.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 323, 1287, 338);
		add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, "", null, null},
			},
			new String[] {
				"M\u00E3 h\u1EE3p \u0111\u1ED3ng", "T\u00EAn h\u1EE3p \u0111\u1ED3ng", "Ng\u00E0y h\u1EE3p \u0111\u1ED3ng", "Th\u1EDDi gian b\u1EA3o h\u00E0nh", "Ti\u1EC1n ph\u1EA3i thanh to\u00E1n", "Ti\u1EC1n \u0111\u00E3 thanh to\u00E1n", "Nh\u00E2n vi\u00EAn l\u1EADp h\u1EE3p \u0111\u1ED3ng "
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblNgayHopDong = new JLabel("Ngày hợp đồng");
		lblNgayHopDong.setBounds(32, 195, 76, 14);
		add(lblNgayHopDong);
		
		JLabel lblThoiGianBaoHanh = new JLabel("Thời gian bảo hành");
		lblThoiGianBaoHanh.setBounds(32, 238, 91, 14);
		add(lblThoiGianBaoHanh);
		
		JLabel lblTienPhaiThanhToan = new JLabel("Tiền phải thanh toán");
		lblTienPhaiThanhToan.setBounds(806, 126, 114, 14);
		add(lblTienPhaiThanhToan);
		
		JLabel lblTienDaThanhToan = new JLabel("Tiền đã thanh toán");
		lblTienDaThanhToan.setBounds(806, 162, 98, 14);
		add(lblTienDaThanhToan);
		
		JLabel lblNhanVienLapHopDong = new JLabel("Nhân viên lập hợp đồng");
		lblNhanVienLapHopDong.setBounds(806, 195, 114, 14);
		add(lblNhanVienLapHopDong);
		
		txtNgayHopDong = new JTextField();
		txtNgayHopDong.setBounds(131, 192, 315, 20);
		add(txtNgayHopDong);
		txtNgayHopDong.setColumns(10);
		
		txtThoiGianBaoHanh = new JTextField();
		txtThoiGianBaoHanh.setBounds(131, 235, 315, 20);
		add(txtThoiGianBaoHanh);
		txtThoiGianBaoHanh.setColumns(10);
		
		txtTienPhaiThanhToan = new JTextField();
		txtTienPhaiThanhToan.setColumns(10);
		txtTienPhaiThanhToan.setBounds(935, 123, 315, 20);
		add(txtTienPhaiThanhToan);
		
		txtTienDaThanhToan = new JTextField();
		txtTienDaThanhToan.setColumns(10);
		txtTienDaThanhToan.setBounds(935, 159, 315, 20);
		add(txtTienDaThanhToan);
		
		txtNhanVienLapHopDong = new JTextField();
		txtNhanVienLapHopDong.setColumns(10);
		txtNhanVienLapHopDong.setBounds(935, 192, 315, 20);
		add(txtNhanVienLapHopDong);
		
		JButton btnThem = new JButton("Thêm");
		btnThem.setBounds(417, 280, 89, 23);
		add(btnThem);
		
		JButton btnCapNhat = new JButton("Cập nhật");
		btnCapNhat.setBounds(541, 280, 89, 23);
		add(btnCapNhat);
		
		JButton btnXoa = new JButton("Xóa");
		btnXoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnXoa.setBounds(679, 280, 89, 23);
		add(btnXoa);
		
		JButton btnXoaTrang = new JButton("Xóa trắng");
		btnXoaTrang.setBounds(815, 280, 89, 23);
		add(btnXoaTrang);

	}
}
