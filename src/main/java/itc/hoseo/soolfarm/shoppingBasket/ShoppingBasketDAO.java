package itc.hoseo.soolfarm.shoppingBasket;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import itc.hoseo.soolfarm.model.ShoppingBasketVO;

@Mapper
public interface ShoppingBasketDAO {
	
	public int addShoppingBasket(ShoppingBasketVO sb);
	
	public int modifyShoppingBasket(ShoppingBasketVO sb);
	
	public int deleteShoppingBasket(ShoppingBasketVO sb);
	
	public List<ShoppingBasketVO> getShoppingBasket(ShoppingBasketVO sb);

}
