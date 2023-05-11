package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import connect.ConnectDB;
import dao.CuaHang_DAO;
import dao.XeTrongKho_DAO;
import entity.CuaHang;
import entity.XeTrongKho;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.jar.Attributes.Name;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class CuaHang_GUI extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTable tableCuahang;
	private JTextField textMaCH;
	private JTable tableXeTrongKho;
	private JTextField textTenCH;
	private JTextField textSdt;
	private JTextField textEmail;
	private JTextField textDuong;
	private JTextField textThanhPho;
	private JTextField textTinhTrang;
	private JTextField textMaBuuDien;
	private DefaultTableModel modelXeTrongKho;
	private DefaultTableModel modelCuaHang;
	private CuaHang_DAO cuaHang_DAO;
	private XeTrongKho_DAO xeTrongKho_DAO;

	/**
	 * Create the panel.
	 */
	public CuaHang_GUI() throws SQLException {
		setBorder(new LineBorder(new Color(0, 0, 0)));
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(165, 42, 42));
		panel.setBorder(new LineBorder(Color.CYAN));
		panel.setBounds(442, 338, 748, 362);
		add(panel);
		panel.setLayout(null);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 728, 342);
		panel.add(scrollPane);

		String[] columnsCuaHang = { "M\u00E3 c\u1EEDa h\u00E0ng", "T\u00EAn c\u1EEDa h\u00E0ng",
				"S\u1ED1 \u0111i\u1EC7n tho\u1EA1i", "Email", "\u0110\u01B0\u1EDDng", "Th\u00E0nh ph\u1ED1 ",
				"T\u00ECnh tr\u1EA1ng", "Mã bưu điện" };
		modelCuaHang = new DefaultTableModel(columnsCuaHang, 0);
		tableCuahang = new JTable(modelCuaHang);
		tableCuahang.setRowHeight(25);
		tableCuahang.setFont(new Font("Arial", Font.PLAIN, 16));
		tableCuahang.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				int row = tableCuahang.getSelectedRow();

				textMaCH.setText((String) modelCuaHang.getValueAt(row, 0));
				textTenCH.setText((String) modelCuaHang.getValueAt(row, 1));
				textSdt.setText(modelCuaHang.getValueAt(row, 2) + "");
				textEmail.setText((String) modelCuaHang.getValueAt(row, 3));
				textDuong.setText((String) modelCuaHang.getValueAt(row, 4));
				textThanhPho.setText((String) modelCuaHang.getValueAt(row, 5));
				textTinhTrang.setText((String) modelCuaHang.getValueAt(row, 6));
				textMaBuuDien.setText(modelCuaHang.getValueAt(row, 7) + "");

				try {
					modelXeTrongKho.setRowCount(0);
					for (XeTrongKho xeTrongKho : xeTrongKho_DAO
							.getXeTrongKhoTheoMaCuaHang((String) modelCuaHang.getValueAt(row, 0))) {
						Object[] objects = { xeTrongKho.getMaCuaHang(), xeTrongKho.getMaXe(), xeTrongKho.getSoLuong() };
						modelXeTrongKho.addRow(objects);
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		scrollPane.setViewportView(tableCuahang);

		// set color for table
		ListSelectionModel listSelectionModel = tableCuahang.getSelectionModel();
		listSelectionModel.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub
				if (!e.getValueIsAdjusting()) {
					int rowIndex = tableCuahang.getSelectedRow();
					if (rowIndex >= 0 && rowIndex < tableCuahang.getRowCount()) {
						tableCuahang.setSelectionBackground(Color.cyan);
						tableCuahang.setRowSelectionInterval(rowIndex, rowIndex);
					}
				}
			}
		});

		JPanel jpanel = new JPanel();
		jpanel.setBackground(SystemColor.text);
		jpanel.setBorder(new LineBorder(Color.CYAN));
		jpanel.setBounds(442, 39, 748, 268);
		add(jpanel);
		jpanel.setLayout(null);

		JLabel lblNewLabel_4 = new JLabel("Mã cửa hàng:\r\n");
		lblNewLabel_4.setForeground(new Color(165, 42, 42));
		lblNewLabel_4.setBackground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(10, 10, 105, 34);
		jpanel.add(lblNewLabel_4);

		textMaCH = new JTextField();
		textMaCH.setFont(new Font("Arial", Font.PLAIN, 16));
		textMaCH.setBounds(160, 18, 206, 24);
		jpanel.add(textMaCH);
		textMaCH.setColumns(10);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBorder(new LineBorder(new Color(165, 42, 42)));
		panel_2.setBounds(10, 378, 356, 147);
		jpanel.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblNewLabel_1_1 = new JLabel("Chức năng:");
		lblNewLabel_1_1.setForeground(Color.BLUE);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1_1.setBounds(10, 352, 322, 27);
		jpanel.add(lblNewLabel_1_1);

		JLabel lblNewLabel_4_1 = new JLabel("Tên cửa hàng:");
		lblNewLabel_4_1.setForeground(new Color(165, 42, 42));
		lblNewLabel_4_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4_1.setBackground(Color.WHITE);
		lblNewLabel_4_1.setBounds(10, 55, 132, 34);
		jpanel.add(lblNewLabel_4_1);

		textTenCH = new JTextField();
		textTenCH.setFont(new Font("Arial", Font.PLAIN, 16));
		textTenCH.setColumns(10);
		textTenCH.setBounds(160, 65, 206, 24);
		jpanel.add(textTenCH);

		JLabel lblNewLabel_4_1_1 = new JLabel("Số điện thoại");
		lblNewLabel_4_1_1.setForeground(new Color(165, 42, 42));
		lblNewLabel_4_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4_1_1.setBackground(Color.WHITE);
		lblNewLabel_4_1_1.setBounds(10, 99, 157, 34);
		jpanel.add(lblNewLabel_4_1_1);

		JLabel lblNewLabel_4_1_2 = new JLabel("Email:");
		lblNewLabel_4_1_2.setForeground(new Color(165, 42, 42));
		lblNewLabel_4_1_2.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4_1_2.setBackground(Color.WHITE);
		lblNewLabel_4_1_2.setBounds(10, 143, 132, 34);
		jpanel.add(lblNewLabel_4_1_2);

		JLabel lblNewLabel_4_1_3 = new JLabel("Đường:");
		lblNewLabel_4_1_3.setForeground(new Color(165, 42, 42));
		lblNewLabel_4_1_3.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4_1_3.setBackground(Color.WHITE);
		lblNewLabel_4_1_3.setBounds(10, 187, 105, 34);
		jpanel.add(lblNewLabel_4_1_3);

		JLabel lblNewLabel_4_1_4 = new JLabel("Tình trạng:");
		lblNewLabel_4_1_4.setForeground(new Color(165, 42, 42));
		lblNewLabel_4_1_4.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4_1_4.setBackground(Color.WHITE);
		lblNewLabel_4_1_4.setBounds(393, 10, 105, 34);
		jpanel.add(lblNewLabel_4_1_4);

		textSdt = new JTextField();
		textSdt.setFont(new Font("Arial", Font.PLAIN, 16));
		textSdt.setColumns(10);
		textSdt.setBounds(160, 104, 206, 24);
		jpanel.add(textSdt);

		JLabel lblNewLabel_4_1_4_1 = new JLabel("Mã bưu điện:");
		lblNewLabel_4_1_4_1.setForeground(new Color(165, 42, 42));
		lblNewLabel_4_1_4_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4_1_4_1.setBackground(Color.WHITE);
		lblNewLabel_4_1_4_1.setBounds(393, 55, 105, 34);
		jpanel.add(lblNewLabel_4_1_4_1);

		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBorder(new LineBorder(new Color(165, 42, 42)));
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setBounds(393, 112, 338, 126);
		jpanel.add(panel_2_1);

		JButton btnThem = new JButton("Thêm");
		btnThem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnThem.setForeground(new Color(165, 42, 42));
		btnThem.setFont(new Font("Arial", Font.PLAIN, 16));
		btnThem.setBackground(Color.LIGHT_GRAY);
		btnThem.setBounds(36, 10, 112, 27);
		panel_2_1.add(btnThem);

		JButton btnXoatrang_1 = new JButton("Xóa Trắng");
		btnXoatrang_1.setForeground(new Color(165, 42, 42));
		btnXoatrang_1.setFont(new Font("Arial", Font.PLAIN, 16));
		btnXoatrang_1.setBackground(Color.LIGHT_GRAY);
		btnXoatrang_1.setBounds(192, 10, 112, 27);
		panel_2_1.add(btnXoatrang_1);

		JButton btnCapnhat = new JButton("Cập Nhật");
		btnCapnhat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCapnhat.setForeground(new Color(165, 42, 42));
		btnCapnhat.setFont(new Font("Arial", Font.PLAIN, 16));
		btnCapnhat.setBackground(Color.LIGHT_GRAY);
		btnCapnhat.setBounds(36, 47, 112, 27);
		panel_2_1.add(btnCapnhat);

		JButton btnXoa = new JButton("Xóa");
		btnXoa.setForeground(new Color(165, 42, 42));
		btnXoa.setFont(new Font("Arial", Font.PLAIN, 16));
		btnXoa.setBackground(Color.LIGHT_GRAY);
		btnXoa.setBounds(192, 47, 112, 27);
		panel_2_1.add(btnXoa);

		JButton btnLamMoi = new JButton("Làm Mới");
		btnLamMoi.setForeground(new Color(165, 42, 42));
		btnLamMoi.setFont(new Font("Arial", Font.PLAIN, 16));
		btnLamMoi.setBackground(Color.LIGHT_GRAY);
		btnLamMoi.setBounds(117, 89, 112, 27);
		panel_2_1.add(btnLamMoi);

		textEmail = new JTextField();
		textEmail.setFont(new Font("Arial", Font.PLAIN, 16));
		textEmail.setColumns(10);
		textEmail.setBounds(160, 148, 206, 24);
		jpanel.add(textEmail);

		textDuong = new JTextField();
		textDuong.setFont(new Font("Arial", Font.PLAIN, 16));
		textDuong.setColumns(10);
		textDuong.setBounds(160, 192, 206, 24);
		jpanel.add(textDuong);

		JLabel lblNewLabel_4_1_3_1 = new JLabel("Thành phố:");
		lblNewLabel_4_1_3_1.setForeground(new Color(165, 42, 42));
		lblNewLabel_4_1_3_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4_1_3_1.setBackground(Color.WHITE);
		lblNewLabel_4_1_3_1.setBounds(10, 229, 105, 34);
		jpanel.add(lblNewLabel_4_1_3_1);

		textThanhPho = new JTextField();
		textThanhPho.setFont(new Font("Arial", Font.PLAIN, 16));
		textThanhPho.setColumns(10);
		textThanhPho.setBounds(160, 234, 206, 24);
		jpanel.add(textThanhPho);

		textTinhTrang = new JTextField();
		textTinhTrang.setFont(new Font("Arial", Font.PLAIN, 16));
		textTinhTrang.setColumns(10);
		textTinhTrang.setBounds(508, 20, 206, 24);
		jpanel.add(textTinhTrang);

		textMaBuuDien = new JTextField();
		textMaBuuDien.setFont(new Font("Arial", Font.PLAIN, 16));
		textMaBuuDien.setColumns(10);
		textMaBuuDien.setBounds(508, 60, 206, 24);
		jpanel.add(textMaBuuDien);

		JLabel lblNewLabel_1 = new JLabel("Thông Tin:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_1.setBounds(442, 10, 322, 27);
		add(lblNewLabel_1);

		JLabel lblNewLabel_3 = new JLabel("Quản Lý Cửa Hàng");
		lblNewLabel_3.setBackground(new Color(165, 42, 42));
		lblNewLabel_3.setForeground(Color.BLUE);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel_3.setBounds(10, 3, 1188, 37);
		add(lblNewLabel_3);

		JLabel lblNewLabel = new JLabel("Danh Sách Cửa Hàng:");
		lblNewLabel.setBounds(452, 312, 322, 27);
		add(lblNewLabel);
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));

		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(Color.CYAN));
		panel_3.setBackground(new Color(165, 42, 42));
		panel_3.setBounds(10, 39, 422, 661);
		add(panel_3);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 125, 402, 466);
		panel_3.add(scrollPane_1);

		String[] columnsXeTrongKho = { "M\u00E3 c\u1EEDa h\u00E0ng", "M\u00E3 loại xe", "S\u1ED1 l\u01B0\u1EE3ng" };
		modelXeTrongKho = new DefaultTableModel(columnsXeTrongKho, 0);
		tableXeTrongKho = new JTable(modelXeTrongKho);
		tableXeTrongKho.setRowHeight(25);
		tableXeTrongKho.setFont(new Font("Arial", Font.PLAIN, 16));
		scrollPane_1.setViewportView(tableXeTrongKho);

		// set color for table
		ListSelectionModel listSelectionModel1 = tableXeTrongKho.getSelectionModel();
		listSelectionModel1.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub
				if (!e.getValueIsAdjusting()) {
					int rowIndex = tableXeTrongKho.getSelectedRow();
					if (rowIndex >= 0 && rowIndex < tableXeTrongKho.getRowCount()) {
						tableXeTrongKho.setSelectionBackground(Color.cyan);
						tableXeTrongKho.setRowSelectionInterval(rowIndex, rowIndex);
					}
				}
			}
		});

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

		JButton btnTim = new JButton("Tìm Kiếm");
		btnTim.setHorizontalTextPosition(SwingConstants.LEADING);
		btnTim.setIcon(new ImageIcon(CuaHang_GUI.class.getResource("/image/magnifier.png")));
		btnTim.setBounds(218, 90, 133, 27);
		panel_3.add(btnTim);
		btnTim.setHorizontalAlignment(SwingConstants.LEFT);
		btnTim.setForeground(new Color(165, 42, 42));
		btnTim.setFont(new Font("Arial", Font.PLAIN, 16));
		btnTim.setBackground(Color.LIGHT_GRAY);
		btnTim.setVerticalTextPosition(SwingConstants.CENTER);
		btnTim.setHorizontalAlignment(SwingConstants.LEFT);

		JButton btnThemDong = new JButton("Thêm Dòng");
		btnThemDong.setForeground(new Color(165, 42, 42));
		btnThemDong.setFont(new Font("Arial", Font.PLAIN, 16));
		btnThemDong.setBackground(Color.LIGHT_GRAY);
		btnThemDong.setBounds(10, 601, 125, 27);
		panel_3.add(btnThemDong);

		// input data from sql server
		ConnectDB.getInstance();
		ConnectDB.connect();
		cuaHang_DAO = new CuaHang_DAO();
		for (CuaHang cuaHang : cuaHang_DAO.getAllCuaHang()) {
			Object[] objects = { cuaHang.getMa(), cuaHang.getTen(), cuaHang.getSdt(), cuaHang.getEmail(),
					cuaHang.getDuong(), cuaHang.getThanhPho(), cuaHang.getTinhTrang(), cuaHang.getMaBuuDien() };
			modelCuaHang.addRow(objects);
		}
		xeTrongKho_DAO = new XeTrongKho_DAO();
		for (XeTrongKho xeTrongKho : xeTrongKho_DAO.getAllXeTrongKho()) {
			Object[] objects = { xeTrongKho.getMaCuaHang(), xeTrongKho.getMaXe(), xeTrongKho.getSoLuong() };
			modelXeTrongKho.addRow(objects);
		}
	}
}
