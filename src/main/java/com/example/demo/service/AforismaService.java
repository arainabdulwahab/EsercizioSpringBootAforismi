package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Aforisma;
import com.example.demo.repository.AforismaRepository;

public class AforismaService  implements IAforismaService{

	@Autowired 
	private AforismaRepository repository;
	@Override
	public Iterable<Aforisma> getAllAforisma() {
		return repository.findAll();
	}

	@Override
	public Aforisma getAforismaById(Integer id) {
		Optional<Aforisma> aforisma = repository.findById(id);
		if(aforisma.isEmpty() == false) {
			return aforisma.get();
		}
		return null;
	}

	@Override
	public Aforisma addAforisma(Aforisma aforisma) {
		return repository.save(aforisma);
	}

	@Override
	public Aforisma updateAforisma(Integer id, Aforisma aforisma) {
		Optional<Aforisma> af = repository.findById(id);
		if(af.isEmpty() == false) {
			af.get().setTesto(aforisma.getTesto());
			repository.save(af.get());
			return af.get();
		}
		return null;
	}

	@Override
	public Aforisma deleteAforismaById(Integer id) {
		Optional<Aforisma> af = repository.findById(id);
		if(af.isEmpty() == false) {
			repository.deleteById(id);
			return af.get();
		}
		return null;
	}

}
