package com.zps.booksManagementSystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.zps.booksManagementSystem.entity.Book;

/**
 * ͼ��Dao��
 * @author zps
 *
 */
public class BookDao {
	
	/**
	 * ¼���鼮
	 * @param con
	 * @param book
	 * @return
	 * @throws Exception
	 */
	public int add(Connection con,Book book)throws Exception{
		String sql = "insert into t_book values(null,?,?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, book.getId());
		pstmt.setString(2, book.getBookName());
		pstmt.setString(3, book.getAuthor());
		pstmt.setInt(4, book.getTotalInventory());
		pstmt.setInt(5, book.getPresentInventory());
		return pstmt.executeUpdate();
	}
}
