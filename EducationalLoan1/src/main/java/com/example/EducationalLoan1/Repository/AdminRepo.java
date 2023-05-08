package com.example.EducationalLoan1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EducationalLoan1.Model.AdminModel;

public interface AdminRepo extends JpaRepository<AdminModel,Integer> {

}
