package itc.hoseo.soolfarm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import itc.hoseo.soolfarm.goods.GoodsService;
import itc.hoseo.soolfarm.member.MemberService;
import itc.hoseo.soolfarm.model.GoodsVO;
import itc.hoseo.soolfarm.model.MemberVO;

@Controller
public class AdminController {
	@Autowired
	MemberService mService;
	@Autowired
	GoodsService gService;
	
	@GetMapping("adminMain")
	public String adminMain() {
		
		return "admin/adminMain";
	}

	@GetMapping("productRegistration")
	public String productRegistration(GoodsVO vo, ModelMap model) {
		
		model.put("pro", gService.getGoods());
		
		return "admin/productRegistration";
	}
	
	@GetMapping("memberManagement")
	public String memberManagerment(MemberVO vo, ModelMap model) {
		
		model.put("memberList", mService.getMember(vo));
		
		return "admin/memberManagement";
	}
}
