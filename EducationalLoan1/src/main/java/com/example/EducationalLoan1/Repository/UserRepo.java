package com.example.EducationalLoan1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EducationalLoan1.Model.userModel;

public interface UserRepo extends JpaRepository<userModel, Integer> {

}
