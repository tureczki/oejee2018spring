package org.tureczki.persistence.entity;

import java.math.BigDecimal;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.tureczki.persistence.entity.trunk.InvestmentCategory;

@Entity
@Table(name = "tesztadatok")
 @NamedQueries(
		value = {
 @NamedQuery(name = Tesztadat.GET_BY_AZONOSITO, query = "SELECT b FROM Tesztadat b")
		}
		)
public class Tesztadat implements Serializable{
	
	public Tesztadat(){
		
	}
	
	public Tesztadat(String azonosito){
		this.azonosito = azonosito;
	}
	
	public static final String GET_BY_AZONOSITO = "Tesztadat.getByAzonosito";
	
	@Id
	@Column(name = "azonosito", nullable = false)
	private String azonosito;
	
	public void setAzonosito(String azonosito){
		this.azonosito = azonosito;
	}
	
	public String getAzonosito(){
		return azonosito;
	}
}