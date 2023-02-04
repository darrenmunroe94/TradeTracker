package com.TradeTracker.TradeAnalysis;

import org.springframework.data.repository.CrudRepository;

public interface MarketSectorCountRepository extends CrudRepository<MarketSectorCount, Long> {

	Integer findBySectorCount();

}
