package itc.hoseo.soolfarm.account;

import org.apache.ibatis.annotations.Mapper;

import itc.hoseo.soolfarm.model.AccountVO;

@Mapper
public interface AccountDAO {
	
	// 결제페이지로 이동
		public int addAccount (AccountVO vo);

}
