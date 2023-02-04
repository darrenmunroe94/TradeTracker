package com.TradeTracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
@RequestMapping(path="/")
public class TradeTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TradeTrackerApplication.class, args);
	}

}
