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
@Table(name = "investment")
 @NamedQueries(
		value = {
 @NamedQuery(name = Investment.GET_BY_INVESTMENTID, query = "SELECT b FROM Investment b WHERE b.investmentID=:investmentID"),
 @NamedQuery(name = Investment.GET_ALL, query = "SELECT b FROM Investment b"),
		}
		)
public class Investment implements Serializable{
	
	public static final String GET_BY_INVESTMENTID = "Investment.getByInvestmentID";
	public static final String GET_ALL = "Investment.getAll";
	
	@Id
	@SequenceGenerator(name = "generatorInvestment", sequenceName =
	"investment_investment_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
	"generatorInvestment" )
	@Column(name = "investment_id", nullable = false)
	private Long investmentID;
	
	@Column(name = "investor_id", nullable = true)
	private String investorID;
	@Column(name = "invested_amount", nullable = true)
	private double investedAmount;
	@Enumerated(EnumType.ORDINAL)
	@Column(name = "investment_investmentcategory_id", nullable = true)
	private InvestmentCategory investmentCategory;
	
	public void setInvestmentCategory(InvestmentCategory investmentCategory){
		this.investmentCategory = investmentCategory;
	}
	
	public void setInvestedAmount(double investedAmount){
		this.investedAmount = investedAmount;
	}
	
	public void setInvestorID(String investorID){
		this.investorID = investorID;
	}
	
	public void setInvestmentID(Long investmentID){
		this.investmentID = investmentID;
	}
	
	public InvestmentCategory getInvestmentCategory(){
		return investmentCategory;
	}
	
	public double getInvestedAmount(){
		return investedAmount;
	}
	
	public String getInvestorID(){
		return investorID;
	}
	
	public Long getInvestmentID(){
		return investmentID;
	}
}