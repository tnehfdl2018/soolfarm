package itc.hoseo.soolfarm;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import itc.hoseo.soolfarm.goods.GoodsDAO;
import itc.hoseo.soolfarm.model.GoodsVO;


@RunWith(SpringRunner.class)
@SpringBootTest
public class GoodsTest {
	
	@Autowired
	private GoodsDAO goodsDAO;
	
	@Test
	public void addGoodsTest() {
		GoodsVO vo = new GoodsVO();
		
		vo.setGdNum(3);
		vo.setGdName("beer");
		
		goodsDAO.addGoods(vo);
		
		assertEquals(2, goodsDAO.list(new GoodsVO()).size());
		
	}
	
	@Test
	public void modifyGoodsTest() {
		GoodsVO vo = new GoodsVO();
		
		vo.setGdNum(2);
		vo.setGdName("vodka");
		
		goodsDAO.modifyGoods(vo);
		
		assertEquals(1, goodsDAO.list(new GoodsVO()).size());
	}
	
	@Test
	public void deleteGoodsTest() {
		GoodsVO vo = new GoodsVO();
	
		goodsDAO.deleteGoods(1);
		
		assertEquals(1, goodsDAO.list(new GoodsVO()).size());	
	}
	
	@Test
	public void listGoods() {
		
		assertEquals(2, goodsDAO.list(new GoodsVO()));
	}
	

}
