package com.iu.s1.bankbook;

import java.util.List;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/bankbook/*")
public class BankbookController {
	
	@Autowired
	private BankbookService bankbookService;
	
	//pojo? -> (Plain Old Java Object)
	
	//동일한 파라미터가 여러개 넘어올 때 작성
	@RequestMapping("bankbookList")
	public ModelAndView list(ModelAndView mv) {
	
		List<BankbookDTO> ar = bankbookService.getList();
		
		mv.addObject("list", ar);
		mv.setViewName("bankbook/bankbookList");

		return mv;
	}
	
	
	
	@RequestMapping("bankbookSelect")
	public void select(BankbookDTO bankbookDTO, Model model) {
		
		bankbookDTO = bankbookService.getSelect(bankbookDTO);
		model.addAttribute("dtov", bankbookDTO);
		
	}
	
	
	@RequestMapping("bankbookInsert.do")
	public String insert(BankbookDTO bankbookDTO) {
		System.out.println(bankbookDTO.getBookName());
		System.out.println("insert");
		return "redirect:../";
	}
}
