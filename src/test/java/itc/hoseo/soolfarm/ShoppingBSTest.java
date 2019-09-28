package itc.hoseo.soolfarm;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import itc.hoseo.soolfarm.model.ShoppingBasketVO;
import itc.hoseo.soolfarm.shoppingBasket.ShoppingBasketDAO;
import itc.hoseo.soolfarm.shoppingBasket.ShoppingBasketService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class ShoppingBSTest {
	
	@Autowired
	private ShoppingBasketService shoppingBasketService;
	
	public void addShopBasketTest() {	
		ShoppingBasketVO vo = new ShoppingBasketVO();
		vo.setSbNum(7);
		vo.setSbName("leedail");
		vo.setSbKinds("human");
		vo.setSbPrice("300");
		vo.setSbMu("mom");
		vo.setSbDiscript("roll model is zico");
		vo.setSbStatus("shipping");
		
		shoppingBasketService.addShoppingBasket(vo);

	}
	
	public void modifyBasketTest() {
		ShoppingBasketVO vo = new ShoppingBasketVO();
		vo.setSbNum(2);
		vo.setSbPrice("20원");
		
		shoppingBasketService.modifyShoppingBasket(vo);
	}
	
	public void deleteBasketTest() {
		ShoppingBasketVO vo = new ShoppingBasketVO();
		vo.setSbNum(4);

		shoppingBasketService.deleteShoppingBasket(vo);
	}
	
	
	public void getBasketTest() {
		ShoppingBasketVO vo = new ShoppingBasketVO();
		vo.setSbName("leedail");
		List<ShoppingBasketVO> list = shoppingBasketService.getShoppingBasket(vo);
		assertEquals(1, list.size());
		assertEquals("300", list.get(0).getSbPrice());
	}
	
	@Test
	public void tests() {
		addShopBasketTest();
		modifyBasketTest();
		deleteBasketTest();
		getBasketTest();
		//shoppingBasketService.
	}
	
	

}
