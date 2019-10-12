package itc.hoseo.soolfarm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import itc.hoseo.soolfarm.goods.GoodsService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class ProductController {
	
	@Autowired
	GoodsService service;
	
	@GetMapping("product")
	public String product(ModelMap model) {
		model.put("prod", service.getGoods());
		return "product/product";
	}
	
	@GetMapping("about")
	public String productDetail2(ModelMap model) {
		model.put("prod", service.getGoods());
		return "product/productDetail";
	}
	
	@GetMapping("detail")
	@DateTimeFormat(pattern="YYYY-MM-dd")
	public String productDetail(@RequestParam (value="gdNum") int gdNum,  ModelMap model) {		
		
		model.put("prodDetail", service.getDetailProduct(gdNum));
		
		return "product/productDetail";
	}

}
