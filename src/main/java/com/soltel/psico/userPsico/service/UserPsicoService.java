package com.soltel.psico.userPsico.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soltel.psico.userPsico.dtos.SaveUserPsicoReqDTO;
import com.soltel.psico.userPsico.dtos.UserPsicoResDTO;
import com.soltel.psico.userPsico.mapper.UserPsicoMapper;
import com.soltel.psico.userPsico.models.UserPsicoEntity;
import com.soltel.psico.userPsico.repository.IUserPsicoRespository;

@Service
public class UserPsicoService {

	@Autowired
	private IUserPsicoRespository userPsicoRespository;


	public List<UserPsicoResDTO> getAll() {
		return UserPsicoMapper.entityListToDTOList(this.userPsicoRespository.findAll()) ;
	}

	public UserPsicoResDTO getById(int id) {
		return UserPsicoMapper.entityToDTO(this.userPsicoRespository.findById(id).get()) ;
	}

	public UserPsicoResDTO getByDNI(String dni) {
		return UserPsicoMapper.entityToDTO(this.userPsicoRespository.findByDni(dni)) ;
	}

	public UserPsicoResDTO create(SaveUserPsicoReqDTO dto) {
		UserPsicoEntity userPsico = UserPsicoMapper.DTOtoEntity(dto);;
		UserPsicoEntity editedUserPsico = this.userPsicoRespository.save(userPsico);
		return UserPsicoMapper.entityToDTO(editedUserPsico);
	}

	public UserPsicoResDTO update(int id, SaveUserPsicoReqDTO dto) {
		UserPsicoEntity userPsico = this.userPsicoRespository.findById(id).get();
		if (userPsico != null) {
			userPsico = UserPsicoMapper.DTOtoEntity(dto);
			userPsico.setId(id);
			UserPsicoEntity editedUserPsico = this.userPsicoRespository.save(userPsico);
			return UserPsicoMapper.entityToDTO(editedUserPsico);
		}
		else {
			return null;
		}
	}

	public void delete(int id) {
		this.userPsicoRespository.deleteById(id);
	}

}
