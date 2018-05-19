package org.tureczki.projectmico.ejbservice.domain;

public class CurrencyStub {

 private String name;
 private String unit;
 private String toUSD;

 public CurrencyStub() {}


 public CurrencyStub(String name, String unit, String toUSD) {
  this.name = name;
  this.unit = unit;
  this.toUSD = toUSD;
 }

 public void setName(String name) {
  this.name = name;
 }

 public String getName() {
  return name;
 }

 public void setUnit(String unit) {
  this.unit = unit;
 }

 public String getUnit() {
  return unit;
 }

 public void setToUSD() {
  this.toUSD = toUSD;
 }
 
 public String getToUSD(){
	 return toUSD;
 }

 public String toString() {
  return this.name + "\n" +
   this.unit + "\n" +
   this.toUSD;
 }

}