package itc.hoseo.soolfarm.member.impl;

import java.util.List;

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

	// 로그인
	@Override
	public MemberVO loginCheck(MemberVO vo) {
		
		if (memberDAO.loginCheck(vo)!=null) {  // true일 경우 세션 등록
			vo = memberDAO.loginCheck(vo);
			return vo;
		}
		return null;
	}
	
	// 로그인 정보
	@Override
	public MemberVO viewMember(MemberVO vo) {
		
		return memberDAO.viewMember(vo);
	}

	// 로그 아웃
	@Override
	public MemberVO logout(MemberVO vo) {
		
		return memberDAO.logout(vo);
	}

	// id 중복 검사
	@Override
	public int idCheck(String email) {
		
		return memberDAO.idCheck(email);
	}

	
	// myPage 정보
	@Override
	public List<MemberVO> getinfo(MemberVO vo) {
		
		return memberDAO.getinfo(vo);
	}

	@Override
	public MemberVO getMember(MemberVO m) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
