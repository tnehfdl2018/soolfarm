package itc.hoseo.soolfarm.goods;

import itc.hoseo.soolfarm.model.GoodsVO;

public interface GoodsService {
	
	// 상품 추가
	public GoodsVO addGoods(GoodsVO goods);
	
	// 상품 수정
	public GoodsVO modifyGoods(int goodsNum);
	
	// 상품 삭제
	public GoodsVO deleteGoods(int goodsNum);
	
	

}
