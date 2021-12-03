package com.ynov.architectureLogiciel.apiProduit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import com.ynov.architectureLogiciel.apiProduit.entity.Produit;
import com.ynov.architectureLogiciel.apiProduit.repository.ProduitRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

public class ProduitController {

	@Autowired
    ProduitRepository produitRepository;

    @GetMapping(value = "/produit/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity  getArticleById(@PathVariable int id){
    	
    	Produit produit = produitRepository.getById(id);

        if(produit == null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("produit introuvable !");
        }

        return new ResponseEntity<Produit>(produit, HttpStatus.OK);
    }
    
    @GetMapping(value = "/ping", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String>  ping(){
 

        return new ResponseEntity<String>("pong", HttpStatus.OK);
    }

    

   
}
