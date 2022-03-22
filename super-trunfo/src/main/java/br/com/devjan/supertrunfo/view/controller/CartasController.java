package br.com.devjan.supertrunfo.view.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.devjan.supertrunfo.model.Cartas;
import br.com.devjan.supertrunfo.repository.CartasRepository;



@RestController
@RequestMapping("/api/cartas")
public class CartasController {

    @Autowired
    CartasRepository repo;

    @GetMapping
    public List <Cartas> getAllCartas(){
        return repo.findAll();
    }

    @PostMapping
    public Cartas SaveCarta(@RequestBody Cartas carta) {
        return repo.save(carta);
        
    }

    

  
    
}
