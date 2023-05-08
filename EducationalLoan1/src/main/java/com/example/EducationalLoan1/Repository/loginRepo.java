package com.example.EducationalLoan1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EducationalLoan1.Model.LoginModel;

public interface loginRepo extends JpaRepository<LoginModel,Integer>{

}
