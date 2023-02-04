package com.TradeTracker.TradeAnalysis;

import org.springframework.stereotype.Service;

@Service
public class MarketSectorAnalysis {
	
	/*
	 * This object needs to count each instance of
	 * each sector and include/update the repository
	 * with the appropriate count.
	 */
	
	private MarketSectorCountRepository marketSectorCountRepository;
	
	@SuppressWarnings("unused")
	private MarketSectorAnalysis() {
		
	}
	
	public MarketSectorAnalysis(Integer newMarketSectorCount){
		
		if(marketSectorCountRepository.count() == 0L) {
			
			marketSectorCountRepository.save(new MarketSectorCount(0));
		}
		
		else {
			
			updateMarketSectorCount(newMarketSectorCount);
		}
		
	}
	
	public void updateMarketSectorCount(Integer newMarketSectorCount) {
		
		Integer currentMarketSectorCount = marketSectorCountRepository.findBySectorCount();		
		marketSectorCountRepository.deleteAll();
		
		marketSectorCountRepository.save(new MarketSectorCount(currentMarketSectorCount + newMarketSectorCount));
		
		
	}
	
	public String sectorCountAsPercent() {
		
		//Integer currentMarketSectorCount = marketSectorCountRepository.findBySectorCount();	
		
		//Integer sectorCountToPercent = 
		
		//return(sectorCountToPercent.toString());
		
		return("");
		
	}

}
