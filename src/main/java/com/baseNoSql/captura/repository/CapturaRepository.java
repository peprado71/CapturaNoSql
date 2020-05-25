package com.baseNoSql.captura.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.baseNoSql.captura.model.Captura;

public interface CapturaRepository extends MongoRepository<Captura, String> {
		  List<Captura> findByMarcaContaining(String marca);	    	  
		}
