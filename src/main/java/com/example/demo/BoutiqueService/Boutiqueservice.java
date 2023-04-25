package com.example.demo.BoutiqueService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.BoutiqueModel.Boutiquemodel;
import com.example.demo.BoutiqueRepository.Boutiquerepo;

@Service
public class Boutiqueservice {
	@Autowired
	Boutiquerepo repository;
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
}
	