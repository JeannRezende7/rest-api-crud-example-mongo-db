package br.com.devjan.supertrunfo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.devjan.supertrunfo.model.Cartas;

public interface CartasRepository extends MongoRepository <Cartas, String>{
        
}
