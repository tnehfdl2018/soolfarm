package itc.hoseo.soolfarm.add;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import itc.hoseo.soolfarm.model.AddVO;

@Mapper
public interface AddDao {

	public List<AddVO> getAdd(AddVO vo);
}
