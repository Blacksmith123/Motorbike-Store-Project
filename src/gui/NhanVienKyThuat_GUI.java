package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.jar.Attributes.Name;

import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import connect.ConnectDB;
import dao.CuaHang_DAO;
import dao.NhanVienKiThuat_DAO;
import entity.CuaHang;
import entity.NhanVienKyThuat;

import javax.swing.ScrollPaneConstants;

public class NhanVienKyThuat_GUI extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JComboBox cbMaCH;
	private JTextField textField;
	private JTable table;
	private DefaultTableModel model;
	private JTextField textMaNV;
	private JTextField textTenNV;
	private JTextField textDiaChi;
	private JTextField textSDT;
	private JTextField textChucVu;
	private JTextField textEmail;
	private JTextField textNamKn;
	private JTextField textBacTho;
	private CuaHang_DAO cuaHang_DAO;
	private NhanVienKiThuat_DAO nhanVienKiThuat_DAO;

	/**
	 * Create the panel.
	 * 
	 * @throws SQLException
	 */
	public NhanVienKyThuat_GUI() throws SQLException {
		ConnectDB.getInstance();
		ConnectDB.connect();
		setBorder(new LineBorder(new Color(0, 0, 0)));
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(165, 42, 42));
		panel.setBorder(new LineBorder(Color.CYAN));
		panel.setBounds(10, 148, 802, 545);
		add(panel);
		panel.setLayout(null);

		String[] column = { "M\u00E3 Nh\u00E2n vi\u00EAn", "T\u00EAn Nh\u00E2n Vi\u00EAn", "SDT", "Email",
				"B\u1EADc Th\u1EE3", "Ch\u1EE9c V\u1EE5", "S\u1ED1 N\u0103m Kn", "\u0110\u1ECBa Ch\u1EC9",
				"M\u00E3 C\u1EEDa H\u00E0ng" };
		model = new DefaultTableModel(column, 0);
		table = new JTable(model);
		table.setRowHeight(25);
		table.setFont(new Font("Arial", Font.PLAIN, 16));
		table.addMouseListener(new MouseListener() {
			
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
				int row = table.getSelectedRow();
				textMaNV.setText((String) model.getValueAt(row, 0));
				textTenNV.setText((String) model.getValueAt(row, 1));
				textDiaChi.setText((String) model.getValueAt(row, 7));
				textSDT.setText(model.getValueAt(row, 2) + "");
				textChucVu.setText((String) model.getValueAt(row, 5));
				textEmail.setText((String) model.getValueAt(row, 3));
				textNamKn.setText(model.getValueAt(row, 6) + "");
				cbMaCH.setSelectedItem(model.getValueAt(row, 8));
				textBacTho.setText((String) model.getValueAt(row, 4));
			}
		});
		
		// set color for table
		ListSelectionModel listSelectionModel = table.getSelectionModel();
		listSelectionModel.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				// Check if the current cell selection is not empty
				if (!e.getValueIsAdjusting()) {
					int rowIndex = table.getSelectedRow();
					if (rowIndex >= 0 && rowIndex < table.getRowCount()) {
						table.setSelectionBackground(Color.CYAN);
						table.setRowSelectionInterval(rowIndex, rowIndex);
					}
				}
			}
		});
		
		JScrollPane scrollPane = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setBounds(10, 10, 782, 525);
		panel.add(scrollPane);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.text);
		panel_1.setBorder(new LineBorder(Color.CYAN));
		panel_1.setBounds(812, 148, 376, 545);
		add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel_4 = new JLabel("Mã nhân viên:");
		lblNewLabel_4.setForeground(new Color(165, 42, 42));
		lblNewLabel_4.setBackground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(10, 10, 122, 34);
		panel_1.add(lblNewLabel_4);

		JLabel lblNewLabel_4_1 = new JLabel("Tên nhân viên:");
		lblNewLabel_4_1.setForeground(new Color(165, 42, 42));
		lblNewLabel_4_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4_1.setBounds(10, 45, 122, 34);
		panel_1.add(lblNewLabel_4_1);

		JLabel lblNewLabel_4_1_1 = new JLabel("Địa chỉ:");
		lblNewLabel_4_1_1.setForeground(new Color(165, 42, 42));
		lblNewLabel_4_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4_1_1.setBounds(10, 89, 115, 34);
		panel_1.add(lblNewLabel_4_1_1);

		JLabel lblNewLabel_4_1_1_1 = new JLabel("Số điện thoại:");
		lblNewLabel_4_1_1_1.setForeground(new Color(165, 42, 42));
		lblNewLabel_4_1_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4_1_1_1.setBounds(10, 133, 105, 34);
		panel_1.add(lblNewLabel_4_1_1_1);

		JLabel lblNewLabel_4_1_1_1_1 = new JLabel("Chức vụ:\r\n");
		lblNewLabel_4_1_1_1_1.setForeground(new Color(165, 42, 42));
		lblNewLabel_4_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4_1_1_1_1.setBounds(10, 185, 105, 34);
		panel_1.add(lblNewLabel_4_1_1_1_1);

		JLabel lblNewLabel_4_1_1_1_2 = new JLabel("Email:");
		lblNewLabel_4_1_1_1_2.setForeground(new Color(165, 42, 42));
		lblNewLabel_4_1_1_1_2.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4_1_1_1_2.setBounds(10, 229, 105, 34);
		panel_1.add(lblNewLabel_4_1_1_1_2);

		textMaNV = new JTextField();
		textMaNV.setFont(new Font("Arial", Font.PLAIN, 16));
		textMaNV.setBounds(160, 18, 206, 24);
		panel_1.add(textMaNV);
		textMaNV.setColumns(10);

		textTenNV = new JTextField();
		textTenNV.setFont(new Font("Arial", Font.PLAIN, 16));
		textTenNV.setColumns(10);
		textTenNV.setBounds(160, 53, 206, 24);
		panel_1.add(textTenNV);

		textDiaChi = new JTextField();
		textDiaChi.setFont(new Font("Arial", Font.PLAIN, 16));
		textDiaChi.setColumns(10);
		textDiaChi.setBounds(160, 97, 206, 24);
		panel_1.add(textDiaChi);

		textSDT = new JTextField();
		textSDT.setFont(new Font("Arial", Font.PLAIN, 16));
		textSDT.setColumns(10);
		textSDT.setBounds(160, 141, 206, 24);
		panel_1.add(textSDT);

		textChucVu = new JTextField();
		textChucVu.setFont(new Font("Arial", Font.PLAIN, 16));
		textChucVu.setColumns(10);
		textChucVu.setBounds(160, 185, 206, 24);
		panel_1.add(textChucVu);

		textEmail = new JTextField();
		textEmail.setFont(new Font("Arial", Font.PLAIN, 16));
		textEmail.setColumns(10);
		textEmail.setBounds(160, 229, 206, 24);
		panel_1.add(textEmail);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBorder(new LineBorder(new Color(165, 42, 42)));
		panel_2.setBounds(10, 378, 356, 147);
		panel_1.add(panel_2);
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
		btnLuu.setBounds(212, 106, 112, 27);
		panel_2.add(btnLuu);
		
		JButton btnLmMi = new JButton("Làm mới");
		btnLmMi.setForeground(new Color(165, 42, 42));
		btnLmMi.setFont(new Font("Arial", Font.PLAIN, 16));
		btnLmMi.setBackground(Color.LIGHT_GRAY);
		btnLmMi.setBounds(56, 106, 112, 27);
		panel_2.add(btnLmMi);

		JLabel lblNewLabel_1_1 = new JLabel("Chức năng:");
		lblNewLabel_1_1.setForeground(Color.BLUE);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1_1.setBounds(10, 352, 322, 27);
		panel_1.add(lblNewLabel_1_1);

		JLabel lblNewLabel_4_1_1_1_2_1 = new JLabel("Số năm kinh nghiệm:");
		lblNewLabel_4_1_1_1_2_1.setForeground(new Color(165, 42, 42));
		lblNewLabel_4_1_1_1_2_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4_1_1_1_2_1.setBounds(10, 273, 145, 34);
		panel_1.add(lblNewLabel_4_1_1_1_2_1);

		JLabel lblNewLabel_4_1_1_1_2_2 = new JLabel("Mã cửa hàng:");
		lblNewLabel_4_1_1_1_2_2.setForeground(new Color(165, 42, 42));
		lblNewLabel_4_1_1_1_2_2.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4_1_1_1_2_2.setBounds(10, 317, 105, 34);
		panel_1.add(lblNewLabel_4_1_1_1_2_2);

		textNamKn = new JTextField();
		textNamKn.setFont(new Font("Arial", Font.PLAIN, 16));
		textNamKn.setColumns(10);
		textNamKn.setBounds(160, 278, 206, 24);
		panel_1.add(textNamKn);

		cuaHang_DAO = new CuaHang_DAO();
		cbMaCH = new JComboBox();
		cbMaCH.setFont(new Font("Arial", Font.PLAIN, 16));
		cbMaCH.setBounds(109, 324, 87, 21);
		cbMaCH.addItem("");
		for (CuaHang cuaHang : cuaHang_DAO.getAllCuaHang()) {
			cbMaCH.addItem(cuaHang.getMa());
		}
		panel_1.add(cbMaCH);

		JLabel lblNewLabel_4_1_1_1_2_3 = new JLabel("Bậc Thợ:");
		lblNewLabel_4_1_1_1_2_3.setForeground(new Color(165, 42, 42));
		lblNewLabel_4_1_1_1_2_3.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4_1_1_1_2_3.setBounds(206, 317, 105, 34);
		panel_1.add(lblNewLabel_4_1_1_1_2_3);

		textBacTho = new JTextField();
		textBacTho.setFont(new Font("Arial", Font.PLAIN, 16));
		textBacTho.setColumns(10);
		textBacTho.setBounds(276, 322, 90, 24);
		panel_1.add(textBacTho);

		JLabel lblNewLabel = new JLabel("Danh Sách Nhân Viên:");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setBounds(10, 123, 322, 27);
		add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Thông Tin:");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_1.setBounds(809, 123, 322, 27);
		add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Tìm Kiếm:");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_2.setBounds(10, 6, 91, 54);
		add(lblNewLabel_2);

		JComboBox cbTim = new JComboBox();
		cbTim.setForeground(Color.RED);
		cbTim.setFont(new Font("Arial", Font.PLAIN, 16));
		cbTim.setBounds(88, 25, 125, 21);
		add(cbTim);

		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 16));
		textField.setBounds(223, 19, 289, 27);
		add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Nhân Viên Kỹ Thuật\r\n");
		lblNewLabel_3.setBackground(new Color(165, 42, 42));
		lblNewLabel_3.setForeground(Color.BLUE);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel_3.setBounds(0, 70, 1198, 37);
		add(lblNewLabel_3);

		JButton btnTim = new JButton("Tìm Kiếm");
		btnTim.setHorizontalTextPosition(SwingConstants.LEADING);
		btnTim.setIcon(new ImageIcon(NhanVienKyThuat_GUI.class.getResource("/image/magnifier.png")));
		btnTim.setForeground(new Color(165, 42, 42));
		btnTim.setFont(new Font("Arial", Font.PLAIN, 16));
		btnTim.setBackground(Color.LIGHT_GRAY);
		btnTim.setBounds(522, 20, 133, 27);
		btnTim.setVerticalTextPosition(SwingConstants.CENTER);
		add(btnTim);
		// do du lieu vao table
		nhanVienKiThuat_DAO = new NhanVienKiThuat_DAO();
		for (NhanVienKyThuat nVienKyThuat : nhanVienKiThuat_DAO.getAllNhanVienKyThuat()) {
			Object[] objects = { nVienKyThuat.getMa(), nVienKyThuat.getTen(), nVienKyThuat.getSdt(),
					nVienKyThuat.getEmail(), nVienKyThuat.getBacTho(), nVienKyThuat.getChucVu(),
					nVienKyThuat.getNamKinhNghiem(), nVienKyThuat.getDiaChi(), nVienKyThuat.getMaCuaHang() };
			model.addRow(objects);
		}
	}
}