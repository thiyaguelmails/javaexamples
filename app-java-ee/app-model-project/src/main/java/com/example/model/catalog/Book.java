package com.example.model.catalog;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import com.example.model.catalog.types.CurrencyType;

@Entity
@DiscriminatorValue(value="Book")
//@AttributeOverrides(  // only if table_per_class strategy is used
//        value=@AttributeOverride(name="id",column=@Column(name="book_id")))
@NamedQueries(value={
	@NamedQuery(name="findAllBooks",query="select b from Book b join fetch b.tags"),
	@NamedQuery(name="getBookCover",query="select b.cover from Book b where b.itemId = :itemId ")
})
@XmlType(name="book")
@XmlAccessorType(XmlAccessType.FIELD)
public class Book extends Item {

    @Column(length = 200)
    private String title;
    
    private String isbn;
    
    @Enumerated(EnumType.STRING)
    private CurrencyType currency;
    
    @ElementCollection(fetch=FetchType.LAZY)
    @CollectionTable(name="Tag") // default name would be book_tags
    @Column(name="Value") // value column on Tag table
    private List<String> tags;
    
    @Lob
    @Basic(fetch=FetchType.LAZY)
    @XmlTransient
    private byte[] cover;
    
    public Book() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	public Book(String description) {
        super(description);
        // TODO Auto-generated constructor stub
    }

    public Book(String description, String title, String isbn, CurrencyType currency) {
        super(description);
        this.title = title;
        this.isbn = isbn;
        this.currency = currency;
    }

    public byte[] getCover() {
		return cover;
	}
	public void setCover(byte[] cover) {
		this.cover = cover;
	}
	public List<String> getTags() {
        return tags;
    }
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public CurrencyType getCurrency() {
        return currency;
    }
    public void setCurrency(CurrencyType currency) {
        this.currency = currency;
    }
    
}
