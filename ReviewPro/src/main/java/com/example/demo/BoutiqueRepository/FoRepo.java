package com.example.demo.BoutiqueRepository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.BoutiqueModel.BoutiqueDet;
@Repository

public interface FoRepo extends JpaRepository<BoutiqueDet,Integer>{

//	List<FoodDet> getFood();
	

}
