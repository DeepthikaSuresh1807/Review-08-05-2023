package com.example.demo.BoutiqueService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.BoutiqueModel.BoutiqueDet;
import com.example.demo.BoutiqueModel.Boutiquemodel;
import com.example.demo.BoutiqueRepository.BoutiRepo;
import com.example.demo.BoutiqueRepository.Boutiquerepo;

@Service
public class Boutiqueservice {
	@Autowired
	Boutiquerepo repository;
	@Autowired
	BoutiRepo repos;
	public String addBoutique(Boutiquemodel boutique)
	{
		repository.save(boutique);
		return "Added";
	}
	public List<Boutiquemodel> getBoutique()
	{
		return repository.findAll();
	}
	public Optional<Boutiquemodel>getBoutiqueById(int id)
	{
		return repository.findById(id);
	}
	public String updateBoutique(Boutiquemodel boutique)
	{
		repository.save(boutique);
		return"Updated";
	}
	public void deleteByRequestParam(int id)
	{
		repository.deleteById(id);
	}
	public List<Boutiquemodel>getSorted(String field)
	{
		return repository.findAll(Sort.by(Sort.Direction.ASC,field));
	}
	public List<Boutiquemodel>getWithPagination(int offset,int pagesize)
	{
	Page<Boutiquemodel>bo=repository.findAll(PageRequest.of(offset, pagesize));
		return bo.getContent();
	}
	public BoutiqueDet saveBoutiqueDet(BoutiqueDet b)
	{
		return repos.save(b);
	}

}
	