package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

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
		
		JPanel panelTitle = new JPanel();
		panelTitle.setBounds(388, 37, 395, 77);
		panelTong.add(panelTitle);
		panelTitle.setLayout(null);
		
		JLabel lblTitle = new JLabel("Quản Lý Bán Xe Máy");
		lblTitle.setForeground(new Color(255, 0, 0));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblTitle.setBounds(10, 10, 375, 57);
		panelTitle.add(lblTitle);
		
	}
}
