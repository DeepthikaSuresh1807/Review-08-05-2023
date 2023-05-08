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

import com.example.demo.BoutiqueModel.BoutiqueDet;
import com.example.demo.BoutiqueModel.BoutiqueDetails;
import com.example.demo.BoutiqueService.BoutiqueService;

@RestController
@RequestMapping("/Boutique")
public class BoutiqueController {
	@Autowired
	BoutiqueService foservice;
	@PostMapping("/value")
	public String create(@RequestBody BoutiqueDetails boutique)
	{
		return foservice.addBoutique(boutique);
	}
	@GetMapping("/bro")
	public List<BoutiqueDetails> read()
	{
		return foservice.getBoutique();
	}
	@GetMapping("/{id}")
	public Optional<BoutiqueDetails>readById(@PathVariable int id)
	{
		return foservice.getBoutiqueById(id);
	}
	@PutMapping("/put")
	public String update(@RequestBody BoutiqueDetails boutique)
	{
		return foservice.updateBoutique(boutique);
	}
	@DeleteMapping("/delete")
	public String delete(@RequestParam("fid") int id)
	{
		foservice.deleteByRequestParam(id);
		return "deleted";
		
	}
	@GetMapping("/{field}")
	public List<BoutiqueDetails>getBoutiqueSorted(@PathVariable String field)
	{
		return foservice.getSorted(field);
	}
	@GetMapping("/{offset}/{pagesize}")
	public List<BoutiqueDetails> getBoutiquePagination(@PathVariable int offset,@PathVariable int pagesize)
	{
		return foservice.getWithPagination(offset,pagesize);
	}
	@PostMapping("/pop")
		public BoutiqueDet saveFoodDet(@RequestBody BoutiqueDet f)
		{
			return foservice.saveBoutiqueDet(f);
		}
//	@GetMapping("/bob")
//	public List<FoodDet> getAllFood()
//	{
//		return foservice.getAllFood();
//	}

}
