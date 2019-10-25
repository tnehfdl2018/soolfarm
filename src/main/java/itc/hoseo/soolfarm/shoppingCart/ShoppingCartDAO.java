package itc.hoseo.soolfarm.shoppingCart;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import itc.hoseo.soolfarm.model.ShoppingCartVO;

@Mapper
public interface ShoppingCartDAO {
	
	public int addShoppingCart (ShoppingCartVO sb);
	
	public int modifyShoppingCart(ShoppingCartVO sb);
	
	public int deleteShoppingCart(ShoppingCartVO sb);
	
	public List<ShoppingCartVO> getShoppingCart(ShoppingCartVO sb);

}
