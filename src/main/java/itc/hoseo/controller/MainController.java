package itc.hoseo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	
	@RequestMapping("/index")
	public String index() {
		
		return "index";
	}
	
	@RequestMapping("/soju")
	public String soju() {
		
		return "goods/soju";
	}
	
	
	@RequestMapping(value = "/join")
	public String join() {
		System.out.println("id");
		
		return "join/join";
	}
	
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String join(@RequestParam String id, @RequestParam String pw, @RequestParam String name, @RequestParam String tel, @RequestParam String email, @RequestParam String address) {
		System.out.println(id);
		System.out.println(pw);
		System.out.println(name);
		System.out.println(tel);
		System.out.println(email);
		System.out.println(address);
		return "index";
	}

}
