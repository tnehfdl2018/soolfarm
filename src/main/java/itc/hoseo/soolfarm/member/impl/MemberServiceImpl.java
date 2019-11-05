package itc.hoseo.soolfarm.member.impl;

import java.util.List;
import java.util.Map;

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
	MemberDAO dao;
	
	Logger log = LoggerFactory.getLogger(MemberServiceImpl.class);
	
	// 회원가입
	@Override
	public boolean addMember(MemberVO m) {
		return dao.addMember(m)!=0;
	}

	// 회원 수정
	@Override
	public MemberVO modifyMember(MemberVO m) {
//		m.setModifyDate(new Date());
		dao.modifyMember(m);
		return  getMember(m);
	}

	// 회원 삭제
	@Override
	public boolean deleteMember(MemberVO m) {
		dao.deleteMember(m);
		return false;
	}

	@Override
	public boolean isMemberExists(String id) {
		// TODO Auto-generated method stub
		return dao.getMemberCnt(id) > 0 ? true : false;
	}

	// 로그인
	@Override
	public MemberVO loginCheck(MemberVO vo) {
		
		if (dao.loginCheck(vo)!=null) {  // true일 경우 세션 등록
			vo = dao.loginCheck(vo);
			return vo;
		}
		return null;
	}
	
	// 로그인 정보
	@Override
	public MemberVO viewMember(MemberVO vo) {
		
		return dao.viewMember(vo);
	}

	// 로그 아웃
	@Override
	public MemberVO logout(MemberVO vo) {
		
		return dao.logout(vo);
	}

	// id 중복 검사
	@Override
	public int idcheck(String email) {
		
		return dao.idcheck(email);
	}

	
	// myPage 정보
	@Override
	public List<MemberVO> getinfo(MemberVO vo) {
		
		return dao.getinfo(vo);
	}

	@Override
	public MemberVO getMember(MemberVO m) {
		// TODO Auto-generated method stub
		return null;
	}

	
	

	
	
}
