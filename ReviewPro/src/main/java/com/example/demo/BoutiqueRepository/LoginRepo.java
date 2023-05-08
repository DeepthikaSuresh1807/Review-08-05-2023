package com.example.demo.BoutiqueRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.BoutiqueModel.LoginModel;

public interface LoginRepo extends JpaRepository<LoginModel,Integer>{
	LoginModel findByusername(String username);

}
