package com.TradeTracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//CRUD methods for data into/out of database
@Controller
@RequestMapping(path = "/api/v1")
public class CrudTradeDataController {
	
	@Autowired
	private TradeDataRepository tradeDataRepository;

	@PostMapping(path = "/add")
	public void createTradeData(TradeData tradeData) {
		
		tradeDataRepository.save(tradeData);
		
	}
	
	@GetMapping(path = "/get")
	public TradeData readTradeData() {
		
		return(new TradeData());
	}

	@GetMapping(path = "/getAll")
	public Iterable<TradeData> readAllTradeData() {
		
		return(tradeDataRepository.findAll());
	}

	
	@PutMapping(path = "/update")
	public void updateTradeData(TradeData tradeData) {
		
		tradeDataRepository.save(tradeData);
		
	}
	
	@DeleteMapping(path = "/delete")
	public void deleteTradeData(TradeData tradeData) {
		
		tradeDataRepository.deleteById(tradeData.getId());
		
	}
	
	
}
