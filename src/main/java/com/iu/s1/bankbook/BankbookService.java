package com.iu.s1.bankbook;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iu.s1.util.DBConnector;


public class BankbookService {
	
	private BankbookDAO bankbookDAO;
	

	
	
	
	
	public void setBankbookDAO(BankbookDAO bankbookDAO) {
		this.bankbookDAO = bankbookDAO;
	}






	public ArrayList<BankbookDTO> getList() {
		ArrayList<BankbookDTO> ar = bankbookDAO.getList();
		return ar;
	}
}
