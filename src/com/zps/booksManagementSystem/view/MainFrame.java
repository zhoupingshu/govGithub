package com.zps.booksManagementSystem.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JDesktopPane table = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setBackground(Color.GRAY);
		setForeground(Color.GRAY);
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainFrame.class.getResource("/images/\u754C\u9762\u64CD\u63A7.png")));
		setTitle("\u4E3B\u754C\u9762");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 552, 490);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("\u57FA\u672C\u529F\u80FD");
		menu.setIcon(new ImageIcon(MainFrame.class.getResource("/images/\u529F\u80FD\u6A21\u5757.png")));
		menuBar.add(menu);
		
		JMenuItem menuItem = new JMenuItem("\u5F55\u5165\u4E66\u7C4D");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookAddInterFrame bookAddInterFrm=new BookAddInterFrame();
				bookAddInterFrm.setVisible(true);
				table.add(bookAddInterFrm);
			}
		});
		menuItem.setIcon(new ImageIcon(MainFrame.class.getResource("/images/\u5F55\u5165\u62A5\u544A2.png")));
		menu.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("\u6E05\u7A7A\u4E66\u7C4D");
		menuItem_1.setIcon(new ImageIcon(MainFrame.class.getResource("/images/\u6E05\u7A7A\u5220\u9664.png")));
		menu.add(menuItem_1);
		
		JMenuItem menuItem_2 = new JMenuItem("\u67E5\u627E\u4E66\u7C4D");
		menuItem_2.setIcon(new ImageIcon(MainFrame.class.getResource("/images/\u67E5\u627E2.png")));
		menu.add(menuItem_2);
		
		JMenuItem menuItem_3 = new JMenuItem("\u4FEE\u6539\u4E66\u7C4D");
		menuItem_3.setIcon(new ImageIcon(MainFrame.class.getResource("/images/\u4FEE\u6539.png")));
		menu.add(menuItem_3);
		
		JMenu menu_1 = new JMenu("\u9000\u51FA\u7CFB\u7EDF");
		menu_1.setIcon(new ImageIcon(MainFrame.class.getResource("/images/\u9000\u51FA.png")));
		menuBar.add(menu_1);
		
		JMenuItem menuItem_4 = new JMenuItem("\u5B89\u5168\u9000\u51FA");
		menuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "确定退出图书管理系统？");
				//System.out.println(result);
				if(result==0) {
					dispose();
				}
			}
		});
		menuItem_4.setIcon(new ImageIcon(MainFrame.class.getResource("/images/\u9000\u51FAq.png")));
		menu_1.add(menuItem_4);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.GRAY);
		contentPane.add(desktopPane, BorderLayout.CENTER);
		
		// 设置主界面最大化
		//this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
	}
}
