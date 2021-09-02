package com.iu.s1.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankbookService {
	
	@Autowired
	private BankbookDAO bankbookDAO;
	
	public int setInsert(BankbookDTO bankbookDTO) {
		return bankbookDAO.setInsert(bankbookDTO);
	}
	
	
	public List<BankbookDTO> getList(){
		return bankbookDAO.getList();
	}
	
	public BankbookDTO getSelect(BankbookDTO bankbookDTO) {
		return bankbookDAO.getSelect(bankbookDTO);		
	}
	
}
