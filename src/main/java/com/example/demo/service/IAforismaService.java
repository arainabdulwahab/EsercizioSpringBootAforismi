package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.Aforisma;
@Service
public interface IAforismaService {

	public Iterable<Aforisma> getAllAforisma();
	public Aforisma getAforismaById(Integer id);
	public Aforisma addAforisma(Aforisma aforisma);
	public Aforisma updateAforisma(Integer id, Aforisma aforisma);
	public Aforisma deleteAforismaById(Integer id);
}
