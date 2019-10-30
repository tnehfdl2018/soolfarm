package itc.hoseo.soolfarm.goods;

import java.util.List;

import itc.hoseo.soolfarm.model.GoodsVO;

public interface GoodsService {
	
	// 상품 추가
	public int addProduct(GoodsVO vo);
	
	// 상품 수정
	public GoodsVO modifyGoods(int goodsNum);
	
	// 상품 삭제
	public GoodsVO deleteGoods(int goodsNum);
	
	// 상품 조회
	public List<GoodsVO> getGoods();
	
	//상품 상세정보
	public List<GoodsVO> getDetailProduct(int gdNum);
	
	// Index 상품 조회
	public List<GoodsVO> getNewArrival();

}
