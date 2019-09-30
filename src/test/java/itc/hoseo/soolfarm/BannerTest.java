package itc.hoseo.soolfarm;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import itc.hoseo.soolfarm.admin.banner.BannerService;
import itc.hoseo.soolfarm.model.ShoppingBasketVO;
import itc.hoseo.soolfarm.shoppingBasket.ShoppingBasketDAO;
import itc.hoseo.soolfarm.shoppingBasket.ShoppingBasketService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class BannerTest {
	
	@Autowired
	private BannerService service;
	
	
	@Test
	public void test() {
		assertEquals(1, service.getBanners().size());
	}
	
	

}
