package com.soltel.psico.cita.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soltel.psico.cita.dtos.SaveCitaReqDTO;
import com.soltel.psico.cita.models.CitaEntity;
import com.soltel.psico.cita.dtos.CitaResDTO;
import com.soltel.psico.cita.service.CitaService;

@RestController
@RequestMapping("/citas")
@CrossOrigin(origins = "*")
public class CitaController {
	
	@Autowired
	private CitaService citaService;
	
	@GetMapping("/getAll") 
	public List<CitaResDTO> getAll() {
		return citaService.getAll();
	}
	
	@GetMapping("/getById/{id}")
	public CitaResDTO getById(@PathVariable("id") int id) {
		return citaService.getById(id);
	}
	
	@PostMapping("/create/{idUsuario}")
	public CitaResDTO create(@PathVariable("idUsuario") int idUsuario, @RequestBody SaveCitaReqDTO dto) {
		return citaService.create(idUsuario,dto);
	}
	
	@PutMapping("/update/{id}")
	public CitaResDTO update(@PathVariable int id, @RequestBody SaveCitaReqDTO dto ) {
		return citaService.update(id, dto);	
	}
	
	//Prueba de rama
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		citaService.delete(id);	
	}
	
}
