package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import connect.ConnectDB;
import dao.ChiTietHoaDon_DAO;
import dao.CuaHang_DAO;
import dao.HoaDon_DAO;
import dao.KhachHang_DAO;
import dao.NhanVienHanhChinh_DAO;
import entity.ChiTietHoaDon;
import entity.CuaHang;
import entity.HoaDon;
import entity.KhachHang;
import entity.NhanVienHanhChinh;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.DropMode;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HoaDon_GUI extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTable tableHd;
	private DefaultTableModel modelHd;
	private DefaultTableModel modelHdDetail;
	private JTextField textMaHD;
	private JTable tableHddetail;
	private JTextField textNgaylap;
	private JTextField textThoigianbaohanh;
	private JTextField textField_3;
	private HoaDon_DAO hoaDon_DAO;
	private ChiTietHoaDon_DAO chiTietHoaDon_DAO;
	private CuaHang_DAO cuaHang_DAO;
	private KhachHang_DAO khachHang_DAO;
	private NhanVienHanhChinh_DAO nhanVienHanhChinh_DAO;
	private List<CuaHang> dsCuaHang;
	// xetrongkhodao
	private JComboBox cbMakhachhang;
	private JComboBox cbMacuahang;
	private JComboBox cbManhanvien;
	private JButton btnTim;

	/**
	 * Create the panel.
	 * 
	 * @throws SQLException
	 */
	public HoaDon_GUI() throws SQLException {
		// bat buoc
		ConnectDB.getInstance().connect();
//		ở trên
		setBorder(new LineBorder(new Color(0, 0, 0)));
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		// chang
		dsCuaHang = new ArrayList<CuaHang>();
		cuaHang_DAO = new CuaHang_DAO();
		dsCuaHang = cuaHang_DAO.getAllCuaHang();
		// ========== cb nhan vien hành chánh
		nhanVienHanhChinh_DAO = new NhanVienHanhChinh_DAO();
		int size = dsCuaHang.size();
		for (int i = 0; i < size; i++) {
			dsCuaHang.get(i).setDsNhanVienHc(new ArrayList<NhanVienHanhChinh>(
					nhanVienHanhChinh_DAO.getNhanVienHanhChinhTheoMaCh(dsCuaHang.get(i).getMa())));
		}

		JPanel panel = new JPanel();
		panel.setBackground(new Color(165, 42, 42));
		panel.setBorder(new LineBorder(Color.CYAN));
		panel.setBounds(442, 299, 748, 401);
		add(panel);
		panel.setLayout(null);
		// table
		String[] column = { "Mã hóa đơn", "Ngày lập", "Thời gian bảo hành", "Mã khách hàng", "Mã cửa hàng",
				"Mã nhân viên" };
		modelHd = new DefaultTableModel(column, 0);
		tableHd = new JTable(modelHd);
		tableHd.setRowHeight(25);
		// click chuột vào bảng
		tableHd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row = tableHd.getSelectedRow();
				textMaHD.setText(tableHd.getValueAt(row, 0).toString());
				textNgaylap.setText(tableHd.getValueAt(row, 1).toString());
				textThoigianbaohanh.setText(tableHd.getValueAt(row, 2).toString());
				cbMakhachhang.setSelectedItem(tableHd.getValueAt(row, 3).toString());
				cbMacuahang.setSelectedItem(tableHd.getValueAt(row, 4).toString());
			}
		});
		// Add a ListSelectionListener to the table
		ListSelectionModel model = tableHd.getSelectionModel();
		model.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				// Check if the current cell selection is not empty
				if (!e.getValueIsAdjusting()) {
					// Get the row index of the selected cell
					int rowIndex = tableHd.getSelectedRow();

					// Set the background color of the selected row
					tableHd.setSelectionBackground(Color.CYAN);
					tableHd.setRowSelectionInterval(rowIndex, rowIndex);
				}
			}
		});
		tableHd.setFont(new Font("Arial", Font.PLAIN, 16));
		JScrollPane scrollPane = new JScrollPane(tableHd, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setBounds(10, 10, 728, 381);
		panel.add(scrollPane);

		JPanel panelThongTin = new JPanel();
		panelThongTin.setBackground(SystemColor.text);
		panelThongTin.setBorder(new LineBorder(Color.CYAN));
		panelThongTin.setBounds(442, 39, 748, 236);
		add(panelThongTin);
		panelThongTin.setLayout(null);

		JLabel lblNewLabel_4 = new JLabel("Mã Hóa Đơn:\r\n");
		lblNewLabel_4.setForeground(new Color(165, 42, 42));
		lblNewLabel_4.setBackground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(10, 10, 105, 34);
		panelThongTin.add(lblNewLabel_4);

		textMaHD = new JTextField();
		textMaHD.setFont(new Font("Arial", Font.PLAIN, 16));
		textMaHD.setBounds(160, 18, 206, 24);
		panelThongTin.add(textMaHD);
		textMaHD.setColumns(10);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBorder(new LineBorder(new Color(165, 42, 42)));
		panel_2.setBounds(10, 378, 356, 147);
		panelThongTin.add(panel_2);
		panel_2.setLayout(null);

		JButton btnThem = new JButton("Thêm");
		btnThem.setBackground(Color.LIGHT_GRAY);
		btnThem.setForeground(new Color(165, 42, 42));
		btnThem.setFont(new Font("Arial", Font.PLAIN, 16));
		btnThem.setBounds(56, 32, 112, 27);
		panel_2.add(btnThem);

		JButton btnXoatrang = new JButton("Xóa Trắng");
		btnXoatrang.setForeground(new Color(165, 42, 42));
		btnXoatrang.setFont(new Font("Arial", Font.PLAIN, 16));
		btnXoatrang.setBackground(Color.LIGHT_GRAY);
		btnXoatrang.setBounds(212, 32, 112, 27);
		panel_2.add(btnXoatrang);

		JButton btnCapnhat = new JButton("Cập Nhật");
		btnCapnhat.setForeground(new Color(165, 42, 42));
		btnCapnhat.setFont(new Font("Arial", Font.PLAIN, 16));
		btnCapnhat.setBackground(Color.LIGHT_GRAY);
		btnCapnhat.setBounds(56, 69, 112, 27);
		panel_2.add(btnCapnhat);

		JButton btnXoa = new JButton("Xóa");
		btnXoa.setForeground(new Color(165, 42, 42));
		btnXoa.setFont(new Font("Arial", Font.PLAIN, 16));
		btnXoa.setBackground(Color.LIGHT_GRAY);
		btnXoa.setBounds(212, 69, 112, 27);
		panel_2.add(btnXoa);

		JButton btnLuu = new JButton("Lưu");
		btnLuu.setForeground(new Color(165, 42, 42));
		btnLuu.setFont(new Font("Arial", Font.PLAIN, 16));
		btnLuu.setBackground(Color.LIGHT_GRAY);
		btnLuu.setBounds(136, 106, 112, 27);
		panel_2.add(btnLuu);

		JLabel lblNewLabel_4_1 = new JLabel("Ngày Lập:\r\n");
		lblNewLabel_4_1.setForeground(new Color(165, 42, 42));
		lblNewLabel_4_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4_1.setBackground(Color.WHITE);
		lblNewLabel_4_1.setBounds(10, 55, 105, 34);
		panelThongTin.add(lblNewLabel_4_1);

		textNgaylap = new JTextField();
		textNgaylap.setFont(new Font("Arial", Font.PLAIN, 16));
		textNgaylap.setColumns(10);
		textNgaylap.setBounds(160, 65, 206, 24);
		panelThongTin.add(textNgaylap);

		JLabel lblNewLabel_4_1_1 = new JLabel("Thời gian bảo hành:");
		lblNewLabel_4_1_1.setForeground(new Color(165, 42, 42));
		lblNewLabel_4_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4_1_1.setBackground(Color.WHITE);
		lblNewLabel_4_1_1.setBounds(10, 99, 157, 34);
		panelThongTin.add(lblNewLabel_4_1_1);

		JLabel lblNewLabel_4_1_2 = new JLabel("Mã khách hàng:\r\n");
		lblNewLabel_4_1_2.setForeground(new Color(165, 42, 42));
		lblNewLabel_4_1_2.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4_1_2.setBackground(Color.WHITE);
		lblNewLabel_4_1_2.setBounds(10, 143, 132, 34);
		panelThongTin.add(lblNewLabel_4_1_2);

		JLabel lblNewLabel_4_1_3 = new JLabel("Mã cửa hàng:");
		lblNewLabel_4_1_3.setForeground(new Color(165, 42, 42));
		lblNewLabel_4_1_3.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4_1_3.setBackground(Color.WHITE);
		lblNewLabel_4_1_3.setBounds(10, 187, 105, 34);
		panelThongTin.add(lblNewLabel_4_1_3);

		JLabel lblNewLabel_4_1_4 = new JLabel("Mã nhân viên:");
		lblNewLabel_4_1_4.setForeground(new Color(165, 42, 42));
		lblNewLabel_4_1_4.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4_1_4.setBackground(Color.WHITE);
		lblNewLabel_4_1_4.setBounds(393, 10, 105, 34);
		panelThongTin.add(lblNewLabel_4_1_4);
		// ======== cb mã kh
		khachHang_DAO = new KhachHang_DAO();
		cbMakhachhang = new JComboBox();
		for (KhachHang kHang : khachHang_DAO.getAllKhachHang()) {
			cbMakhachhang.addItem(kHang.getMa());
		}
		cbMakhachhang.setFont(new Font("Arial", Font.PLAIN, 16));
		cbMakhachhang.setBounds(160, 152, 206, 21);
		panelThongTin.add(cbMakhachhang);
		// ======== cb mã cửa hàng
		cbMacuahang = new JComboBox();
		for (CuaHang cHang : dsCuaHang) {
			cbMacuahang.addItem(cHang.getMa());
		}
		cbMacuahang.setFont(new Font("Arial", Font.PLAIN, 16));
		cbMacuahang.setBounds(160, 196, 206, 21);
		panelThongTin.add(cbMacuahang);

		cbManhanvien = new JComboBox();
		for (NhanVienHanhChinh nv : dsCuaHang.get(0).getDsNhanVienHc()) {
			cbManhanvien.addItem(nv.getMa());
		}
		cbManhanvien.setFont(new Font("Arial", Font.PLAIN, 16));
		cbManhanvien.setBounds(508, 17, 206, 21);
		panelThongTin.add(cbManhanvien);
		// skien khi chon ma cua hang
		cbMacuahang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cbManhanvien.removeAllItems();
				for (CuaHang ch : dsCuaHang) {
					if (cbMacuahang.getSelectedItem().equals(ch.getMa())) {
						for (NhanVienHanhChinh nv : ch.getDsNhanVienHc()) {
							cbManhanvien.addItem(nv.getMa());
						}
						break;
					}
				}
			}
		});

		textThoigianbaohanh = new JTextField();
		textThoigianbaohanh.setFont(new Font("Arial", Font.PLAIN, 16));
		textThoigianbaohanh.setColumns(10);
		textThoigianbaohanh.setBounds(160, 104, 206, 24);
		panelThongTin.add(textThoigianbaohanh);

		JLabel lblNewLabel_4_1_4_1 = new JLabel("Tổng tiền:");
		lblNewLabel_4_1_4_1.setForeground(new Color(165, 42, 42));
		lblNewLabel_4_1_4_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4_1_4_1.setBackground(Color.WHITE);
		lblNewLabel_4_1_4_1.setBounds(393, 55, 105, 34);
		panelThongTin.add(lblNewLabel_4_1_4_1);

		textField_3 = new JTextField();
		textField_3.setEnabled(false);
		textField_3.setEditable(false);
		textField_3.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_3.setColumns(10);
		textField_3.setBounds(508, 60, 206, 24);
		panelThongTin.add(textField_3);

		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBorder(new LineBorder(new Color(165, 42, 42)));
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setBounds(393, 89, 338, 137);
		panelThongTin.add(panel_2_1);

		JButton btnThem_1 = new JButton("Thêm");
		btnThem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnThem_1.setForeground(new Color(165, 42, 42));
		btnThem_1.setFont(new Font("Arial", Font.PLAIN, 16));
		btnThem_1.setBackground(Color.LIGHT_GRAY);
		btnThem_1.setBounds(56, 32, 112, 27);
		panel_2_1.add(btnThem_1);

		JButton btnXoatrang_1 = new JButton("Xóa Trắng");
		btnXoatrang_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textMaHD.setText("");
				textNgaylap.setText("");
				textThoigianbaohanh.setText("");
			}
		});
		btnXoatrang_1.setForeground(new Color(165, 42, 42));
		btnXoatrang_1.setFont(new Font("Arial", Font.PLAIN, 16));
		btnXoatrang_1.setBackground(Color.LIGHT_GRAY);
		btnXoatrang_1.setBounds(212, 32, 112, 27);
		panel_2_1.add(btnXoatrang_1);

		JButton btnCapnhat_1 = new JButton("Cập Nhật");
		btnCapnhat_1.setForeground(new Color(165, 42, 42));
		btnCapnhat_1.setFont(new Font("Arial", Font.PLAIN, 16));
		btnCapnhat_1.setBackground(Color.LIGHT_GRAY);
		btnCapnhat_1.setBounds(56, 69, 112, 27);
		panel_2_1.add(btnCapnhat_1);

		JButton btnXoa_1 = new JButton("Xóa");
		btnXoa_1.setForeground(new Color(165, 42, 42));
		btnXoa_1.setFont(new Font("Arial", Font.PLAIN, 16));
		btnXoa_1.setBackground(Color.LIGHT_GRAY);
		btnXoa_1.setBounds(212, 69, 112, 27);
		panel_2_1.add(btnXoa_1);

		JButton btnLuu_1 = new JButton("Lưu");
		btnLuu_1.setForeground(new Color(165, 42, 42));
		btnLuu_1.setFont(new Font("Arial", Font.PLAIN, 16));
		btnLuu_1.setBackground(Color.LIGHT_GRAY);
		btnLuu_1.setBounds(136, 106, 112, 27);
		panel_2_1.add(btnLuu_1);

		JLabel lblNewLabel_1 = new JLabel("Thông Tin:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_1.setBounds(442, 10, 322, 27);
		add(lblNewLabel_1);

		JLabel lblNewLabel_3 = new JLabel("Quản Lí Hóa Đơn");
		lblNewLabel_3.setBackground(new Color(165, 42, 42));
		lblNewLabel_3.setForeground(Color.BLUE);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel_3.setBounds(10, 3, 1188, 37);
		add(lblNewLabel_3);

		JLabel lblNewLabel = new JLabel("Danh Sách Hóa Đơn:");
		lblNewLabel.setBounds(452, 275, 322, 27);
		add(lblNewLabel);
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));

		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(Color.CYAN));
		panel_3.setBackground(new Color(165, 42, 42));
		panel_3.setBounds(10, 39, 422, 661);
		add(panel_3);
