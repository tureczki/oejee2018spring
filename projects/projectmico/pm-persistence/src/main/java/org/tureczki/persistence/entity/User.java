package org.tureczki.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "Users")
@NamedQueries( value = { @NamedQuery( name = "User.GET_BY_EMAIL", query = "select u from User u where email =:email" ) } )
public class User {
	
	public static final String GET_BY_EMAIL = "User.GET_BY_EMAIL";
	
	public User(){ }
	
	 public User(String email, String passwordhash, String experience, String subscriber, String theme, String currency) {
		  this.email = email;
		  this.passwordhash = passwordhash;
		  this.experience = experience;
		  this.subscriber = subscriber;
		  this.theme = theme;
		  this.currency = currency;
		 }
	                                                                                                                                                                                                                   
	@Id
	@Column(name = "email", nullable = false)
	private String email;
	
	@Column(name = "passwordhash", nullable = false)
	private String passwordhash;
	
	@Column(name = "experience", nullable = false)
	private String experience;
	
	@Column(name = "subscriber", nullable = false)
	private String subscriber;
	
	@Column(name = "theme", nullable = false)
	private String theme;
	
	@Column(name = "currency", nullable = false)
	private String currency;
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getEmail(){
		return email;
	}
	
	public void setPasswordhash(String passwordhash){
		this.passwordhash = passwordhash;
	}
	
	public String getPasswordhash(){
		return passwordhash;
	}
	
	public void setExperience(){
		this.experience = experience;
	}
	
	public String getExperience(){
		return experience;
	}
	
	public void setSubscriber(String subscriber){
		this.subscriber = subscriber;
	}
	
	public String getSubscriber(){
		return subscriber;
	}
	
	public void setTheme(String theme){
		this.theme = theme;
	}
	
	public String getTheme(){
		return theme;
	}
	
	public void setCurrency(String currency){
		this.currency = currency;
	}
	
	public String getCurrency(){
		return currency;
	}

}
