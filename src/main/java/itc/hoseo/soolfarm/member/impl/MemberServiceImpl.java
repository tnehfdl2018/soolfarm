package itc.hoseo.soolfarm.member.impl;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import itc.hoseo.soolfarm.member.MemberDAO;
import itc.hoseo.soolfarm.member.MemberService;
import itc.hoseo.soolfarm.model.MemberVO;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	MemberDAO memberDAO;
	
	Logger log = LoggerFactory.getLogger(MemberServiceImpl.class);
	
	// 회원가입
	@Override
	public boolean addMember(MemberVO m) {
		return memberDAO.addMember(m)!=0;
	}

	// 회원 수정
	@Override
	public MemberVO modifyMember(MemberVO m) {
//		m.setModifyDate(new Date());
		memberDAO.modifyMember(m);
		return  getMember(m);
	}

	// 회원 삭제
	@Override
	public boolean deleteMember(MemberVO m) {
		memberDAO.deleteMember(m);
		return false;
	}

	@Override
	public boolean isMemberExists(String id) {
		// TODO Auto-generated method stub
		return memberDAO.getMemberCnt(id) > 0 ? true : false;
	}

	@Override
	public MemberVO getMember(MemberVO m) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<MemberVO> list(MemberVO memberVO) {
		return null;
	}

	@Override
	public boolean loginCheck(MemberVO vo, HttpSession session) {
		boolean result = memberDAO.loginCheck(vo);
		
		if (result) {  // true일 경우 세션 등록
			MemberVO vo2 = viewMember(vo);
			// 세션에 변수 등록
			session.setAttribute("email", vo2.getEmail());
			session.setAttribute("name", vo2.getName());
			
		}
		return result;
	}
	
	// 로그인 정보
	@Override
	public MemberVO viewMember(MemberVO vo) {
		
		return memberDAO.viewMember(vo);
	}
	
}
