package gui;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import connect.ConnectDB;

import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.SwingConstants;

import dao.NhaPhanPhoi_DAO;
import entity.NhaPhanPhoi;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.ArrayList;

public class NhaPhanPhoi_GUI extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTable table;
	private JTextField textMaNhaPp;
	private JTextField textTenNhaPp;
	private JTextField textDiaChi;
	private JTextField textSdt;
	private JTextField textEmail;
	private DefaultTableModel model;
	private ArrayList<NhaPhanPhoi> listNhaPhanPhoi = new ArrayList<NhaPhanPhoi>();
	private NhaPhanPhoi_DAO nhaPhanPhoi_DAO;
	/**
	 * Create the panel.
	 */
	public NhaPhanPhoi_GUI() throws SQLException {
		
		// connectDB
		connect();
		
		// khai bao dao
		nhaPhanPhoi_DAO = new NhaPhanPhoi_DAO();
		
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
		scrollPane.setBounds(10, 10, 782, 525);
		panel.add(scrollPane);

		String[] columns = { "M\u00E3 nhà phân phối", "T\u00EAn nhà phân phối","\u0110\u1ECBa ch\u1EC9", "SDT", "Email" };
		model = new DefaultTableModel(columns, 0);
		loadNhaPhanPhoi();
		table = new JTable(model);
		table.setFont(new Font("Arial", Font.PLAIN, 16));
		table.setRowHeight(25);
		table.setDefaultEditor(Object.class, null);
		table.setToolTipText("Chọn nhà phân phối để thực hiện chức năng");
		scrollPane.setViewportView(table);
		table.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				int row = table.getSelectedRow();
				textMaNhaPp.setText(table.getValueAt(row, 0).toString());
				textTenNhaPp.setText(table.getValueAt(row, 1).toString());
				textDiaChi.setText(table.getValueAt(row, 2).toString());
				textSdt.setText(table.getValueAt(row, 3).toString());
				textEmail.setText(table.getValueAt(row, 4).toString());
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
			}
		});

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.text);
		panel_1.setBorder(new LineBorder(Color.CYAN));
		panel_1.setBounds(812, 148, 376, 545);
		add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Mã nhà phân phối:");
		lblNewLabel_4.setForeground(new Color(165, 42, 42));
		lblNewLabel_4.setBackground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(10, 10, 140, 34);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Tên nhà phân phối:");
		lblNewLabel_4_1.setForeground(new Color(165, 42, 42));
		lblNewLabel_4_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4_1.setBounds(10, 45, 140, 34);
		panel_1.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Địa chỉ:");
		lblNewLabel_4_1_1.setForeground(new Color(165, 42, 42));
		lblNewLabel_4_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4_1_1.setBounds(10, 89, 105, 34);
		panel_1.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1_1_1 = new JLabel("Số điện thoại:");
		lblNewLabel_4_1_1_1.setForeground(new Color(165, 42, 42));
		lblNewLabel_4_1_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4_1_1_1.setBounds(10, 133, 105, 34);
		panel_1.add(lblNewLabel_4_1_1_1);
		
		JLabel lblNewLabel_4_1_1_1_1 = new JLabel("Email:");
		lblNewLabel_4_1_1_1_1.setForeground(new Color(165, 42, 42));
		lblNewLabel_4_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4_1_1_1_1.setBounds(10, 185, 105, 34);
		panel_1.add(lblNewLabel_4_1_1_1_1);
		
		textMaNhaPp = new JTextField();
		textMaNhaPp.setFont(new Font("Arial", Font.PLAIN, 16));
		textMaNhaPp.setBounds(160, 18, 206, 24);
		panel_1.add(textMaNhaPp);
		textMaNhaPp.setColumns(10);
		
		textTenNhaPp = new JTextField();
		textTenNhaPp.setFont(new Font("Arial", Font.PLAIN, 16));
		textTenNhaPp.setColumns(10);
		textTenNhaPp.setBounds(160, 53, 206, 24);
		panel_1.add(textTenNhaPp);
		
		textDiaChi = new JTextField();
		textDiaChi.setFont(new Font("Arial", Font.PLAIN, 16));
		textDiaChi.setColumns(10);
		textDiaChi.setBounds(160, 97, 206, 24);
		panel_1.add(textDiaChi);
		
		textSdt = new JTextField();
		textSdt.setFont(new Font("Arial", Font.PLAIN, 16));
		textSdt.setColumns(10);
		textSdt.setBounds(160, 141, 206, 24);
		panel_1.add(textSdt);
		
		textEmail = new JTextField();
		textEmail.setFont(new Font("Arial", Font.PLAIN, 16));
		textEmail.setColumns(10);
		textEmail.setBounds(160, 185, 206, 24);
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
		btnThem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
				String maNhaPP = textMaNhaPp.getText();
				String tenNhaPP = textTenNhaPp.getText();
				String diaChi = textDiaChi.getText();
				String sdt = textSdt.getText();
				String email = textEmail.getText();
				if(listNhaPhanPhoi.contains(new NhaPhanPhoi(maNhaPP))){
					JOptionPane.showMessageDialog(null, "Mã nhà phân phối đã tồn tại");
				}
				else{
					NhaPhanPhoi nhaPhanPhoi = new NhaPhanPhoi(maNhaPP, tenNhaPP, diaChi, Integer.parseInt(sdt), email);
					listNhaPhanPhoi.add(nhaPhanPhoi);
					String[] row = {maNhaPP, tenNhaPP, diaChi, sdt, email};
					model.addRow(row);
					JOptionPane.showMessageDialog(null, "Thêm thành công");
				}
			}
		});

		JButton btnXoatrang = new JButton("Xóa Trắng");
		btnXoatrang.setForeground(new Color(165, 42, 42));
		btnXoatrang.setFont(new Font("Arial", Font.PLAIN, 16));
		btnXoatrang.setBackground(Color.LIGHT_GRAY);
		btnXoatrang.setBounds(212, 32, 112, 27);
		panel_2.add(btnXoatrang);
		btnXoatrang.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
				textMaNhaPp.setText("");
				textTenNhaPp.setText("");
				textDiaChi.setText("");
				textSdt.setText("");
				textEmail.setText("");
			}
		});

		JButton btnCapnhat = new JButton("Cập Nhật");
		btnCapnhat.setForeground(new Color(165, 42, 42));
		btnCapnhat.setFont(new Font("Arial", Font.PLAIN, 16));
		btnCapnhat.setBackground(Color.LIGHT_GRAY);
		btnCapnhat.setBounds(56, 69, 112, 27);
		panel_2.add(btnCapnhat);
		btnCapnhat.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
				int i = table.getSelectedRow();
				String maMoi = textMaNhaPp.getText();
				String ma = model.getValueAt(i, 0).toString();
				if(ma.equals(maMoi)){
					String tenNhaPP = textTenNhaPp.getText();
					String diaChi = textDiaChi.getText();
					String sdt = textSdt.getText();
					String email = textEmail.getText();
					NhaPhanPhoi nhaPhanPhoi = new NhaPhanPhoi(maMoi, tenNhaPP, diaChi, Integer.parseInt(sdt), email);
					listNhaPhanPhoi.set(i, nhaPhanPhoi);
					model.setValueAt(maMoi, i, 0);
					model.setValueAt(tenNhaPP, i, 1);
					model.setValueAt(diaChi, i, 2);
					model.setValueAt(sdt, i, 3);
					model.setValueAt(email, i, 4);
					JOptionPane.showMessageDialog(null, "Cập nhật thành công");
				}
				else{
					JOptionPane.showMessageDialog(null, "Không được thay đổi mã");
				}
			}
		});

		JButton btnXoa = new JButton("Xóa");
		btnXoa.setForeground(new Color(165, 42, 42));
		btnXoa.setFont(new Font("Arial", Font.PLAIN, 16));
		btnXoa.setBackground(Color.LIGHT_GRAY);
		btnXoa.setBounds(212, 69, 112, 27);
		panel_2.add(btnXoa);
		btnXoa.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
				int i = table.getSelectedRow();
				if(i >= 0){
					model.removeRow(i);
					listNhaPhanPhoi.remove(i);
					JOptionPane.showMessageDialog(null, "Xóa thành công");
				}
				else{
					JOptionPane.showMessageDialog(null, "Bạn chưa chọn dòng để xóa");
				}
			}
		});
		
		JButton btnLuu = new JButton("Lưu");
		btnLuu.setForeground(new Color(165, 42, 42));
		btnLuu.setFont(new Font("Arial", Font.PLAIN, 16));
		btnLuu.setBackground(Color.LIGHT_GRAY);
		btnLuu.setBounds(136, 106, 112, 27);
		panel_2.add(btnLuu);
		
		JLabel lblNewLabel_1_1 = new JLabel("Chức năng:");
		lblNewLabel_1_1.setForeground(Color.BLUE);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1_1.setBounds(10, 352, 322, 27);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel = new JLabel("Danh Sách Nhà Phân Phối:");
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
		
		JComboBox<String> cbTim = new JComboBox<String>();
		cbTim.setForeground(Color.RED);
		cbTim.setFont(new Font("Arial", Font.PLAIN, 16));
		cbTim.setBounds(88, 25, 125, 21);
		add(cbTim);
		cbTim.addItem("Tìm theo mã");
		cbTim.addItem("Tìm theo tên");
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 16));
		textField.setBounds(223, 19, 289, 27);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Nhà Phân Phối");
		lblNewLabel_3.setBackground(new Color(165, 42, 42));
		lblNewLabel_3.setForeground(Color.BLUE);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel_3.setBounds(0, 70, 1198, 37);
		add(lblNewLabel_3);
		
		JButton btnTim = new JButton("Tìm Kiếm");
		btnTim.setIcon(new ImageIcon(NhaPhanPhoi_GUI.class.getResource("/image/magnifier.png")));
		btnTim.setForeground(new Color(165, 42, 42));
		btnTim.setFont(new Font("Arial", Font.PLAIN, 16));
		btnTim.setBackground(Color.LIGHT_GRAY);
		btnTim.setBounds(522, 20, 133, 27);
		btnTim.setHorizontalTextPosition(SwingConstants.LEADING);
		btnTim.setVerticalTextPosition(SwingConstants.CENTER);
		add(btnTim);
		// set color for header table
		JTableHeader tbHeader = table.getTableHeader();
		tbHeader.setBackground(new Color(0, 163, 163));
		tbHeader.setForeground(Color.white);
		tbHeader.setFont(new Font("Arial", Font.BOLD, 14));
		tbHeader.setToolTipText("Danh sách thông tin nhà phân phối");
		// set color for table
		ListSelectionModel model2 = table.getSelectionModel();
		model2.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				// Check if the current cell selection is not empty
				if (!e.getValueIsAdjusting()) {
					// Get the row index of the selected cell
					int rowIndex = table.getSelectedRow();

					// Set the background color of the selected row
					table.setSelectionBackground(new Color(138, 255, 255));
					table.setRowSelectionInterval(rowIndex, rowIndex);
				}
			}
		});
	}
	
	public void connect() throws SQLException {
		ConnectDB.getInstance();
		ConnectDB.connect();
	}
	
	public void loadNhaPhanPhoi() throws SQLException{
		for(NhaPhanPhoi nhaPhanPhoi : nhaPhanPhoi_DAO.getAllNhaPhanPhoi()){
			Object[] objects = {nhaPhanPhoi.getMa(), nhaPhanPhoi.getTenNhaPhanPhoi(), nhaPhanPhoi.getDiaChi(), nhaPhanPhoi.getSdt(), nhaPhanPhoi.getEmail()};
			model.addRow(objects);
		}
	}
}
