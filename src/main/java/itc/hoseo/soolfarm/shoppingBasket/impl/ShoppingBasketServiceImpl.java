package itc.hoseo.soolfarm.shoppingBasket.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import itc.hoseo.soolfarm.model.ShoppingBasketVO;
import itc.hoseo.soolfarm.shoppingBasket.ShoppingBasketDAO;
import itc.hoseo.soolfarm.shoppingBasket.ShoppingBasketService;

@Service
public class ShoppingBasketServiceImpl implements ShoppingBasketService{

	@Autowired
	private ShoppingBasketDAO dao;
	
	@Override
	public boolean addShoppingBasket(ShoppingBasketVO sb) {		
		return dao.addShoppingBasket(sb) > 0 ? true : false;
	}
	
	@Override
	public boolean modifyShoppingBasket(ShoppingBasketVO sb) {
		return dao.modifyShoppingBasket(sb) > 0 ? true : false;
	}

	@Override
	public boolean deleteShoppingBasket(ShoppingBasketVO sb) {
		return dao.deleteShoppingBasket(sb) > 0 ? true : false;
	}

	@Override
	public List<ShoppingBasketVO> getShoppingBasket(ShoppingBasketVO sb) {
		return dao.getShoppingBasket(sb);
	}

	

}
