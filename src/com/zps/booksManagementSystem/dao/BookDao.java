package com.zps.booksManagementSystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.zps.booksManagementSystem.entity.Book;

/**
 * 图书Dao类
 * @author zps
 *
 */
public class BookDao {
	
	/**
	 * 录入书籍
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
