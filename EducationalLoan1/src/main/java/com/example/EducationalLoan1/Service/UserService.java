package com.example.EducationalLoan1.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EducationalLoan1.Model.userModel;
import com.example.EducationalLoan1.Repository.UserRepo;

@Service
public class UserService
{
	@Autowired
	UserRepo urepo;
	
	public userModel postData(userModel um)
	{
		return urepo.save(um);
	}
	
	public List<userModel> getAllData()
	{
		return urepo.findAll();
	}
	
	public Optional<userModel> getDataById(int id)
	{
		return urepo.findById(id);
	}
	
	public userModel updateData(userModel um)
	{
		return urepo.saveAndFlush(um);
	}
	
	public void deleteData(int id)
	{
		urepo.deleteById(id);
	}
}
