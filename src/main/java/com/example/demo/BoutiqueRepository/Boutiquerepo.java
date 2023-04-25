package com.example.demo.BoutiqueRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.BoutiqueModel.Boutiquemodel;

@Repository

public interface Boutiquerepo extends JpaRepository<Boutiquemodel,Integer>{

}
