package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.example.demo.model.Aforisma;
import com.example.demo.service.AforismaService;

@RestController
public class AforismaController {
	
	@Autowired
	AforismaService service;
	
	@GetMapping("/api/aforismi")
	public Iterable<Aforisma> getAllAforisma(){
		return service.getAllAforisma();
	}
	
	@GetMapping("/api/aforisma/{id}")
	public Aforisma getAforismaById(@PathVariable Integer id) {
		Aforisma aforisma = service.getAforismaById(id);
		if(aforisma == null ) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Aforisma non trovato");
		}
		return aforisma;
		
	}
	
	@PostMapping("/api/aforisma/save")
	public Aforisma addAforisma(@RequestBody Aforisma aforisma) {
		service.addAforisma(aforisma);
		return aforisma;
	}
	
	@PutMapping("/api/aforisma/update/{id}")
	public Aforisma updateAforisma(@PathVariable Integer id, @RequestBody  Aforisma aforisma) {
		Aforisma af = service.updateAforisma(id, aforisma);
		if(af == null) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Aforisma non trovato");
		}
		return aforisma;
	}
	
	@DeleteMapping("/api/aforisma/delete/{id}")
	public Aforisma deleteAforismaById(@PathVariable Integer id) {
		Aforisma aforisma = service.getAforismaById(id);
		if(aforisma == null) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Aforisma non trovato");
		} else {
			service.deleteAforismaById(id);
			return aforisma;
		}
	}


}
