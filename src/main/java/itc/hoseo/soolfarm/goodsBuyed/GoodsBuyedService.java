package itc.hoseo.soolfarm.goodsBuyed;

public interface GoodsBuyedService {
	
	
	// 배송완료된 상품 확인
	public GoodsBuyedVO alreadydelivery(int goodsNum);
	
	// 배송완료된 상품 삭제
	public GoodsBuyedVO deleteGoodsBuyed(int goodsNum);

}