//==================================table chi tiết hóa đơn
		String[] column_1 = { "Mã hóa đơn", "Mã loại xe", "Số lượng", "Đơn giá", "Thành tiền" };
		modelHdDetail = new DefaultTableModel(column_1, 0);
		tableHddetail = new JTable(modelHdDetail);
		tableHddetail.setRowHeight(25);
		tableHddetail.setFont(new Font("Arial", Font.PLAIN, 16));
		JScrollPane scrollPane_1 = new JScrollPane(tableHddetail, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane_1.setBounds(10, 125, 402, 489);
		panel_3.add(scrollPane_1);

		JLabel lblNewLabel_2 = new JLabel("Tìm Kiếm:");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(10, 10, 91, 54);
		panel_3.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 16));

		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 16));
		textField.setBounds(10, 56, 402, 27);
		panel_3.add(textField);
		textField.setColumns(10);

		JComboBox cbTim = new JComboBox();
		cbTim.setBounds(10, 91, 198, 24);
		panel_3.add(cbTim);
		cbTim.setForeground(Color.RED);
		cbTim.setFont(new Font("Arial", Font.PLAIN, 16));

		btnTim = new JButton("Tìm Kiếm");
		cbTim.addItem("Mã hóa đơn");
		cbTim.addItem("Ngày lập");
		cbTim.addItem("Mã khách hàng");
		cbTim.addItem("Mã cửa hàng");
		cbTim.addItem("Mã nhân viên");
		btnTim.setBounds(218, 90, 133, 27);
		panel_3.add(btnTim);
		btnTim.setHorizontalAlignment(SwingConstants.LEFT);
		btnTim.setIcon(new ImageIcon(
				"D:\\Study\\OOPJava\\21091031_TrinhMinhKhaa\\Motorbike-Store-Project\\data\\image\\icons8-search-30.png"));
		btnTim.setForeground(new Color(165, 42, 42));
		btnTim.setFont(new Font("Arial", Font.PLAIN, 16));
		btnTim.setBackground(Color.LIGHT_GRAY);
		btnTim.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnTim.setVerticalTextPosition(SwingConstants.CENTER);
		btnTim.setHorizontalAlignment(SwingConstants.LEFT);

		JComboBox cbTimTheo = new JComboBox();
		cbTimTheo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cbTim.removeAllItems();
				if (cbTimTheo.getSelectedItem().equals("Hóa Đơn")) {
					cbTim.addItem("Mã hóa đơn");
					cbTim.addItem("Ngày lập");
					cbTim.addItem("Mã khách hàng");
					cbTim.addItem("Mã cửa hàng");
					cbTim.addItem("Mã nhân viên");
				} else {
					cbTim.addItem("Mã hóa đơn");
					cbTim.addItem("Mã loại xe");
					cbTim.addItem("Số lượng");
					cbTim.addItem("Đơn giá");
				}
			}
		});
		cbTimTheo.setFont(new Font("Arial", Font.PLAIN, 16));
		cbTimTheo.setModel(new DefaultComboBoxModel(new String[] { "Hóa Đơn", "Chi Tiết Hóa Đơn" }));
		cbTimTheo.setBounds(90, 29, 133, 21);
		panel_3.add(cbTimTheo);

		// thêm dòng khi để thêm hóa đơn
		JButton btnThemDong = new JButton("Thêm Dòng");
		btnThemDong.setForeground(new Color(165, 42, 42));
		btnThemDong.setFont(new Font("Arial", Font.PLAIN, 16));
		btnThemDong.setBackground(Color.LIGHT_GRAY);
		btnThemDong.setBounds(10, 624, 125, 27);
		panel_3.add(btnThemDong);

		// đổ dữ liệu vào table hóa đơn
		hoaDon_DAO = new HoaDon_DAO();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd / MM / yyyy");
		for (HoaDon hd : hoaDon_DAO.getAllHoaDon()) {
			Object[] objects = { hd.getMa(), dateFormat.format(hd.getNgayLap()), hd.getThoiGianBH(), hd.getMaKH(),
					hd.getMaCH(), hd.getMaNV() };
			modelHd.addRow(objects);
		}
		// đổ dữ liệu vào
		chiTietHoaDon_DAO = new ChiTietHoaDon_DAO();
		for (ChiTietHoaDon chiTietHoaDon : chiTietHoaDon_DAO.getAllChiTietHoaDon()) {
			Object[] objects = { chiTietHoaDon.getMa(), chiTietHoaDon.getMaLoaiXe(), chiTietHoaDon.getSoLuong(),
					chiTietHoaDon.getDonGia(), chiTietHoaDon.getThanhTien() };
			modelHdDetail.addRow(objects);
		}
	}
}
