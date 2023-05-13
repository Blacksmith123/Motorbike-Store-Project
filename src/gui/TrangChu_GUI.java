package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;

public class TrangChu_GUI extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public TrangChu_GUI() {
		setLayout(null);
		
		JPanel panelTong = new JPanel();
		panelTong.setForeground(new Color(255, 0, 0));
		panelTong.setBounds(0, 0, 1200, 710);
		add(panelTong);
		panelTong.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("QUẢN LÝ BÁN XE MÁY", SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel_1.setBounds(0, 0, 1161, 74);
		panelTong.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TrangChu_GUI.class.getResource("/image/TrangChu.jpg")));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(79, 156, 1003, 476);
		panelTong.add(lblNewLabel);
		
	}
}
