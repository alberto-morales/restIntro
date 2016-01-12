package eu.albertomorales.restIntro.model.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import eu.albertomorales.restIntro.model.Book;
import eu.albertomorales.restIntro.model.Catalog;

public class CatalogImpl implements Catalog {

	/**
	 * The default constructor, populates the catalog itself
	 */
	public CatalogImpl() {
		BookImpl libro = createBook7();
		bookMap.put(libro.getId(), libro);
		libro = createBook1();
		bookMap.put(libro.getId(), libro);
		libro = createBook2();
		bookMap.put(libro.getId(), libro);
	}

	/* (non-Javadoc)
	 * @see eu.albertomorales.restIntro.model.Catalog#getAll()
	 */
	@Override
	public List<Book> getAll() {
		List<Book> result = new ArrayList<Book>();
		for (Integer index : bookMap.keySet()) {
			result.add(bookMap.get(index));
		}
		return result;
	}

	/* (non-Javadoc)
	 * @see eu.albertomorales.restIntro.model.Catalog#getByID(java.lang.Integer)
	 */
	@Override
	public Book getByID(Integer id) {
		return bookMap.get(id);
	}

	/* (non-Javadoc)
	 * @see eu.albertomorales.restIntro.model.Catalog#addToCatalog(java.lang.String, java.lang.String)
	 */
	@Override
	public Book addToCatalog(String title, String iSBN) {
		BookImpl book = new BookImpl(nextVal(), title, iSBN);
		book.setId(nextVal());
		bookMap.put(book.getId(), book);
		return null;
	}

	private Integer nextVal() {
		Integer secuence = 0;
		for (Integer index : bookMap.keySet()) {
			if (secuence.compareTo(index) < 0) {
				secuence = index;
			}
		}
		secuence = new Integer(secuence.intValue() + 1);
		return secuence;

	}
	private BookImpl createBook7() {
		return new BookImpl(7, "Harry Potter and the Deathly Hallows (Book 7)", "978-0439708180");
	}

	private BookImpl createBook2() {
		return new BookImpl(2, "Harry Potter And The Chamber Of Secrets (Book 2)", "978-0439064873");
	}

	private BookImpl createBook1() {
		return new BookImpl(1, "Harry Potter and the Philosopher's Stone (Book 1)", "0-7475-3269-9");
	}

	private Map<Integer, Book> bookMap = new HashMap<Integer, Book>();

}
