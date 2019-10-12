package itc.hoseo.soolfarm.goods.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import itc.hoseo.soolfarm.goods.GoodsDAO;
import itc.hoseo.soolfarm.goods.GoodsService;
import itc.hoseo.soolfarm.model.GoodsVO;

@Service
public class GoodsServiceImpl implements GoodsService{
	
	@Autowired
	private GoodsDAO dao;

	// 상품 추가
	@Override
	public GoodsVO addGoods(GoodsVO goodsVO) {
		// TODO Auto-generated method stub
		return null;
	}

	// 상품 수정
	@Override
	public GoodsVO modifyGoods(int goodsNum) {
		// TODO Auto-generated method stub
		return null;
	}

	// 상품 삭제
	@Override
	public GoodsVO deleteGoods(int goodsNum) {
		// TODO Auto-generated method stub
		return null;
	}

	// 상품 조회
	@Override
	public List<GoodsVO> getGoods() {
		GoodsVO vo = new GoodsVO();
		vo.setGdStartDay(new Date());
		return dao.getGoods(vo);
	}

	// 상세 페이지
	@Override
	public List<GoodsVO> getDetailProduct(int gdNum) {		
		
		return dao.getDetailProduct(gdNum);
	}

	

}
