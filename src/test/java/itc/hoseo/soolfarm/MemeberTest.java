package itc.hoseo.soolfarm;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import itc.hoseo.soolfarm.member.MemberDAO;
import itc.hoseo.soolfarm.member.MemberService;
import itc.hoseo.soolfarm.model.MemberVO;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MemeberTest {
	
	
	@Autowired
	private MemberService memberService;
	
	@Test
	public void addMemberTest() {
		MemberVO m = new MemberVO();

		m.setId("444");
		m.setPw("444");
		memberService.addMember(m);
		
		assertEquals(true, memberService.isMemberExists("444"));
		
	}
	
	@Test
	public void modifyMemberTest() {
		MemberVO m = new MemberVO();
		
		m.setId("222");
		m.setPw("555");
		memberService.modifyMember(m);
		
		assertEquals(true, memberService.isMemberExists("222"));
		
	}
	
	@Test
	public void deleteMemberTest() {
		MemberVO m = new MemberVO();
		
		m.setId("222");
		memberService.deleteMember(m);
		
		assertEquals(null, memberService.getMember(m));
	}
	
	@Test
	public void getMember() {
		
		assertEquals(null, memberService.list(new MemberVO()));
	}

}
