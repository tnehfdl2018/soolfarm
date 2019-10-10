package itc.hoseo.soolfarm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import itc.hoseo.soolfarm.goods.GoodsService;

@Controller
public class ProductController {
	
	@Autowired
	GoodsService service;
	
	@GetMapping("soju")
	public String soju(ModelMap model) {
		model.put("prod", service.getGoods());
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
