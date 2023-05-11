package gui;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import connect.ConnectDB;
import dao.ThongTinXe_DAO;
import dao.Xe_DAO;
import entity.ThongTinXe;
import entity.Xe;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Font;
import java.awt.Panel;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class ThongTinXe_GUI extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTable table;
	private JTextField textMaLoaiXe;
	private JTextField textTenLoaiXe;
	private JTextField textGiaNiemYet;
	private JTextField textGiaGiam;
	private JTextField textPhienBan;
	private JTextArea textMoTa;
	private DefaultTableModel model;
	private ThongTinXe_DAO thongTinXe_DAO;
	/**
	 * Create the panel.
	 */
	public ThongTinXe_GUI() throws SQLException {
		setBorder(new LineBorder(new Color(0, 0, 0)));
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(165, 42, 42));
		panel.setBorder(new LineBorder(Color.CYAN));
		panel.setBounds(10, 148, 802, 545);
		add(panel);
		panel.setLayout(null);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 1295, 939);
		panel.add(scrollPane);

		String[] columns = { "M\u00E3 lo\u1EA1i xe", "T\u00EAn Lo\u1EA1i Xe", "Gi\u00E1 Ni\u00EAm Y\u1EBFt",
				"Gi\u00E1 Gi\u1EA3m", "M\u00F4 T\u1EA3 Xe", "Phi\u00EAn B\u1EA3n" };
		model = new DefaultTableModel(columns, 0);
		table = new JTable(model);
		table.setFont(new Font("Arial", Font.PLAIN, 16));
		table.setRowHeight(25);
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
				textMaLoaiXe.setText((String) model.getValueAt(row, 0));
				textTenLoaiXe.setText((String) model.getValueAt(row, 1));
				textGiaNiemYet.setText(model.getValueAt(row, 2) + "");
				textGiaGiam.setText(model.getValueAt(row, 3) + "");
				textMoTa.setText((String) model.getValueAt(row, 4));
				textPhienBan.setText((String) model.getValueAt(row, 5));
			}
		});

		scrollPane.setViewportView(table);

		// set color for table
		ListSelectionModel listSelectionModel = table.getSelectionModel();
		listSelectionModel.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub
				if (!e.getValueIsAdjusting()) {
					int rowIndex = table.getSelectedRow();
					if (rowIndex >= 0 && rowIndex < table.getRowCount()) {
						table.setSelectionBackground(Color.cyan);
						table.setRowSelectionInterval(rowIndex, rowIndex);
					}
				}
			}
		});

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.text);
		panel_1.setBorder(new LineBorder(Color.CYAN));
		panel_1.setBounds(812, 148, 376, 545);
		add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel_4 = new JLabel("Mã loại xe:");
		lblNewLabel_4.setForeground(new Color(165, 42, 42));
		lblNewLabel_4.setBackground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(10, 10, 122, 34);
		panel_1.add(lblNewLabel_4);

		JLabel lblNewLabel_4_1 = new JLabel("Tên loại xe:");
		lblNewLabel_4_1.setForeground(new Color(165, 42, 42));
		lblNewLabel_4_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4_1.setBounds(10, 45, 122, 34);
		panel_1.add(lblNewLabel_4_1);

		JLabel lblNewLabel_4_1_1 = new JLabel("Giá niêm yết:");
		lblNewLabel_4_1_1.setForeground(new Color(165, 42, 42));
		lblNewLabel_4_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4_1_1.setBounds(10, 89, 115, 34);
		panel_1.add(lblNewLabel_4_1_1);

		JLabel lblNewLabel_4_1_1_1 = new JLabel("Giá giảm");
		lblNewLabel_4_1_1_1.setForeground(new Color(165, 42, 42));
		lblNewLabel_4_1_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4_1_1_1.setBounds(10, 133, 105, 34);
		panel_1.add(lblNewLabel_4_1_1_1);

		JLabel lblNewLabel_4_1_1_1_1 = new JLabel("Mô tả xe:\r\n");
		lblNewLabel_4_1_1_1_1.setForeground(new Color(165, 42, 42));
		lblNewLabel_4_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4_1_1_1_1.setBounds(10, 185, 105, 34);
		panel_1.add(lblNewLabel_4_1_1_1_1);

		JLabel lblNewLabel_4_1_1_1_2 = new JLabel("Phiên bản:\r\n\r\n\r\n");
		lblNewLabel_4_1_1_1_2.setForeground(new Color(165, 42, 42));
		lblNewLabel_4_1_1_1_2.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4_1_1_1_2.setBounds(10, 294, 105, 34);
		panel_1.add(lblNewLabel_4_1_1_1_2);

		textMaLoaiXe = new JTextField();
		textMaLoaiXe.setFont(new Font("Arial", Font.PLAIN, 16));
		textMaLoaiXe.setBounds(160, 18, 206, 24);
		panel_1.add(textMaLoaiXe);
		textMaLoaiXe.setColumns(10);

		textTenLoaiXe = new JTextField();
		textTenLoaiXe.setFont(new Font("Arial", Font.PLAIN, 16));
		textTenLoaiXe.setColumns(10);
		textTenLoaiXe.setBounds(160, 53, 206, 24);
		panel_1.add(textTenLoaiXe);

		textGiaNiemYet = new JTextField();
		textGiaNiemYet.setFont(new Font("Arial", Font.PLAIN, 16));
		textGiaNiemYet.setColumns(10);
		textGiaNiemYet.setBounds(160, 97, 206, 24);
		panel_1.add(textGiaNiemYet);

		textGiaGiam = new JTextField();
		textGiaGiam.setFont(new Font("Arial", Font.PLAIN, 16));
		textGiaGiam.setColumns(10);
		textGiaGiam.setBounds(160, 141, 206, 24);
		panel_1.add(textGiaGiam);

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

		textMoTa = new JTextArea();
		textMoTa.setColumns(3);
		textMoTa.setBorder(new LineBorder(Color.LIGHT_GRAY));
		textMoTa.setFont(new Font("Arial", Font.PLAIN, 16));
		textMoTa.setBounds(160, 192, 206, 85);
		panel_1.add(textMoTa);

		textPhienBan = new JTextField();
		textPhienBan.setFont(new Font("Arial", Font.PLAIN, 16));
		textPhienBan.setColumns(10);
		textPhienBan.setBounds(160, 299, 206, 24);
		panel_1.add(textPhienBan);

		JLabel lblNewLabel = new JLabel("Danh Sách Xe");
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

		JLabel lblNewLabel_3 = new JLabel("Thông Tin Xe");
		lblNewLabel_3.setBackground(new Color(165, 42, 42));
		lblNewLabel_3.setForeground(Color.BLUE);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel_3.setBounds(0, 70, 1198, 37);
		add(lblNewLabel_3);

		JButton btnTim = new JButton("Tìm Kiếm");
		btnTim.setIcon(new ImageIcon(ThongTinXe_GUI.class.getResource("/image/magnifier.png")));
		btnTim.setForeground(new Color(165, 42, 42));
		btnTim.setFont(new Font("Arial", Font.PLAIN, 16));
		btnTim.setBackground(Color.LIGHT_GRAY);
		btnTim.setBounds(522, 20, 133, 27);
		btnTim.setHorizontalTextPosition(SwingConstants.LEADING);
		btnTim.setVerticalTextPosition(SwingConstants.CENTER);
		add(btnTim);

		// input data from sql server
		ConnectDB.getInstance();
		ConnectDB.connect();
		thongTinXe_DAO = new ThongTinXe_DAO();
		for (ThongTinXe thongTinXe : thongTinXe_DAO.getAllThongTinXe()) {
			Object[] objects = { thongTinXe.getMaLoaiXe(), thongTinXe.getTenLoaiXe(), thongTinXe.getGiaNiemYet(),
					thongTinXe.getGiaGiam(), thongTinXe.getMoTaXe(), thongTinXe.getPhienBan() };
			model.addRow(objects);
		}
	}
}
