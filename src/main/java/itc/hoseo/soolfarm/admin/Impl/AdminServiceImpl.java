package itc.hoseo.soolfarm.admin.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import itc.hoseo.soolfarm.admin.AdminDAO;
import itc.hoseo.soolfarm.admin.AdminService;
import itc.hoseo.soolfarm.model.GoodsVO;
import itc.hoseo.soolfarm.model.MemberVO;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	AdminDAO dao;

	@Override
	public List<MemberVO> getMemberList() {
		// TODO Auto-generated method stub
		return dao.getMemberList();
	}

	@Override
	public List<GoodsVO> getProductList() {
		// TODO Auto-generated method stub
		return dao.getProductList();
	}

	

	

}
