package itc.hoseo.soolfarm.member.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import itc.hoseo.soolfarm.member.MemberDAO;
import itc.hoseo.soolfarm.model.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO{
	@Autowired
	SqlSession sqlSession;

	@Override
	public int addMember(MemberVO m) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modifyMember(MemberVO m) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteMember(MemberVO m) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMemberCnt(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public MemberVO getMember(MemberVO m) {
		// TODO Auto-generated method stub
		return null;
	}

	// 로그인 확인
	@Override
	public boolean loginCheck(MemberVO m) {
		String name = sqlSession.selectOne("MemberVO.loginCheck", m);
		return (name == null) ? false : true;
	}

	// 로그인 정보
	@Override
	public MemberVO viewMember(MemberVO m) {
		return sqlSession.selectOne("MemberVo.viewMember", m);
	}
	
	
	

}
