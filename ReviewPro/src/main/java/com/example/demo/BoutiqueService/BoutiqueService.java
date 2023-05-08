package com.example.demo.BoutiqueService;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import com.example.demo.BoutiqueModel.BoutiqueDet;
import com.example.demo.BoutiqueModel.BoutiqueDetails;
import com.example.demo.BoutiqueRepository.BoutiqueRepo;
import com.example.demo.BoutiqueRepository.FoRepo;

@Service

public class BoutiqueService {
	@Autowired
	BoutiqueRepo repository;
	@Autowired
	FoRepo repos;
	public String addBoutique(BoutiqueDetails boutique)
	{
		repository.save(boutique);
		return "Added";
	}
	public List<BoutiqueDetails> getBoutique()
	{
		return repository.findAll();
	}
	public Optional<BoutiqueDetails> getBoutiqueById(int id)
	{
		return repository.findById(id);
	}
	public String updateBoutique(BoutiqueDetails boutique)
	{
		repository.save(boutique);
		return "Updated";
	}
	public void deleteByRequestParam(int id)
	{
		repository.deleteById(id);
}
	public List<BoutiqueDetails> getSorted(String field)
	{
		return repository.findAll(Sort.by(Sort.Direction.ASC,field));
	}
	public List<BoutiqueDetails>getWithPagination(int offset,int pagesize)
	{
        Page<BoutiqueDetails> fo=repository.findAll(PageRequest.of(offset,pagesize));
        	return fo.getContent();
	}
	public BoutiqueDet saveBoutiqueDet(BoutiqueDet f)
	{
		return repos.save(f);
	}
//	public List<FoodDet> getAllFood()
//	{
//		return repos.getFood();
//	}
	
}
