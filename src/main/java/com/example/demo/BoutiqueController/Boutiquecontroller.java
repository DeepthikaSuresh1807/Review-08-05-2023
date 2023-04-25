package com.example.demo.BoutiqueController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.BoutiqueModel.Boutiquemodel;
import com.example.demo.BoutiqueService.Boutiqueservice;

@RestController
@RequestMapping("/boutique")
public class Boutiquecontroller {
@Autowired
Boutiqueservice botservice;
@PostMapping("")
public String create(@RequestBody Boutiquemodel boutique)
{
	return botservice.addBoutique(boutique);
}
@GetMapping("")
public List<Boutiquemodel>read()
{
	return botservice.getBoutique();
}
@GetMapping("/{id}")
public Optional<Boutiquemodel>readById(@PathVariable int id)
{
	return botservice.getBoutiqueById(id);
}
@PutMapping("/put")
public String update(@RequestBody Boutiquemodel boutique)
{
	return botservice.updateBoutique(boutique);
}
@DeleteMapping("/delete")
public String delete(@RequestParam("bid") int id)
{
	botservice.deleteByRequestParam(id);
	return "deleted";
}
}
