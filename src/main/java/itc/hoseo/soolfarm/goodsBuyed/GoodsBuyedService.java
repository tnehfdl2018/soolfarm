package itc.hoseo.soolfarm.goodsBuyed;

import itc.hoseo.soolfarm.model.GoodsBuyedVO;

public interface GoodsBuyedService {
	
	
	// 배송완료된 상품 확인
	public GoodsBuyedVO alreadydelivery(int gdNum);
	
	// 배송완료된 상품 삭제
	public GoodsBuyedVO deleteGoodsBuyed(int gdNum);

}
