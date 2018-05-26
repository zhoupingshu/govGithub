package com.zps.booksManagementSystem.view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import com.zps.booksManagementSystem.dao.BookDao;
import com.zps.booksManagementSystem.entity.Book;
import com.zps.booksManagementSystem.util.DbUtil;
import com.zps.booksManagementSystem.util.StringUtil;

public class BookAddInterFrame extends JInternalFrame {
	private JTextField bookIdTxt;
	private JTextField bookNameTxt;
	private JTextField authorTxt;
	private JTextField totalInventoryTxt;
	private JTextField presentInventoryTxt;
	
	private DbUtil dbUtil = new DbUtil();
	private BookDao bookDao = new BookDao();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookAddInterFrame frame = new BookAddInterFrame();
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
	public BookAddInterFrame() {
		setTitle("\u5F55\u5165\u4E66\u7C4D");
		setFrameIcon(new ImageIcon(BookAddInterFrame.class.getResource("/images/\u5F55\u5165\u62A5\u544A2.png")));
		setClosable(true);
		setIconifiable(true);
		setBounds(100, 100, 450, 300);
		
		JLabel label = new JLabel("\u4E66\u7C4D\u7F16\u53F7");
		
		bookIdTxt = new JTextField();
		bookIdTxt.setColumns(10);
		
		JLabel label_1 = new JLabel("\u4E66  \u540D");
		
		bookNameTxt = new JTextField();
		bookNameTxt.setColumns(10);
		
		JLabel label_2 = new JLabel("\u4F5C    \u8005");
		
		authorTxt = new JTextField();
		authorTxt.setColumns(10);
		
		JLabel label_3 = new JLabel("\u603B \u5E93 \u5B58");
		
		totalInventoryTxt = new JTextField();
		totalInventoryTxt.setColumns(10);
		
		JLabel label_4 = new JLabel("\u73B0\u5E93\u5B58");
		
		presentInventoryTxt = new JTextField();
		presentInventoryTxt.setColumns(10);
		
		JButton btnNewButton = new JButton("\u5F55\u5165");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bookAddActionPerformed(e);
			}
		});
		btnNewButton.setIcon(new ImageIcon(BookAddInterFrame.class.getResource("/images/\u5F55\u5165\u62A5\u544A1.png")));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(58)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(label)
						.addComponent(label_2)
						.addComponent(label_3))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(authorTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(bookIdTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(totalInventoryTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(53)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(label_4)
									.addGap(18)
									.addComponent(presentInventoryTxt))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(label_1)
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(bookNameTxt)
										.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
					.addContainerGap(64, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(55)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label)
						.addComponent(bookIdTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_1)
						.addComponent(bookNameTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(52)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_2)
						.addComponent(authorTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton))
					.addGap(50)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_3)
						.addComponent(label_4)
						.addComponent(presentInventoryTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(totalInventoryTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(42, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);

	}

	/**
	 * 录入书籍事件处理
	 * @param evt
	 */
	private void bookAddActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		String bookId = this.bookIdTxt.getText();
		String bookName = this.bookIdTxt.getText();
		String author = this.authorTxt.getText();
		String totalInventory = this.totalInventoryTxt.getText();
		String presentInventory = this.presentInventoryTxt.getText();
		
		if(StringUtil.isEmpty(bookId)) {
			JOptionPane.showMessageDialog(null, "书籍编号不能为空!");
			return;
		}
		
		if(StringUtil.isEmpty(bookName)) {
			JOptionPane.showMessageDialog(null, "书名不能为空!");
			return;
		}
		if(StringUtil.isEmpty(author)) {
			JOptionPane.showMessageDialog(null, "作者不能为空!");
			return;
		}
		if(StringUtil.isEmpty(totalInventory)) {
			JOptionPane.showMessageDialog(null, "总库存不能为空!");
			return;
		}
		if(StringUtil.isEmpty(presentInventory)) {
			JOptionPane.showMessageDialog(null, "现库存不能为空!");
			return;
		}
		Book book = new Book();
		
		Connection con = null;
		try {
			con = dbUtil.getCon();
			int addNum = bookDao.add(con, book);
			if(addNum ==1) {
				JOptionPane.showMessageDialog(null, "录入书籍成功!");
				resetValue();
			}else {
				JOptionPane.showMessageDialog(null, "录入书籍失败!");
			}
		}catch(Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "录入书籍失败!");
		}finally {
			try {
				dbUtil.closeCon(con);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 重置表单
	 */
	private void resetValue(){
		this.bookIdTxt.setText("");
		this.bookNameTxt.setText("");
		this.authorTxt.setText("");
		this.totalInventoryTxt.setText("");
		this.presentInventoryTxt.setText("");
	}
}
