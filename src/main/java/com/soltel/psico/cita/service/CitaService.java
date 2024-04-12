package com.soltel.psico.cita.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.soltel.psico.cita.models.CitaEntity;
import com.soltel.psico.cita.repository.ICitaRespository;

public class CitaService {
	
	@Autowired
	private ICitaRespository citaRespository;
	
	public List<CitaEntity> getAll() {
		return this.citaRespository.findAll();
	}
	
	public Optional<CitaEntity> getById(int id) {
		return this.citaRespository.findById(id);
	}
	
	public CitaEntity create(CitaEntity citaEntity) {
		return this.citaRespository.save(citaEntity);
	}
	
	public CitaEntity update(CitaEntity citaEntity) {
		return this.citaRespository.save(citaEntity);
	}
	
	public void delete (int id) {
		this.citaRespository.deleteById(id);
	}
}
