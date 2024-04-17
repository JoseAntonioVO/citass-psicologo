package com.soltel.psico.userPsico.controller;

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

import com.soltel.psico.userPsico.dtos.SaveUserPsicoReqDTO;
import com.soltel.psico.userPsico.dtos.UserPsicoResDTO;
import com.soltel.psico.userPsico.models.UserPsicoEntity;
import com.soltel.psico.userPsico.service.UserPsicoService;

@RestController
@RequestMapping("/userPsico")
@CrossOrigin(origins = "http://localhost:4200")
public class UserPsicoController {
	
	@Autowired
	private UserPsicoService userPsicoService;
	
	@GetMapping("/getAll") 
	public List<UserPsicoResDTO> getAll() {
		return userPsicoService.getAll();
	}
	
	@GetMapping("/getById/{id}")
	public UserPsicoResDTO getById(@PathVariable("id") int id) {
		return userPsicoService.getById(id);
	}
	
	@PostMapping("/create")
	public UserPsicoResDTO create(@RequestBody SaveUserPsicoReqDTO dto) {
		return userPsicoService.create(dto);
	}
	
	@PutMapping("/update/{id}")
	public UserPsicoResDTO update(@PathVariable int id, @RequestBody SaveUserPsicoReqDTO dto ) {
		return this.userPsicoService.update(id, dto);	
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		this.userPsicoService.delete(id);	
	}
	
	
}
