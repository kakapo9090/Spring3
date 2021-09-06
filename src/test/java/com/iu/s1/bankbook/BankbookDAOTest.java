package com.iu.s1.bankbook;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Random;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.s1.MyJunitTest;
import com.iu.s1.util.Pager;

public class BankbookDAOTest extends MyJunitTest{

	@Autowired
	private BankbookDAO bankbookDAO;
	//@Test
	public void setUpdateTest() {
		BankbookDTO bankbookDTO = new BankbookDTO();
		bankbookDTO.setBookNumber(8800L);
		bankbookDTO.setBookName("Update Name");
		bankbookDTO.setBookRate(1.11);
		bankbookDTO.setBookSale(1);
		int result = bankbookDAO.setUpdate(bankbookDTO);
		assertNotEquals(0, result);
	}
	
	
	
	//@Test
	public void setDeleteTest() {
		int result = bankbookDAO.setDelete(11111L);
		assertEquals(1, result);
	}
	
	
	@Test
	public void setInsertTest() throws Exception {
		Random random = new Random();
		for(int i=0;i<200;i++) {
			
		
		
		BankbookDTO bankbookDTO = new BankbookDTO();
		bankbookDTO.setBookName("BookName"+i);
		int rate = random.nextInt(400);
		
		bankbookDTO.setBookRate(rate/100.0);
		bankbookDTO.setBookSale(random.nextInt(2));
		int result = bankbookDAO.setInsert(bankbookDTO);
		
		if(i%10==0) {
			Thread.sleep(500);
		}
		}
		System.out.println("Finish==============================");
	}
	
	
	@Test
	public void getListTest() {
		List<BankbookDTO> ar = bankbookDAO.getList(Pager pager);
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
