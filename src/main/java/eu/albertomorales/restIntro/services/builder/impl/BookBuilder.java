package eu.albertomorales.restIntro.services.builder.impl;

import eu.albertomorales.restIntro.model.Book;
import eu.albertomorales.restIntro.services.builder.AbstractBuilder;
import eu.albertomorales.restIntro.services.vo.BookVO;

public class BookBuilder extends AbstractBuilder<Book, BookVO> implements ObjectBuilder<Book, BookVO> {

	public BookVO build(Book book) {
		BookVO result = new BookVO(book.getId(), book.getTitle(), book.getISBN());
		return result;
	}

}
