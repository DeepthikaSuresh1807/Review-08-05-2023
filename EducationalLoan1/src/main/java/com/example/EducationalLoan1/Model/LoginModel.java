package com.example.EducationalLoan1.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@ Table(name="Logintable")
public class LoginModel {
   @ Id
	private String LoginId;
	private String Email;
	private String Password;
	public String getLoginId() {
		return LoginId;
	}
	public void setLoginId(String loginId) {
		LoginId = loginId;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
}
