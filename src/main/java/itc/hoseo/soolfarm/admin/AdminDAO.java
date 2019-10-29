package itc.hoseo.soolfarm.admin;

import org.apache.ibatis.annotations.Mapper;

import itc.hoseo.soolfarm.model.GoodsVO;
import itc.hoseo.soolfarm.model.MemberVO;

@Mapper
public interface AdminDAO {

	public MemberVO getMemeber(MemberVO vo);
	
	public GoodsVO getProduct(GoodsVO vo);
}
