package com.TradeTracker.Trade;

import org.springframework.data.repository.CrudRepository;

import java.util.Calendar;
import java.util.List;

public interface TradeDataRepository extends CrudRepository<TradeData, Long>{
	
	/*
	 * To implement custom methods for queries:
	 * 	-create the method where it will be used
	 * -prefix with the wanted action (findBy)
	 * -then append the field name with parenthesis
	 * EG: findByTickerSymbol() or findByMarketSector()
	 */
	
	public List<TradeData> findAllByTradeDate(Calendar tradeDataDate);
	
}
