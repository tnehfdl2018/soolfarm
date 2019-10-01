package itc.hoseo.soolfarm.web;

import java.security.Timestamp;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import itc.hoseo.soolfarm.admin.banner.BannerService;
import itc.hoseo.soolfarm.member.MemberService;
import itc.hoseo.soolfarm.model.MemberVO;

@Controller
public class MemberController {
	@Autowired
	MemberService service;
	
	
	// 로그인 페이지로 이동
	@GetMapping("/login")
	public String login() {
		return "/login";
	}
	
	// 로그인 처리
	@PostMapping("/loginSubmit")
	public String login(@ModelAttribute MemberVO vo, HttpSession session) {
		boolean result = service.loginCheck(vo, session);
		ModelAndView view = new ModelAndView();
		if(result == true) {  // 로그인 성공시 메시지로 success전달 및 index페이지로 이동
			view.setViewName("/");
			view.addObject("msg", "seuccess");
			System.out.println("로그인 성공");
		}else {  // 로그인 실패시 메시지로 fail전달 및 로그인 페이지 유지
			view.setViewName("/login");
			view.addObject("msg", "fail");
			System.out.println("로그인 실패");
		}		
		return "view";
	}
	
	// 회원가입 페이지로 이동
	@GetMapping("/goJoin")
	public String join() {
		return "/join";
	}
	
	// 회원가입 폼 작성후 데이터베이스에 전달을 위한 메소드
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
