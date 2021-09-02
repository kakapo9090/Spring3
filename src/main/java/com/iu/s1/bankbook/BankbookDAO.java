package com.iu.s1.bankbook;




import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class BankbookDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.iu.s1.bankbook.BankbookDAO.";
	
	public int setDelete(Long bookNumber) {
		return sqlSession.delete(NAMESPACE+"setDelete", bookNumber);
	}
	
	
	public int setInsert(BankbookDTO bankbookDTO) {
		return sqlSession.insert(NAMESPACE+"setInsert", bankbookDTO);
	}
	
	public List<BankbookDTO> getList(){
		return sqlSession.selectList(NAMESPACE+"getList");
	}
	
	public BankbookDTO getSelect(BankbookDTO bankbookDTO) {
		System.out.println("DAO : "+bankbookDTO.getBookNumber());
		return sqlSession.selectOne(NAMESPACE+"getSelect", bankbookDTO);

	}
	
	
	
}
