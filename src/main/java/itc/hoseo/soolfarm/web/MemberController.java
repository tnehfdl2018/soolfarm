package itc.hoseo.soolfarm.web;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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
		if(service.loginCheck(vo)!=null) {  // 로그인 성공시 메시지로 success전달 및 index페이지로 이동
			MemberVO result = service.loginCheck(vo);
			session.setAttribute("email", result.getEmail());
			session.setAttribute("name", result.getName());
			return "redirect:/";
		}else {  // 로그인 실패시 alert 및 로그인 페이지 유지
			
			return "/login";
		}	
	}
	
	// 로그아웃
	@GetMapping("/logout")
	public String logout(@ModelAttribute MemberVO vo, HttpSession session) {
		session.removeAttribute("email");
		
		return "redirect:/";
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
