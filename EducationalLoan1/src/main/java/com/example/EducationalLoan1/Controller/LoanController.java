package com.example.EducationalLoan1.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.EducationalLoan1.Model.LoanApplicationModel;
import com.example.EducationalLoan1.Service.LoanService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class LoanController 
{
	@Autowired
	LoanService lser;
	
	@Tag(name = "Post Method",description = "Post Validation")
	@PostMapping("/post")
	public LoanApplicationModel postData(@RequestBody LoanApplicationModel lm)
	{
		return lser.postDetails(lm);
	}
	
	@Tag(name = "Get Method",description = "Get Validation")
	@GetMapping("/getall")
	public List<LoanApplicationModel> getAllData()
	{
		return lser.getAllDetails();
	}
	
	@Tag(name = "Get by Id Method",description = "Get Validation")
	@GetMapping("/get/{id}")
	public Optional<LoanApplicationModel> getDataById(@PathVariable("id")int id,@RequestBody LoanApplicationModel am)
	{
		return lser.getDetailsById(id);
	}
	
	@Tag(name = "Update Method",description = "Update Validation")
	@PutMapping("/update/{id}")
	public LoanApplicationModel putData(@RequestBody LoanApplicationModel lm)
	{
		return lser.updateDetails(lm);
	}
	
	@Tag(name = "Delete Method",description = "Delete Validation")
	@DeleteMapping("/delete/{id}")
	public String deleteData(int id)
	{
		lser.deleteDetails(id);
		return id+" was deleted successfully";
	}
}
