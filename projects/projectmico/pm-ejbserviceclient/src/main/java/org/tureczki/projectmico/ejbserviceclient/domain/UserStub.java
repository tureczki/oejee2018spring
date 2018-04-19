package org.tureczki.projectmico.ejbserviceclient.domain;

import java.io.Serializable;

public class UserStub implements Serializable {

 private String email;
 private String passwordhash;
 private String experience;
 private String subscriber;
 private String theme;
 private String currency;

 public UserStub() {}


 public UserStub(String email, String passwordhash, String experience, String subscriber, String theme, String currency) {
  this.email = email;
  this.passwordhash = passwordhash;
  this.experience = experience;
  this.subscriber = subscriber;
  this.theme = theme;
  this.currency = currency;
 }

 public void setEmail(String email) {
  this.email = email;
 }

 public String getEmail() {
  return email;
 }

 public void setPasswordhash(String passwordhash) {
  this.passwordhash = passwordhash;
 }

 public String getPasswordhash() {
  return passwordhash;
 }

 public void setExperience() {
  this.experience = experience;
 }

 public String getExperience() {
  return experience;
 }

 public void setSubscriber(String subscriber) {
  this.subscriber = subscriber;
 }

 public String getSubscriber() {
  return subscriber;
 }

 public void setTheme(String theme) {
  this.theme = theme;
 }

 public String getTheme() {
  return theme;
 }

 public void setCurrency(String currency) {
  this.currency = currency;
 }

 public String getCurrency() {
  return currency;
 }

 public String toString() {
  return this.email + "\n" +
   this.passwordhash + "\n" +
   this.experience + "\n" +
   this.subscriber + "\n" +
   this.theme + "\n" +
   this.currency;
 }

}