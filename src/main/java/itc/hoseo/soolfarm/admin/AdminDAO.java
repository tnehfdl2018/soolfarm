package itc.hoseo.soolfarm.admin;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import itc.hoseo.soolfarm.model.GoodsVO;
import itc.hoseo.soolfarm.model.MemberVO;

@Mapper
public interface AdminDAO {

	public List<MemberVO> getMemberList();
	
	public List<GoodsVO> getProductList();
	
	
}
