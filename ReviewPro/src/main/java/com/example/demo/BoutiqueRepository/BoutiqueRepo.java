package com.example.demo.BoutiqueRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.BoutiqueModel.BoutiqueDetails;
@Repository

public interface BoutiqueRepo extends JpaRepository<BoutiqueDetails,Integer> {

}
