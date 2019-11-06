package itc.hoseo.soolfarm.account.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import itc.hoseo.soolfarm.account.AccountDAO;
import itc.hoseo.soolfarm.account.AccountService;
import itc.hoseo.soolfarm.model.AccountVO;

@Service
public class AccountServiceImpl implements AccountService{
	
	@Autowired
	private AccountDAO dao;

	
	@Override
	public int addAccount(AccountVO vo) {
		
		return dao.addAccount(vo);
	}
}
