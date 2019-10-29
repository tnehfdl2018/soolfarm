package itc.hoseo.soolfarm.admin.Impl;

import org.springframework.beans.factory.annotation.Autowired;

import itc.hoseo.soolfarm.admin.AdminDAO;
import itc.hoseo.soolfarm.admin.AdminService;
import itc.hoseo.soolfarm.model.GoodsVO;
import itc.hoseo.soolfarm.model.MemberVO;

public class AdminServiceImpl implements AdminService{
	
	@Autowired
	AdminDAO dao;

	@Override
	public MemberVO getMemeber(MemberVO vo) {
		// TODO Auto-generated method stub
		return dao.getMemeber(vo);
	}

	@Override
	public GoodsVO getProduct(GoodsVO vo) {
		// TODO Auto-generated method stub
		return dao.getProduct(vo);
	}

}
