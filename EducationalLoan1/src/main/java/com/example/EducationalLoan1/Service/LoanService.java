package com.example.EducationalLoan1.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EducationalLoan1.Model.LoanApplicationModel;
import com.example.EducationalLoan1.Repository.Loanrepo;

@Service
public class LoanService 
{
	@Autowired
	Loanrepo lrepo;
	
	public LoanApplicationModel postDetails(LoanApplicationModel lm)
	{
		return lrepo.save(lm);
	}
	
	public List<LoanApplicationModel> getAllDetails()
	{
		return lrepo.findAll();
	}
	
	public Optional<LoanApplicationModel> getDetailsById(int id)
	{
		return lrepo.findById(id);
	}
	
	public LoanApplicationModel updateDetails(LoanApplicationModel lm)
	{
		return lrepo.saveAndFlush(lm);
	}
	
	public void deleteDetails(int id)
	{
		lrepo.deleteById(id);
	}
}
