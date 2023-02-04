package com.TradeTracker.TradeAnalysis;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class HaltCount {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	
	private Integer haltCount;

	@SuppressWarnings("unused")
	private HaltCount() {
		
	}

	
	public HaltCount(Integer haltCount) {

		this.haltCount = haltCount;
		
	}
	
	public Integer getHaltCount() {
		
		return(haltCount);
		
	}

}
