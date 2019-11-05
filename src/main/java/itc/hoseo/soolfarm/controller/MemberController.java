package itc.hoseo.soolfarm.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.activation.CommandMap;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import itc.hoseo.soolfarm.member.MemberService;
import itc.hoseo.soolfarm.model.MemberVO;

@Controller
public class MemberController {
	@Autowired
	MemberService service;
	
	
	// 로그인 페이지로 이동
	@GetMapping("/login")
	public String login() {
		return "member/login";
	}
	
	// 로그인 처리
	@PostMapping("/loginSubmit")
	public String login(@ModelAttribute MemberVO vo, HttpSession session) {
		
		// 로그인 성공시 메시지로 success전달 및 index페이지로 이동
		if(service.loginCheck(vo)!=null) {  
			MemberVO result = service.loginCheck(vo);
			session.setAttribute("email", result.getEmail());
			session.setAttribute("name", result.getName());
			
			if (result.getEmail().equals("admin")) {
				return "admin/adminMain";
			}
			return "redirect:/main";
		}else {  // 로그인 실패시 로그인 페이지 유지
			
			return "member/login";
		}	
	}
	
	// 로그아웃
	@GetMapping("/logout")
	public String logout(@ModelAttribute MemberVO vo, HttpSession session) {
		session.removeAttribute("email");
		
		return "redirect:/main";
	}
	
	// 회원가입 페이지로 이동
	@GetMapping("/goJoin")
	public String join() {
		return "member/join";
	}
	
	// 회원가입 폼 작성후 데이터베이스에 전달을 위한 메소드
	@PostMapping("/joinSubmit")
	public String join(MemberVO vo) {
		vo.setJoinDate(new Date());
		
		System.out.println(vo);
		if(service.addMember(vo)) {
			return "redirect:/main";
		}
		return "member/goJoin";
	}
	
		
	@PostMapping("/idcheck")
	@ResponseBody
	public Map<Object, Object> idCheck(@RequestBody String email) {
		System.out.println(email);
		int count = 0;
		Map<Object, Object> map = new HashMap<Object, Object>();
		
		count = service.idcheck(email);
		map.put("cnt", count);
		System.out.println("sdddfdfwedbrw");
		System.out.println(map);
		return map;
	}
	
	// myPage 이동
	@GetMapping("myPage")
	public String myPage(@ModelAttribute MemberVO vo, HttpSession session, ModelMap model) {
		String id = (String) session.getAttribute("email");
		vo.setEmail(id);
		model.put("reset", service.getinfo(vo));
		return "member/myPage";
	}

}
