package com.example.consumingrest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	
	@GetMapping("/quote")
	public Value getQuote() {
		Value val=new Value();
		val.setQuote("Really loving Spring Boot, makes stand alone Spring apps easy.");
		val.setId((long)56);
		val.getValue();
		val.setType("Success");
		return val;}
}
	