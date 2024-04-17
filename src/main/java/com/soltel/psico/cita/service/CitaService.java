package com.soltel.psico.cita.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soltel.psico.cita.dtos.CitaResDTO;
import com.soltel.psico.cita.dtos.SaveCitaReqDTO;
import com.soltel.psico.cita.mapper.CitaMapper;
import com.soltel.psico.cita.models.CitaEntity;
import com.soltel.psico.cita.repository.ICitaRespository;
import com.soltel.psico.userPsico.dtos.SaveUserPsicoReqDTO;
import com.soltel.psico.userPsico.dtos.UserPsicoResDTO;
import com.soltel.psico.userPsico.mapper.UserPsicoMapper;
import com.soltel.psico.userPsico.models.UserPsicoEntity;

@Service
public class CitaService {
	
	@Autowired
	private ICitaRespository citaRespository;
	
	public List<CitaResDTO> getAll() {
		return CitaMapper.entityListToDTOList(this.citaRespository.findAll());
	}
	
	public CitaResDTO getById(int id) {
		return CitaMapper.entityToDTO(this.citaRespository.findById(id).get());
	}
	
	public CitaResDTO create(int idUsuario, SaveCitaReqDTO dto) {
		CitaEntity cita = CitaMapper.DTOToEntity(dto);
		cita.getUserPsicoEntity().setId(idUsuario);
		CitaEntity editedCita = this.citaRespository.save(cita);
		return CitaMapper.entityToDTO(editedCita);
	}
	
	public CitaResDTO update(int id, SaveCitaReqDTO dto) {
		
		CitaEntity cita = this.citaRespository.findById(id).get();
		
		if (cita != null) {
			int idUsuario = cita.getUserPsicoEntity().getId();
			cita = CitaMapper.DTOToEntity(dto);
			cita.setId(id);
			cita.getUserPsicoEntity().setId(idUsuario);
			CitaEntity editedUserPsico = this.citaRespository.save(cita);
			return CitaMapper.entityToDTO(editedUserPsico);
		}
		else {
			return null;
		}
	}
	
	public void delete (int id) {
		this.citaRespository.deleteById(id);
	}
	
}
