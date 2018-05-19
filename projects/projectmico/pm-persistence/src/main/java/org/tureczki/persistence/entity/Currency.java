package org.tureczki.projectmico.persistence.entity;

import java.io.Serializable;
import javax.persistence.*;

// @Entity
// @Table (name = "Currencies")
public class Currency implements Serializable{
//	@Column(name = "name", nullable = false)
	String name;
	
//	@Column(name = "unit", nullable = false)
	String unit;
	
//	@Column(name = "tousd", nullable = false)
	String toUSD;
}
