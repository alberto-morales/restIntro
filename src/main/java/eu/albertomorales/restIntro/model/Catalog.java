package eu.albertomorales.restIntro.model;

import java.util.List;

public interface Catalog {

	/**
	 * @return whole book's catalog
	 */
	public abstract List<Book> getAll();

	/**
	 * @return a book with a given ID
	 */
	public abstract Book getByID(Integer id);

	/**
	 * Add a book to the catalog
	 *
	 * @param title
	 * @param iSBN
	 * @return the added book
	 */
	public abstract Book addToCatalog(String title, String iSBN);

}
