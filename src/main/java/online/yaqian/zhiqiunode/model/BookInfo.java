package online.yaqian.zhiqiunode.model;
// default package
// Generated 2016-4-13 0:51:20 by Hibernate Tools 4.3.1.Final



import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

/**
 * BookInfo generated by hbm2java
 */
@Entity
@Table(name = "book_info", catalog = "zhiqiunode", uniqueConstraints = @UniqueConstraint(columnNames = "isbn"))
@DynamicInsert(true)
@DynamicUpdate(true)
public class BookInfo implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7462251737940974162L;
	private Integer bookId;
	private String isbn;
	private String title;
	private String author;
	private String publisher;
	private Integer page;
	private BigDecimal price;
	private String summary;
	private Date updateTime;
	private Date pubDate;
	private Boolean updatable;

	public BookInfo() {
	}

	public BookInfo(String isbn) {
		this.isbn = isbn;
	}

	public BookInfo(String isbn, String title, String author, String publisher, Integer page, BigDecimal price,
			String summary, Date pubDate, Boolean updatable) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.page = page;
		this.price = price;
		this.summary = summary;
		this.pubDate = pubDate;
		this.updatable = updatable;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "book_id", unique = true, nullable = false)
	public Integer getBookId() {
		return this.bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	@Column(name = "isbn", unique = true, nullable = false, length = 13)
	public String getIsbn() {
		return this.isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Column(name = "title", length = 25)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "author", length = 25)
	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Column(name = "publisher", length = 20)
	public String getPublisher() {
		return this.publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Column(name = "page")
	public Integer getPage() {
		return this.page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	@Column(name = "price", precision = 5)
	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Column(name = "summary", length = 225)
	public String getSummary() {
		return this.summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "update_time", length = 19,updatable = false)
	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "pub_date", length = 10)
	public Date getPubDate() {
		return this.pubDate;
	}

	public void setPubDate(Date pubDate) {
		this.pubDate = pubDate;
	}

	@Column(name = "updatable")
	public Boolean getUpdatable() {
		return this.updatable;
	}

	public void setUpdatable(Boolean updatable) {
		this.updatable = updatable;
	}

	/**
	 * @Title:merge
	 * @Description:
	 * @param tbi Receieved Transit BookInfo Object
	 * @return void
	 */
	public void merge(BookInfo tbi) {
		if (tbi.getAuthor() != null) {
			this.setAuthor(tbi.getAuthor());
		}
		if (tbi.getPage() != null) {
			this.setPage(tbi.getPage());
		}
		if (tbi.getPrice() != null) {
			this.setPrice(tbi.getPrice());
		}
		if (tbi.getPubDate() != null) {
			this.setPubDate(tbi.getPubDate());
		}
		if (tbi.getPublisher() != null) {
			this.setPublisher(tbi.getPublisher());
		}
		if (tbi.getSummary() != null) {
			this.setSummary(tbi.getSummary());
		}
		if (tbi.getTitle() != null) {
			this.setTitle(tbi.getTitle());
		}
	}
}
