package eu.albertomorales.restIntro.services.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import eu.albertomorales.restIntro.model.Book;
import eu.albertomorales.restIntro.model.Catalog;
import eu.albertomorales.restIntro.services.builder.impl.BookBuilder;
import eu.albertomorales.restIntro.services.vo.BookVO;

public class BookService {

    @GET
    @Path("/books/{bookId}/")
    @Produces("application/json")
    @Consumes("application/json")
    public BookVO getBook(@PathParam("bookId") Integer bookId) {
    	if (bookId == null) return null;
    	Book book = catalog.getByID(Integer.valueOf(bookId));
    	BookVO result = builder.build(book);
		return result;
    }

    @PUT
    @Path("/books")
    @Produces("application/json")
    @Consumes("application/json")
    public BookVO addBook(BookVO bookParam) {
    	if (bookParam == null) return null;
    	if (bookParam.getId() != null) return bookParam;
    	Book bookAdded = catalog.addToCatalog(bookParam.getTitle(),
    										  bookParam.getISBN());
    	BookVO result = builder.build(bookAdded);
		return result;
    }

    @GET
    @Path("/books")
    @Produces("application/json")
    public List<BookVO> getAll() {
    	List<Book> bookList = catalog.getAll();
    	List<BookVO> voList = builder.build(bookList);
		return voList;
	}

    public void setCatalog(Catalog catalog) {
		this.catalog = catalog;
	}
	public void setBuilder(BookBuilder builder) {
		this.builder = builder;
	}

    private Catalog catalog;
	private BookBuilder builder;

}
