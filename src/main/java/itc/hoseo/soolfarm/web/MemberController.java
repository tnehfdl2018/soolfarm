package itc.hoseo.soolfarm.web;

import java.security.Timestamp;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import itc.hoseo.soolfarm.admin.banner.BannerService;
import itc.hoseo.soolfarm.member.MemberService;
import itc.hoseo.soolfarm.model.MemberVO;

@Controller
public class MemberController {
	@Autowired
	MemberService service;
	
	
	
	@GetMapping("/login")
	public String login() {
		return "/login";
	}
	
	@GetMapping("/goJoin")
	public String join() {
		return "/join";
	}
	
	@PostMapping("/joinSubmit")
	public String join(MemberVO vo) {
		vo.setJoinDate(new Date());
		System.out.println(vo.getJoinDate().toString());
		if(service.addMember(vo)) {
			return "redirect:/";
		}
		return "/goJoin";
	}

}
