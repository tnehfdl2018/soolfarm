package itc.hoseo.soolfarm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import itc.hoseo.soolfarm.banner.BannerService;
import itc.hoseo.soolfarm.goods.GoodsService;

@Controller
public class MainController {
	@Autowired
	BannerService bannerService;
	@Autowired
	GoodsService proService;
	
	
	@GetMapping("/")
	public String index(ModelMap model) {
		model.put("banners", bannerService.getBanners());
		model.put("prod", proService.getNewArrival());
		return "index";
	}	
	
	@GetMapping("product-detail")
	public String categories() {
		return "product-detail";
	}
	
	@GetMapping("mysoolfarm")
	public String single() {
		return "mysoolfarm";
	}
	
	
}
