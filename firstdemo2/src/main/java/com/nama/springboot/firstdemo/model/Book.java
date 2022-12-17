package com.nama.springboot.firstdemo.model;

import org.springframework.stereotype.Component;

@Component
public class Book {
	private int bookid;
	private String bookname;
	private String bookauthor;

	
	
	public Book()
	{
		System.out.println("Book bean created..");
	}
	
	
	public Book(int bookid, String bookname,String bookauthor) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.bookauthor = bookauthor;
		
	}
	public int getBookId() {
		return bookid;
	}
	public void setBookId(int bookid) {
		this.bookid = bookid;
	}
	public String getBookName() {
		return bookname;
	}
	public void setBookName(String bookname) {
		this.bookname = bookname;
	}
	
	public String getAuthorName() {
		return bookauthor;
	}
	public void setAuthorName(String bookauthor) {
		this.bookauthor = bookauthor;
	}
	
	

	@Override
	public String toString() {
		return "Book [bookId=" + bookid + ", bookName=" + bookname + ", authorName=" + bookauthor + "]";
	}


	@Override
	public boolean equals(Object obj) {
		return  this.bookid == ((Book)obj).bookid;
	}
	
	
	

}

