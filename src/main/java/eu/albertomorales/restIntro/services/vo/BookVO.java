package eu.albertomorales.restIntro.services.vo;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="book")
public class BookVO implements Serializable {

	public BookVO() {
	}

	public BookVO(Integer id, String title, String iSBN) {
		super();
		this.id = id;
		this.title = title;
		this.iSBN = iSBN;
	}

	@XmlElement(name="id")
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@XmlElement(name="title")
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@XmlElement(name="isbn")
	public String getISBN() {
		return iSBN;
	}
	public void setISBN(String iSBN) {
		this.iSBN = iSBN;
	}

	private Integer id;
	private String title;
	private String iSBN;
	private static final long serialVersionUID = 1L;

}
