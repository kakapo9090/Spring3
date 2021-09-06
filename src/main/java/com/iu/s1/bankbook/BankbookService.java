package com.iu.s1.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iu.s1.util.Pager;

@Service
public class BankbookService {
	
	@Autowired
	private BankbookDAO bankbookDAO;
	
	
	public int setUpdate(BankbookDTO bankbookDTO) {
		return bankbookDAO.setUpdate(bankbookDTO);
	}
	
	
	public int setDelete(Long bookNumber) {
		return bankbookDAO.setDelete(bookNumber);
	}
	
	public int setInsert(BankbookDTO bankbookDTO) {
		return bankbookDAO.setInsert(bankbookDTO);
	}
	
	
	
	
	public List<BankbookDTO> getList(Pager pager){
		System.out.println(pager.getKind());
		System.out.println(pager.getSearch());
		//totalCount 구하기
		Long totalCount = bankbookDAO.getCount(pager);
		pager.makeNum(totalCount); 	//페이지번호를 먼저 찾고
		pager.makeRow();	// 그 다음 행을 찾는다
		return bankbookDAO.getList(pager);
	}
	
	public BankbookDTO getSelect(BankbookDTO bankbookDTO) {
//		System.out.println("service: "+bankbookDTO.getBookNumber());
		return bankbookDAO.getSelect(bankbookDTO);		
	}
	
}
