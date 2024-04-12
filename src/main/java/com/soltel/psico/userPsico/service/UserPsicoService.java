package com.soltel.psico.userPsico.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soltel.psico.userPsico.dtos.CreateUserPsicoReqDTO;
import com.soltel.psico.userPsico.dtos.CreateUserPsicoResDTO;
import com.soltel.psico.userPsico.mapper.IUserPsicoMapper;
import com.soltel.psico.userPsico.models.UserPsicoEntity;
import com.soltel.psico.userPsico.repository.IUserPsicoRespository;

@Service
public class UserPsicoService {

	@Autowired
	private IUserPsicoRespository userPsicoRespository;
	@Autowired
    private IUserPsicoMapper userPsicoMapper;

	public List<UserPsicoEntity> getAll() {
		return this.userPsicoRespository.findAll();
	}

	public Optional<UserPsicoEntity> getById(int id) {
		return this.userPsicoRespository.findById(id);
	}

	public UserPsicoEntity create(UserPsicoEntity userPsicoEntity) {
		return this.userPsicoRespository.save(userPsicoEntity);
	}

	public CreateUserPsicoResDTO update(int id, CreateUserPsicoReqDTO dto) {
		
		UserPsicoEntity userPsico = this.userPsicoRespository.findById(id).get();
		if (userPsico != null) {
			userPsico = userPsicoMapper.CreateUserPsicoReqDTOtoUserPsicoEntity(dto);;
			UserPsicoEntity editedUserPsico = this.userPsicoRespository.save(userPsico);
			return userPsicoMapper.UserPsicoEntitytoCreateUserPsicoResDTO(editedUserPsico);
		}
		else {
			return null;
		}
	}

	public void delete(int id) {
		this.userPsicoRespository.deleteById(id);
	}

}
