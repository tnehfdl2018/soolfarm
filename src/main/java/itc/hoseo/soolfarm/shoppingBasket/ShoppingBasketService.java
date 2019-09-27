package itc.hoseo.soolfarm.shoppingBasket;

public interface ShoppingBasketService {
	
	// 장바구니 추가
	public ShoppingBasket addshopbasket(ShoppingBasket sb);
	
	// 장바구니 삭제
	public ShoppingBasketVO deleteshopbasket(int goodsNum);
	

}
