package com.practise.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Book_DTL")
public class BookEntity {
	
	@Id
	@Column(name = "Book_Id")
	@GeneratedValue
private Integer bookId;
	@Column(name = "Book_Name")
private String bookName;
	
	@Column(name = "Book_Price")
private String bookPrice;
	@Column(name = "Author_Name")
private String authorName;
	
public Integer getBookId() {
	return bookId;
}
public void setBookId(Integer bookId) {
	this.bookId = bookId;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public String getBookPrice() {
	return bookPrice;
}
public void setBookPrice(String bookPrice) {
	this.bookPrice = bookPrice;
}
public String getAuthorName() {
	return authorName;
}
public void setAuthorName(String authorName) {
	this.authorName = authorName;
}
@Override
public String toString() {
	return "BookEntity [bookId=" + bookId + ", bookName=" + bookName + ", bookPrice=" + bookPrice + ", authorName="
			+ authorName + "]";
}





}
