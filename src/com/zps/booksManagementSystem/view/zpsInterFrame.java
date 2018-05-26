package com.zps.booksManagementSystem.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;

public class zpsInterFrame extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					zpsInterFrame frame = new zpsInterFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public zpsInterFrame() {
		setFrameIcon(new ImageIcon(zpsInterFrame.class.getResource("/images/\u7528\u62373.png")));
		setIconifiable(true);
		getContentPane().setBackground(Color.ORANGE);
		
		JLabel lblNl = new JLabel("");
		lblNl.setIcon(new ImageIcon(zpsInterFrame.class.getResource("/images/\u4E66.png")));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(116)
					.addComponent(lblNl)
					.addContainerGap(117, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(37, Short.MAX_VALUE)
					.addComponent(lblNl)
					.addGap(33))
		);
		getContentPane().setLayout(groupLayout);
		setClosable(true);
		setRootPaneCheckingEnabled(false);
		setTitle("\u5173\u4E8E zps");
		setBounds(100, 100, 450, 300);

	}

}
