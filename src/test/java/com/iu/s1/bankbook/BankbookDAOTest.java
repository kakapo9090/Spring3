package com.iu.s1.bankbook;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.s1.MyJunitTest;

public class BankbookDAOTest extends MyJunitTest{

	@Autowired
	private BankbookDAO bankbookDAO;
	
	@Test
	public void setDeleteTest() {
		int result = bankbookDAO.setDelete(52L);
		assertEquals(1, result);
	}
	
	
	@Test
	public void setInsertTest() {
		BankbookDTO bankbookDTO = new BankbookDTO();
		bankbookDTO.setBookName("Spring");
		bankbookDTO.setBookRate(3.35);
		bankbookDTO.setBookSale(1);
		int result = bankbookDAO.setInsert(bankbookDTO);
		assertEquals(1, result);
	}
	
	
	//@Test
	public void getListTest() {
		List<BankbookDTO> ar = bankbookDAO.getList();
		assertNotEquals(0, ar.size());
	}
	
	
	//@Test
	public void getSelectTest() {
		BankbookDTO bankbookDTO = new BankbookDTO();
		bankbookDTO.setBookNumber(7);
		bankbookDTO = bankbookDAO.getSelect(bankbookDTO);
		//System.out.println(bankbookDTO.getBookName());
		assertNotNull(bankbookDTO);
	}
	
	
	
	
}
