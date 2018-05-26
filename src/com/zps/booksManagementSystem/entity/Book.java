package com.zps.booksManagementSystem.entity;

/**
 * 图书实体
 * @author pc
 *
 */
public class Book {
    private int id;  // 编号
	private int bookId;  // 书籍编号
	private String bookName;  // 书名
	private String author;  // 作者
	private int totalInventory;  // 总库存
	private int presentInventory;  // 现库存
	
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Book(int bookId, String bookName, String author, int totalInventory, int presentInventory) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.totalInventory = totalInventory;
		this.presentInventory = presentInventory;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getTotalInventory() {
		return totalInventory;
	}
	public void setTotalInventory(int totalInventory) {
		this.totalInventory = totalInventory;
	}
	public int getPresentInventory() {
		return presentInventory;
	}
	public void setPresentInventory(int presentInventory) {
		this.presentInventory = presentInventory;
	}
	
}
