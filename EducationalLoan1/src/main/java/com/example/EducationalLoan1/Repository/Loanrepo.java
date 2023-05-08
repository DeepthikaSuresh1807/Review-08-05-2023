package com.example.EducationalLoan1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EducationalLoan1.Model.LoanApplicationModel;

public interface Loanrepo extends JpaRepository<LoanApplicationModel,Integer> {

}
