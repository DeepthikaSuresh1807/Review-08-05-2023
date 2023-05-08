package com.example.demo.BoutiqueService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.BoutiqueModel.LoginModel;
import com.example.demo.BoutiqueRepository.LoginRepo;

@Service

public class LoginService {
	@Autowired
	private LoginRepo repository;
	public String checkLogin(String username,String password)
	{
		LoginModel user=repository.findByusername(username);
		if(user==null)
		{
			return "no user found";
		}
		else
		{
			if(user.getPassword().equals(password))
			{
				return"Login Succesfull";
			}
			else
			{
				return "Login Failed";
			}
		}
	}
	public LoginModel addUser(LoginModel boutique)
	{
		return repository.save(boutique);
	}
	public List<LoginModel> getUser()
	{
		return repository.findAll();
	}

}
