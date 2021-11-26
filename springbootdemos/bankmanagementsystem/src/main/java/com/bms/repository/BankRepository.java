package com.bms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bms.model.Bank;
@Repository
public interface BankRepository extends JpaRepository<Bank, Integer>{
	// abstract method 23 save method of the abstract method
	// these abstract methods got implmented inside SimpleJpaRepository
	
	List<Bank> findByBankName(String bName); 
	List<Bank> findByBranchName(String brName);
	Bank findByBranchNameAndBankName(String brName,String bName);
	
	
	
//	@Query("select b from Bank b where b.bankName=?1") // JPQL - entity name fields
//	public List<Bank> findByBankName(String bName); // generate a custom query
//	@Query("select b from Bank b where b.branchName=?1")
//	public List<Bank> findByBranchName(String brName);// generate a custom query
//	@Query("select b from Bank b where b.branchName=?1 and b.bankName=?2")
//	public Bank findByBranchNameAndBankName(String brName,String bName);
	
	
	
	
//	public List<Bank> findByBankName(String bName); // generate a custom query
//	// select * from Bank where bankName=?1
//	public List<Bank> findByBranchName(String brName);// generate a custom query
//	// select * from Bank where branchName=?1;
//	public List<Bank> findByBranchNameAndBankName(String brName,String bName);
//	// select * from Bank where branchName=?1 and bankName=;
}
