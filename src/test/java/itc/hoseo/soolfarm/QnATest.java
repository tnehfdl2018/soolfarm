package itc.hoseo.soolfarm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import itc.hoseo.soolfarm.member.MemberService;
import itc.hoseo.soolfarm.model.GoodsVO;
import itc.hoseo.soolfarm.model.MemberVO;
import itc.hoseo.soolfarm.model.QnABoardVO;
import itc.hoseo.soolfarm.qna.QnABoardDAO;
import itc.hoseo.soolfarm.qna.QnABoardService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QnATest {
	
	@Autowired
	private QnABoardDAO dao;
	
	@Test
	public void listTest() {
		
		assertEquals(3, dao.list(new QnABoardVO()).size());
		
	}
	
	@Test
	public void addQnA() {
		QnABoardVO vo = new QnABoardVO();
		
		vo.setPostSub("first");
		vo.setPostContant("i like you");
		
		dao.addQnA(vo);
		
		assertEquals(4, dao.list(new QnABoardVO()).size());
	}
	
	@Test
	public void modifyQnA() {
		QnABoardVO vo = new QnABoardVO();
		
		vo.setPostSub("test1");
		vo.setPostContant("ddd");
		
		assertNotNull("test1");
	}
	
	@Test
	public void deleteQnA() {
		QnABoardVO vo = new QnABoardVO();
		
		vo.setPostSub("test1");
		dao.deleteQnA(vo);
		
		assertEquals(3, dao.list(new QnABoardVO()).size());
	}
	

}
