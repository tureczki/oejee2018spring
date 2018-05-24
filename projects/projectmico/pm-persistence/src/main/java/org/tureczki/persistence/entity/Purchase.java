package org.tureczki.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "Purchases")
@NamedQueries( value = { @NamedQuery( name = "Purchase.GET_ALL", query = "select p from Purchase p" ) } )
public class Purchase {
	
	public static final String GET_ALL = "Purchase.GET_ALL";
	
	public Purchase(){ }
	
	 public Purchase(String email, String productname, String Date, String amount, String productprice, String currencyname, String id) {
		  this.email = email;
		  this.productname = productname;
		  this.date = date;
		  this.amount = amount;
		  this.productprice = productprice;
		  this.currencyname = currencyname;
		  this.id = id;
		 }
	                                                                                                                                                                                                                   
	@Id
	@Column(name = "id", nullable = false)
	private String id;
	
	@Column(name = "email", nullable = false)
	private String email;
	
	@Column(name = "date", nullable = false)
	private String date;
	
	@Column(name = "productname", nullable = false)
	private String productname;
	
	@Column(name = "amount", nullable = false)
	private String amount;
	
	@Column(name = "productprice", nullable = false)
	private String productprice;
	
	@Column(name = "currencyname", nullable = false)
	private String currencyname;
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getEmail(){
		return email;
	}
	
	public void setId(String id){
		this.id = id;
	}
	
	public String getId(){
		return id;
	}
	
	public void setDate(){
		this.date = date;
	}
	
	public String getDate(){
		return date;
	}
	
	public void setProductname(String productname){
		this.productname = productname;
	}
	
	public String getProductname(){
		return productname;
	}
	
	public void setAmount(String amount){
		this.amount = amount;
	}
	
	public String getAmount(){
		return amount;
	}
	
	public void setProductprice(String prodctprice){
		this.productprice = productprice;
	}
	
	public String getProductprice(){
		return productprice;
	}
	
	public void setCurrencyname(String currencyname){
		this.currencyname = currencyname;
	}

}
