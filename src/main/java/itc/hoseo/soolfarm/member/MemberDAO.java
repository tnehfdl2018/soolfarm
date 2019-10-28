package itc.hoseo.soolfarm.member;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import itc.hoseo.soolfarm.model.MemberVO;

@Mapper
public interface MemberDAO {
	
	// 회원가입(INSERT ~
	public int addMember(MemberVO m);
	
	// 회원 수정(UPDATE ~
	public int modifyMember(MemberVO m);
	
	// 회원 삭제 (DELTE ~
	public int deleteMember(MemberVO m);
	
	// 중복 회원 확인 (SELECT COUNT(*) FROM MEBER WHERE ID = ${id} 
	public int getMemberCnt(String email);
	
	// 회원정보 조회
	public MemberVO getMember(MemberVO m);
	
	// 로그인
	public MemberVO loginCheck(MemberVO m);
	
	// 로그인 정보
	public MemberVO viewMember(MemberVO m);
	
	//로그아웃
	public MemberVO logout(MemberVO m);
	
	// id 중복 체크
	public int idCheck(String email);
	
	// myPage 정보
	public List<MemberVO> getinfo(MemberVO vo);
}
