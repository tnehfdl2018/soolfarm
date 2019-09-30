package itc.hoseo.soolfarm.admin.banner.impl;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import itc.hoseo.soolfarm.model.Banner;

@Mapper
public interface BannerDao {
	public List<Banner> getBanners(Banner vo);
}
