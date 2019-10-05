package itc.hoseo.soolfarm.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import itc.hoseo.soolfarm.add.AddService;
import itc.hoseo.soolfarm.admin.banner.BannerService;

@Controller
public class MainController {
	@Autowired
	BannerService bannerService;
	@Autowired
	AddService addService;
	
	
	@GetMapping("/")
	public String index(ModelMap model) {
		model.put("banners", bannerService.getBanners());
		model.put("adds", addService.getAdd());
		return "index";
	}
	
	@GetMapping("soju")
	public String soju() {
		return "/soju";
	}
	
	@GetMapping("categories")
	public String categories() {
		return "/categories";
	}
	
	@GetMapping("single")
	public String single() {
		return "/single";
	}
}
