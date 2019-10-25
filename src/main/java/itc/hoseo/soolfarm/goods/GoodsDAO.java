package itc.hoseo.soolfarm.goods;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import itc.hoseo.soolfarm.model.GoodsVO;


@Mapper
public interface GoodsDAO {
	
	// 상품 추가
	public int addGoods(GoodsVO goodsVO);
	
	// 상품 수정
	public int modifyGoods(int gdNum);
	
	// 상품 삭제
	public int deleteGoods(int gdNum);
	
	// 상품 검색
	public List<GoodsVO> getGoods(GoodsVO vo);
	
	//상품 상세정보
	public List<GoodsVO> getDetailProduct(int gdNum);
	
	// Index 상품 조회
	public List<GoodsVO> getNewArrival();

}
