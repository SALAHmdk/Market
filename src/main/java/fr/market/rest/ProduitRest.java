package fr.market.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.market.dao.IProduitRepository;
import fr.market.entities.Produit;

@RestController@CrossOrigin

public class ProduitRest {
	@Autowired
	private IProduitRepository produitRepo;
	@GetMapping("produit")
	public Iterable <Produit>getAllProduit(){
		return produitRepo.findAll();
		
	}
	
}
