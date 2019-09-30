package itc.hoseo.soolfarm.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import itc.hoseo.soolfarm.admin.banner.BannerService;

@Controller
public class MainController {
	@Autowired
	BannerService bannerService;
	
	
	@GetMapping("/")
	public String index(ModelMap model) {
		model.put("banners", bannerService.getBanners());
		
		return "index";
	}
}
