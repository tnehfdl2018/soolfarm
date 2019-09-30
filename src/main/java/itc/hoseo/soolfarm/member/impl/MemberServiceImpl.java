package itc.hoseo.soolfarm.member.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import itc.hoseo.soolfarm.member.MemberDAO;
import itc.hoseo.soolfarm.member.MemberService;
import itc.hoseo.soolfarm.model.MemberVO;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	MemberDAO memberDAO;
	
	@Override
	public boolean addMember(MemberVO m) {
		return memberDAO.addMember(m)!=0;
	}

	@Override
	public MemberVO modifyMember(MemberVO m) {
//		m.setModifyDate(new Date());
		memberDAO.modifyMember(m);
		return  getMember(m);
	}

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
	
}
