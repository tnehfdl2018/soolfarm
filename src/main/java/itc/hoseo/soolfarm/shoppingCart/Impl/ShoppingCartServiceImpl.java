package itc.hoseo.soolfarm.shoppingCart.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import itc.hoseo.soolfarm.model.ShoppingCartVO;
import itc.hoseo.soolfarm.shoppingCart.ShoppingCartDAO;
import itc.hoseo.soolfarm.shoppingCart.ShoppingCartService;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService{

	@Autowired
	private ShoppingCartDAO dao;
	
	@Override
	public boolean addShoppingCart(ShoppingCartVO sb) {		
		return dao.addShoppingCart(sb) > 0 ? true : false;
	}
	
	@Override
	public boolean modifyShoppingCart(ShoppingCartVO sb) {
		return dao.modifyShoppingCart(sb) > 0 ? true : false;
	}

	@Override
	public boolean deleteShoppingCart(ShoppingCartVO sb) {
		return dao.deleteShoppingCart(sb) > 0 ? true : false;
	}

	@Override
	public List<ShoppingCartVO> getShoppingCart(ShoppingCartVO sb) {
		return dao.getShoppingCart(sb);
	}

	

}
