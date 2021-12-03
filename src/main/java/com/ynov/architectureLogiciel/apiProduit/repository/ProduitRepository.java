package com.ynov.architectureLogiciel.apiProduit.repository;

import org.springframework.stereotype.Repository;

import com.ynov.architectureLogiciel.apiProduit.entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ProduitRepository extends JpaRepository<Produit, Integer>{
	
	 Produit findProduitById(int id);

}

