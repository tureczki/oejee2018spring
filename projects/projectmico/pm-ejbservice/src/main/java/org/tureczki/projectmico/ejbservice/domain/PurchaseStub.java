package org.tureczki.projectmico.ejbservice.domain;

public class PurchaseStub {

	public PurchaseStub(){ }
	
	 public PurchaseStub(String email, String productname, String Date, String amount, String productprice, String currencyname, String id) {
		  this.email = email;
		  this.productname = productname;
		  this.date = date;
		  this.amount = amount;
		  this.productprice = productprice;
		  this.currencyname = currencyname;
		  this.id = id;
		 }
	                                                                                                                                                                                                                   
	private String id;
	
	private String email;
	
	private String date;
	
	private String productname;
	
	private String amount;
	
	private String productprice;
	
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

 public String toString() {
  return this.email + "\n" +
   this.id + "\n" +
   this.date + "\n" +
   this.productname + "\n" +
   this.amount + "\n" +
   this.productprice + "\n" +
   this.currencyname;
 }

}