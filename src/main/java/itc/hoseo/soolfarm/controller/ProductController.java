package itc.hoseo.soolfarm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
	
	@GetMapping("soju")
	public String soju() {
		return "product/soju";
	}
	
	@GetMapping("beer")
	public String beer() {
		return "product/beer";
	}
	
	@GetMapping("traditionalLiquor")
	public String traditionalLiquor() {
		return "product/traditionalLiquor";
	}
	
	@GetMapping("liquor")
	public String liquor() {
		return "product/liquor";
	}
	

}
