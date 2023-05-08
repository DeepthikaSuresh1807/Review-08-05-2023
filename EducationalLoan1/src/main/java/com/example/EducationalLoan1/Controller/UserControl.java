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

import com.example.EducationalLoan1.Model.userModel;
import com.example.EducationalLoan1.Service.UserService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class UserControl 
{
	@Autowired
	UserService userv;
	
	@Tag(name = "Post Method",description = "Post Validation")
	@PostMapping("/postU")
	public userModel postDetails(@RequestBody userModel um)
	{
		return userv.postData(um);
	}
	
	@Tag(name = "Get Method",description = "Get Validation")
	@GetMapping("/getallU")
	public List<userModel> getAllDetails()
	{
		return userv.getAllData();
	}
	
	@Tag(name = "Get by Id Method",description = "Get Validation")
	@GetMapping("/getU/{id}")
	public Optional<userModel> getDetailsById(@PathVariable("id")int id,@RequestBody userModel am)
	{
		return userv.getDataById(id);
	}
	
	@Tag(name = "Update Method",description = "Update Validation")
	@PutMapping("/updateU/{id}")
	public userModel putDetails(@RequestBody userModel um)
	{
		return userv.updateData(um);
	}
	
	@Tag(name = "Delete Method",description = "Delete Validation")
	@DeleteMapping("/deleteU/{id}")
	public String deleteDetails(int id)
	{
		userv.deleteData(id);
		return id+" was deleted successfully";
	}
}
