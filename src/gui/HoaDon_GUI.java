package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

public class HoaDon_GUI extends JPanel {
	private JTextField txtMaHD;
	private JTextField txtNgayLap;
	private JTable table;
	private JTextField txtTGBH;
	private JTextField txtDonGia;
	private JTextField txtSoLuong;
	private JTextField txtMaLoaiXe;
	private JTextField txtMaKH;
	private JPanel panel;
	private JTextField txtTimKiem;
	private JTextField txtMaNV;
	private JTextField txtMaCH;

	/**
	 * Create the panel.
	 */
	public HoaDon_GUI() {
		setLayout(null);
		
		JLabel lblThongTinHD = new JLabel("THÔNG TIN HÓA ĐƠN");
		lblThongTinHD.setFont(new Font("Arial", Font.BOLD, 24));
		lblThongTinHD.setBounds(432, 11, 360, 58);
		add(lblThongTinHD);
		
		JLabel lblMaHopDong = new JLabel("Mã hóa đơn");
		lblMaHopDong.setFont(new Font("Arial", Font.PLAIN, 16));
		lblMaHopDong.setBounds(32, 97, 110, 14);
		add(lblMaHopDong);
		
		JLabel lblNgayLap = new JLabel("Ngày lập");
		lblNgayLap.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNgayLap.setBounds(32, 125, 76, 17);
		add(lblNgayLap);
		
		txtMaHD = new JTextField();
		txtMaHD.setBounds(182, 96, 315, 20);
		add(txtMaHD);
		txtMaHD.setColumns(10);
		
		txtNgayLap = new JTextField();
		txtNgayLap.setBounds(181, 125, 316, 20);
		add(txtNgayLap);
		txtNgayLap.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 256, 1162, 315);
		add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Arial", Font.PLAIN, 16));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, "", null, null, null, null},
			},
			new String[] {
				"M\u00E3 h\u00F3a \u0111\u01A1n", "Ng\u00E0y l\u1EADp", "Th\u1EDDi gian b\u1EA3o h\u00E0nh", "\u0110\u01A1n gi\u00E1", "S\u1ED1 l\u01B0\u1EE3ng", "M\u00E3 lo\u1EA1i xe", "M\u00E3 kh\u00E1ch h\u00E0ng", "M\u00E3 nh\u00E2n vi\u00EAn", "M\u00E3 c\u1EEDa h\u00E0ng"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblTGBH = new JLabel("Thời gian bảo hành");
		lblTGBH.setFont(new Font("Arial", Font.PLAIN, 16));
		lblTGBH.setBounds(32, 158, 140, 22);
		add(lblTGBH);
		
		JLabel lblDonGia = new JLabel("Đơn giá");
		lblDonGia.setFont(new Font("Arial", Font.PLAIN, 16));
		lblDonGia.setBounds(32, 195, 91, 21);
		add(lblDonGia);
		
		JLabel lblSoLuong = new JLabel("Số lượng");
		lblSoLuong.setFont(new Font("Arial", Font.PLAIN, 16));
		lblSoLuong.setBounds(32, 227, 114, 25);
		add(lblSoLuong);
		
		JLabel lblMaLoaiXe = new JLabel("Mã loại xe");
		lblMaLoaiXe.setFont(new Font("Arial", Font.PLAIN, 16));
		lblMaLoaiXe.setBounds(660, 97, 98, 14);
		add(lblMaLoaiXe);
		
		JLabel lblMaKH = new JLabel("Mã khách hàng");
		lblMaKH.setFont(new Font("Arial", Font.PLAIN, 16));
		lblMaKH.setBounds(660, 126, 132, 14);
		add(lblMaKH);
		
		txtTGBH = new JTextField();
		txtTGBH.setBounds(182, 162, 315, 20);
		add(txtTGBH);
		txtTGBH.setColumns(10);
		
		txtDonGia = new JTextField();
		txtDonGia.setBounds(182, 194, 315, 20);
		add(txtDonGia);
		txtDonGia.setColumns(10);
		
		txtSoLuong = new JTextField();
		txtSoLuong.setColumns(10);
		txtSoLuong.setBounds(182, 226, 315, 20);
		add(txtSoLuong);
		
		txtMaLoaiXe = new JTextField();
		txtMaLoaiXe.setEditable(false);
		txtMaLoaiXe.setColumns(10);
		txtMaLoaiXe.setBounds(800, 97, 315, 20);
		add(txtMaLoaiXe);
		
		txtMaKH = new JTextField();
		txtMaKH.setEditable(false);
		txtMaKH.setColumns(10);
		txtMaKH.setBounds(800, 125, 315, 20);
		add(txtMaKH);
		
		panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 255, 255)), "Ch\u1ECDn ch\u1EE9c n\u0103ng", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(0, 570, 1162, 97);
		add(panel);
		panel.setLayout(null);
		
		JButton btnThem = new JButton("Thêm");
		btnThem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnThem.setFont(new Font("Arial", Font.PLAIN, 14));
		btnThem.setBounds(648, 21, 89, 23);
		panel.add(btnThem);
		
		JButton btnCapNhat = new JButton("Cập nhật");
		btnCapNhat.setFont(new Font("Arial", Font.PLAIN, 14));
		btnCapNhat.setBounds(747, 21, 120, 23);
		panel.add(btnCapNhat);
		
		JButton btnXoaTrang = new JButton("Xóa trắng");
		btnXoaTrang.setFont(new Font("Arial", Font.PLAIN, 14));
		btnXoaTrang.setBounds(877, 21, 123, 23);
		panel.add(btnXoaTrang);
		
		JButton btnXoa = new JButton("Xóa");
		btnXoa.setFont(new Font("Arial", Font.PLAIN, 14));
		btnXoa.setBounds(1010, 21, 105, 23);
		panel.add(btnXoa);
		
		txtTimKiem = new JTextField();
		txtTimKiem.setBounds(141, 22, 266, 20);
		panel.add(txtTimKiem);
		txtTimKiem.setColumns(10);
		
		JButton btnTimKiem = new JButton("Tìm kiếm");
		btnTimKiem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTimKiem.setFont(new Font("Arial", Font.PLAIN, 14));
		btnTimKiem.setBounds(20, 21, 111, 23);
		panel.add(btnTimKiem);

		
		JLabel lblMaNV = new JLabel("Mã nhân viên");
		lblMaNV.setFont(new Font("Arial", Font.PLAIN, 16));
		lblMaNV.setBounds(660, 163, 98, 14);
		add(lblMaNV);
		
		txtMaNV = new JTextField();
		txtMaNV.setEditable(false);
		txtMaNV.setBounds(800, 162, 315, 20);
		add(txtMaNV);
		txtMaNV.setColumns(10);
		
		JLabel lblMaCH = new JLabel("Mã cửa hàng");
		lblMaCH.setFont(new Font("Arial", Font.PLAIN, 16));
		lblMaCH.setBounds(660, 195, 98, 17);
		add(lblMaCH);
		
		txtMaCH = new JTextField();
		txtMaCH.setEditable(false);
		txtMaCH.setBounds(800, 194, 315, 20);
		add(txtMaCH);
		txtMaCH.setColumns(10);

	}
}
