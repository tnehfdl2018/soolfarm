package itc.hoseo.soolfarm.add;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import itc.hoseo.soolfarm.model.AddVO;

@Mapper
public interface AddDAO {

	public List<AddVO> getAdd(AddVO vo);
}
