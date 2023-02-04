package com.TradeTracker.Trade;

import java.util.Optional;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//CRUD methods for data into/out of database
@RestController
@RequestMapping(path = "/api/v1/trade")
public class TradeDataController {
	
	@Autowired
	private TradeDataRepository tradeDataRepository;

	@PostMapping("/create")
	public void createTradeData(@RequestBody TradeData tradeData) {
		
		tradeDataRepository.save(tradeData);
		
	}
	
	@PostMapping("/by_id")
	public TradeData readTradeData(@RequestBody Long tradeDataId) {
		
		TradeData noSuchTradeData = new TradeData();
		
		Optional<TradeData> optionalTradeData = tradeDataRepository.findById(tradeDataId);
		
		return(optionalTradeData.orElse(noSuchTradeData));
	}
	
	@PostMapping("/by_date")
	public List<TradeData> readTradeData(@RequestBody Calendar tradeDataDate) {

		List<TradeData> tradeData = tradeDataRepository.findAllByTradeDate(tradeDataDate);
		
		return(tradeData);
	}

	@GetMapping("/all")
	public Iterable<TradeData> readAllTradeData() {
		
		return(tradeDataRepository.findAll());
	}

	
	@PutMapping("/update")
	public void updateTradeData(@RequestBody Long tradeDataId, @RequestBody TradeData newTradeData) {
		
		tradeDataRepository.deleteById(tradeDataId);
		
		tradeDataRepository.save(newTradeData);
		
	}
	
	@DeleteMapping("/delete")
	public void deleteTradeData(@RequestBody Long tradeDataId) {
		
		tradeDataRepository.deleteById(tradeDataId);
		
	}
	
	
}
