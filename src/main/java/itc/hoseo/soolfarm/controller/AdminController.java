package itc.hoseo.soolfarm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import itc.hoseo.soolfarm.admin.AdminService;
import itc.hoseo.soolfarm.goods.GoodsService;
import itc.hoseo.soolfarm.member.MemberService;
import itc.hoseo.soolfarm.model.GoodsVO;
import itc.hoseo.soolfarm.model.MemberVO;

@Controller
public class AdminController {

	@Autowired
	AdminService aservice;
	
	@GetMapping("adminMain")
	public String adminMain() {
		
		return "admin/adminMain";
	}

	@GetMapping("productRegistration")
	public String productRegistration(ModelMap model) {
		
		model.put("pro", aservice.getProductList());
		
		return "admin/productRegistration";
	}
	
	@GetMapping("memberManagement")
	public String memberManagerment(ModelMap model) {
		
		model.put("memberList", aservice.getMemberList());
		
		return "admin/memberManagement";
	}
	
	
}
