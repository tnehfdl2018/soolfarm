package itc.hoseo.soolfarm.goods;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import itc.hoseo.soolfarm.model.GoodsVO;


@Mapper
public interface GoodsDAO {
	
	// 상품 추가
	public int addGoods(GoodsVO goodsVO);
	
	// 상품 수정
	public int modifyGoods(GoodsVO goodsVO);
	
	// 상품 삭제
	public int deleteGoods(int gdNum);
	
	// 상품 검색
	public List<GoodsVO> list(GoodsVO goodsVO);
	

}
