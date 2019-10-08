package itc.hoseo.soolfarm.banner;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import itc.hoseo.soolfarm.model.BannerVO;

@Mapper
public interface BannerDAO {
	public List<BannerVO> getBanners(BannerVO vo);
}
