package com.TradeTracker;

import java.math.BigDecimal;
import java.util.Calendar;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class TradeData {

	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	

	private String tickerSymbol;
	private TradeAction tradeAction;
	private Double tradeQuantity;
	private Calendar tradeDate;
	private BigDecimal transactionPrice;
	private MarketSector marketSector;
	private Boolean wasHalted;
	
	public TradeData() {
		
	}
	
	public TradeData(String tickerSymbol, TradeAction tradeAction, Double tradeQuantity, Calendar tradeDate, BigDecimal transactionPrice, MarketSector marketSector, Boolean wasHalted) {
		
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
	 * @param tickerSymbol the tickerSymbol to set
	 */
	public void setTickerSymbol(String tickerSymbol) {
		this.tickerSymbol = tickerSymbol;
	}

	/**
	 * @return the tradeAction
	 */
	public TradeAction getTradeAction() {
		return tradeAction;
	}

	/**
	 * @param tradeAction the tradeAction to set
	 */
	public void setTradeAction(TradeAction tradeAction) {
		this.tradeAction = tradeAction;
	}

	/**
	 * @return the tradeQuantity
	 */
	public Double getTradeQuantity() {
		return tradeQuantity;
	}

	/**
	 * @param tradeQuantity the tradeQuantity to set
	 */
	public void setTradeQuantity(Double tradeQuantity) {
		this.tradeQuantity = tradeQuantity;
	}

	/**
	 * @return the tradeDate
	 */
	public Calendar getTradeDate() {
		return tradeDate;
	}

	/**
	 * @param tradeDate the tradeDate to set
	 */
	public void setTradeDate(Calendar tradeDate) {
		this.tradeDate = tradeDate;
	}

	/**
	 * @return the transactionPrice
	 */
	public BigDecimal getTransactionPrice() {
		return transactionPrice;
	}

	/**
	 * @param transactionPrice the transactionPrice to set
	 */
	public void setTransactionPrice(BigDecimal transactionPrice) {
		this.transactionPrice = transactionPrice;
	}

	/**
	 * @return the marketSector
	 */
	public MarketSector getMarketSector() {
		return marketSector;
	}

	/**
	 * @param marketSector the marketSector to set
	 */
	public void setMarketSector(MarketSector marketSector) {
		this.marketSector = marketSector;
	}

	/**
	 * @return the wasHalted
	 */
	public Boolean getWasHalted() {
		return wasHalted;
	}

	/**
	 * @param wasHalted the wasHalted to set
	 */
	public void setWasHalted(Boolean wasHalted) {
		this.wasHalted = wasHalted;
	}


}
