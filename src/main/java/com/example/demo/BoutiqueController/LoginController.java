package com.example.demo.BoutiqueController;

import java.util.List;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.BoutiqueModel.LoginModel;
import com.example.demo.BoutiqueService.LoginService;

@RestController
@RequestMapping("/botiq")

public class LoginController {
@Autowired
private LoginService lnservice;
@PostMapping("/login")
public String login(@RequestBody Map<String,String>loginData)
{
	String username=loginData.get("username");
	String password=loginData.get("password");
	String result=lnservice.checkLogin(username,password);
	return result;
}
@PostMapping("/deep")
public LoginModel AddUser(@RequestBody LoginModel boutique)
{
	return lnservice.addUser(boutique);
}
@GetMapping("/dq")
public List<LoginModel> listAll()
{
	return lnservice.getUser();
}
}
