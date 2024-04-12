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

import com.soltel.psico.userPsico.dtos.CreateUserPsicoReqDTO;
import com.soltel.psico.userPsico.dtos.CreateUserPsicoResDTO;
import com.soltel.psico.userPsico.models.UserPsicoEntity;
import com.soltel.psico.userPsico.service.UserPsicoService;

@RestController
@RequestMapping("/userPsico")
@CrossOrigin(origins = "*")
public class UserPsicoController {
	
	@Autowired
	private UserPsicoService userPsicoService;
	
	@GetMapping("/getAll") 
	public List<UserPsicoEntity> getAll() {
		return userPsicoService.getAll();
	}
	
	@GetMapping("/getById/{id}")
	public UserPsicoEntity getById(@PathVariable("id") int id) {
		return userPsicoService.getById(id).get();
	}
	
	@PostMapping("/create")
	public UserPsicoEntity create(@RequestBody UserPsicoEntity userPsicoEntity) {
		return userPsicoService.create(userPsicoEntity);
	}
	
	@PutMapping("/update/{id}")
	public CreateUserPsicoResDTO update(@PathVariable int id, @RequestBody CreateUserPsicoReqDTO dto ) {
		return this.userPsicoService.update(id, dto);	
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		this.userPsicoService.delete(id);	
	}
	
	
}
