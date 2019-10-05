package itc.hoseo.soolfarm.add.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import itc.hoseo.soolfarm.add.AddDao;
import itc.hoseo.soolfarm.add.AddService;
import itc.hoseo.soolfarm.model.AddVO;

@Service
public class AddServiceImpl implements AddService{
	
	@Autowired
	private AddDao dao;

	@Override
	public List<AddVO> getAdd() {
		AddVO param = new AddVO();
		return dao.getAdd(param);
	}
	
	
	

}
