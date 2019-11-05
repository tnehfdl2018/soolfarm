package itc.hoseo.soolfarm.member;

import java.util.List;
import java.util.Map;

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
	
	//로그인
	public MemberVO loginCheck(MemberVO vo);
	
	// 로그인 정보
	public MemberVO viewMember(MemberVO m);
	
	//로그아웃
	public MemberVO logout(MemberVO m);
	
	// ID중복 체크
	public int idcheck(String email);
	
	// myPage 정보
	public List<MemberVO> getinfo(MemberVO vo);

}
