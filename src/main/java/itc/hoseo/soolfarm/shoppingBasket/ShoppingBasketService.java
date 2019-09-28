package itc.hoseo.soolfarm.shoppingBasket;

import java.util.List;

import itc.hoseo.soolfarm.model.ShoppingBasketVO;

public interface ShoppingBasketService {
	
	// 장바구니 추가
	public boolean addShoppingBasket(ShoppingBasketVO sb);
	
	// 장바구니 수정
	public boolean modifyShoppingBasket(ShoppingBasketVO sb);
	
	// 장바구니 삭제
	public boolean deleteShoppingBasket(ShoppingBasketVO sb);
	
	// 장바구니 보여주기
	public List<ShoppingBasketVO> getShoppingBasket(ShoppingBasketVO sb);
	

}
