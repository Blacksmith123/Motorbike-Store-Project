package gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class TraCuuHD_GUI extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtMaHD;
	private JTextField txtNgayLap;
	private JTable table;
	private JTextField txtTGBH;
	private JTextField txtDonGia;
	private JTextField txtSoLuong;
	private JTextField txtMaLoaiXe;
	private JTextField txtMaKH;
	private JTextField txtMaNV;
	private JTextField txtMaCH;

	/**
	 * Create the panel.
	 */
	public TraCuuHD_GUI() {
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
		scrollPane.setBounds(10, 263, 1139, 338);
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
		lblTGBH.setFont(new Font("Arial", Font.PLAIN, 14));
		lblTGBH.setBounds(32, 163, 140, 14);
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
		txtMaLoaiXe.setColumns(10);
		txtMaLoaiXe.setBounds(800, 96, 315, 20);
		add(txtMaLoaiXe);
		
		txtMaKH = new JTextField();
		txtMaKH.setColumns(10);
		txtMaKH.setBounds(800, 125, 315, 20);
		add(txtMaKH);
		
		JLabel lblMaNV = new JLabel("Mã nhân viên");
		lblMaNV.setFont(new Font("Arial", Font.PLAIN, 16));
		lblMaNV.setBounds(660, 163, 98, 14);
		add(lblMaNV);
		
		txtMaNV = new JTextField();
		txtMaNV.setBounds(800, 162, 315, 20);
		add(txtMaNV);
		txtMaNV.setColumns(10);
		
		JLabel lblMaCH = new JLabel("Mã cửa hàng");
		lblMaCH.setFont(new Font("Arial", Font.PLAIN, 16));
		lblMaCH.setBounds(660, 195, 98, 17);
		add(lblMaCH);
		
		txtMaCH = new JTextField();
		txtMaCH.setBounds(800, 194, 315, 20);
		add(txtMaCH);
		txtMaCH.setColumns(10);

	}

}
