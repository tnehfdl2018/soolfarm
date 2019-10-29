package itc.hoseo.soolfarm.admin;

import org.springframework.stereotype.Service;

import itc.hoseo.soolfarm.model.GoodsVO;
import itc.hoseo.soolfarm.model.MemberVO;

@Service
public interface AdminService {
	
	public MemberVO getMemeber(MemberVO vo);
	
	public GoodsVO getProduct(GoodsVO vo);

}
