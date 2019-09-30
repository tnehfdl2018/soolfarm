package itc.hoseo.soolfarm.admin.banner.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import itc.hoseo.soolfarm.admin.banner.BannerService;
import itc.hoseo.soolfarm.model.Banner;

@Service
public class BannerServiceImpl implements BannerService {

	@Autowired
	private BannerDao dao;
	
	@Override
	public List<Banner> getBanners() {
		Banner param = new Banner();
		param.setEndDttm(new Date());
		return dao.getBanners(param);
	}

}
