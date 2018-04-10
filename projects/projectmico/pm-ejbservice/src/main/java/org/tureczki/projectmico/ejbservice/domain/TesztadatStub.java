package org.tureczki.projectmico.ejbservice.domain;

public class TesztadatStub {
	
	private String azonosito;
	
	public TesztadatStub(String azonosito ){
		this.azonosito = azonosito;
	}
	
    public void setAzonosito(String azonosito) {
        this.azonosito = azonosito;
    }

    public String getAzonosito() {
        return azonosito;
}
	 
	public String toString(){ 
	  return "Azonosito: " + this.azonosito;  
	 } 
	
}
