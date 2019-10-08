package itc.hoseo.soolfarm.banner.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import itc.hoseo.soolfarm.banner.BannerDAO;
import itc.hoseo.soolfarm.banner.BannerService;
import itc.hoseo.soolfarm.model.BannerVO;

@Service
public class BannerServiceImpl implements BannerService {

	@Autowired
	private BannerDAO dao;
	
	@Override
	public List<BannerVO> getBanners() {
		BannerVO param = new BannerVO();
		param.setEndDttm(new Date());
		return dao.getBanners(param);
	}

}
