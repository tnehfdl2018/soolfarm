package itc.hoseo.soolfarm.member;

import java.util.List;

import javax.servlet.http.HttpSession;

import itc.hoseo.soolfarm.model.MemberVO;

public interface MemberService {
	
	// 회원가입
	public boolean addMember(MemberVO m);
	
	// 회원 수정
	public MemberVO modifyMember(MemberVO m);
	
	// 회원 삭제
	public boolean deleteMember(MemberVO m);
	
	// 중복 회원 확인(맴버가 있으면 True / 없으면 false)
	public boolean isMemberExists(String id);
	
	// 회원정보 조회
	public MemberVO getMember(MemberVO m);

	public List<MemberVO> list(MemberVO memberVO);
	
	//로그인
	public boolean loginCheck(MemberVO vo, HttpSession session);
	
	// 로그인 정보
	public MemberVO viewMember(MemberVO m);


	
	

}
