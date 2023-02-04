package com.TradeTracker.Trade;

import java.math.BigDecimal;
import java.util.Calendar;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

@Entity
public class TradeData {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	
	@NotNull
	private String tickerSymbol;
	private TradeAction tradeAction;
	@Min(1)
	private Double tradeQuantity;
	private Calendar tradeDate;
	private BigDecimal transactionPrice;
	private TradeMarketSector marketSector;
	private Boolean wasHalted;
	
	public TradeData() { //create NULL TradeData object
		
		this.tickerSymbol = "NULL";
		this.tradeAction = TradeAction.BUY;
		this.tradeQuantity = 0.0;
		this.tradeDate = null;
		this.transactionPrice = new BigDecimal(0.0);
		this.marketSector = TradeMarketSector.NONE;
		this.wasHalted = false;
		
	}
	
	public TradeData(String tickerSymbol, TradeAction tradeAction, Double tradeQuantity, Calendar tradeDate, BigDecimal transactionPrice, TradeMarketSector marketSector, Boolean wasHalted) {
		
		this.tickerSymbol = tickerSymbol;
		this.tradeAction = tradeAction;
		this.tradeQuantity = tradeQuantity;
		this.tradeDate = tradeDate;
		this.transactionPrice = transactionPrice;
		this.marketSector = marketSector;
		this.wasHalted = wasHalted;
		
	}
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return Id;
	}
	
	/**
	 * @return the tickerSymbol
	 */
	public String getTickerSymbol() {
		return tickerSymbol;
	}

	/**
	 * @return the tradeAction
	 */
	public TradeAction getTradeAction() {
		return tradeAction;
	}

	/**
	 * @return the tradeQuantity
	 */
	public Double getTradeQuantity() {
		return tradeQuantity;
	}

	/**
	 * @return the tradeDate
	 */
	public Calendar getTradeDate() {
		return tradeDate;
	}

	/**
	 * @return the transactionPrice
	 */
	public BigDecimal getTransactionPrice() {
		return transactionPrice;
	}

	/**
	 * @return the marketSector
	 */
	public TradeMarketSector getMarketSector() {
		return marketSector;
	}

	/**
	 * @return the wasHalted
	 */
	public Boolean getWasHalted() {
		return wasHalted;
	}



}
