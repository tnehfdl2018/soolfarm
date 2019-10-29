package itc.hoseo.soolfarm.admin;

import java.util.List;

import itc.hoseo.soolfarm.model.GoodsVO;
import itc.hoseo.soolfarm.model.MemberVO;

public interface AdminService {
	
	public List<MemberVO> getMemberList();
	
	public List<GoodsVO> getProductList();

}
