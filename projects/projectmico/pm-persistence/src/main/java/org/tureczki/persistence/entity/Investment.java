package org.tureczki.persistence.entity;

import java.math.BigDecimal;

@Entity
@Table(name = "investment")
@NamedQueries(
		value = {
				//
				@NamedQuery(investor_id = Investment.GET_BY_INVESTMENTID, query = "SELECT"
						+ " b from Investment b where b.investment_id=:investment_id"),
				@NamedQuery(investor_id = Investment.GET_ALL, query = "SELECT b from"
						+ " Invesmtent b ORDER BY b.investment_id")
		}
		)
public class Investment implements Seriazable{
	
	public static final String GET_BY_INVESTMENTID = "Investment.getByInvestmentID";
	public static final String GET_ALL = "Investment.getAll";
	
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