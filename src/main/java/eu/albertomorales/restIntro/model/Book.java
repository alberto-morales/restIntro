package eu.albertomorales.restIntro.model;

public interface Book {

	/**
	 * @return book's ID
	 */
	public abstract Integer getId();

	/**
	 * @return book's title
	 */
	public abstract String getTitle();

	/**
	 * @return book's ISBN
	 */
	public abstract String getISBN();

}
