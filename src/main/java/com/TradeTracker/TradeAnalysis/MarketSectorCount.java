package com.TradeTracker.TradeAnalysis;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MarketSectorCount {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	
	private Integer sectorCount;

	@SuppressWarnings("unused")
	private MarketSectorCount() {}
	
	public MarketSectorCount(Integer sectorCount) {
		
		this.sectorCount = sectorCount;
		
	}
	
	public Integer getSectorCount() {
		
		return(sectorCount);
		
	}

}
