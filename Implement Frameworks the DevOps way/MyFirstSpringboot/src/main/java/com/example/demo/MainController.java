package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MainController {
	//@RequestMapping(value="Hello",method="get")
	@GetMapping("/Hello")
	public String message() {
		return "Heloo all";
	}
	@GetMapping("/product/{id}")
	public String getProduct(@PathVariable("id") String id) {
		if(id.equals("1"))
			throw new ProductException();
		else
			return "Product found";
	}


}
