package itc.hoseo.soolfarm.shoppingCart;

import java.util.List;

import itc.hoseo.soolfarm.model.ShoppingCartVO;

public interface ShoppingCartService {
	
	// 장바구니 추가
	public boolean addShoppingCart(ShoppingCartVO sb);
	
	// 장바구니 수정
	public boolean modifyShoppingCart(ShoppingCartVO sb);
	
	// 장바구니 삭제
	public boolean deleteShoppingCart(ShoppingCartVO sb);
	
	// 장바구니 보여주기
	public List<ShoppingCartVO> getShoppingCart(ShoppingCartVO sb);
	

}
