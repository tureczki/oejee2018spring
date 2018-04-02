package org.tureczki.persistence.entity;

import java.math.BigDecimal;

@Entity
@Table(name = "investment")
public class Investment implements Seriazable{
	
	@Id
	@SequenceGenerator(name = "generatorInvestment", sequenceName =
	"investment_investment_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
	"generatorInvestment" )
	@Column(name = "investment_id", nullable = false)
	private Long investmentID;
	
	@Column(name = "investor_id", nullable = false)
	private String investorID;
	@Column(name = "invested_amount", nullable = false)
	private BigDecimal investedAmount;
	@Enumerated(EnumType.ORIGINAL)
	@Column(name = "investment_category_id", nullable = false)
	private InvestmentCategoryStub investmentCategory;
	
}