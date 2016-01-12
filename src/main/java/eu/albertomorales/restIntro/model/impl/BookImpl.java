package eu.albertomorales.restIntro.model.impl;

import eu.albertomorales.restIntro.model.Book;

public class BookImpl implements Book {

	public BookImpl() {
	}
	public BookImpl(Book book) {
		this(null, book.getTitle(), book.getISBN());
	}
	public BookImpl(Integer id, String title, String iSBN) {
		super();
		this.id = id;
		this.title = title;
		this.iSBN = iSBN;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getISBN() {
		return iSBN;
	}
	public void setISBN(String iSBN) {
		this.iSBN = iSBN;
	}

	private Integer id;
	private String title;
	private String iSBN;

}
