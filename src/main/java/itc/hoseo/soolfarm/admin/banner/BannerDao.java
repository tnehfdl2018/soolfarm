package itc.hoseo.soolfarm.admin.banner;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import itc.hoseo.soolfarm.model.BannerVO;

@Mapper
public interface BannerDao {
	public List<BannerVO> getBanners(BannerVO vo);
}
