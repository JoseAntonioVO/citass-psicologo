package com.soltel.psico.cita.mapper;

import java.util.List;

import com.soltel.psico.cita.dtos.CitaResDTO;
import com.soltel.psico.cita.dtos.SaveCitaReqDTO;
import com.soltel.psico.cita.models.CitaEntity;
import com.soltel.psico.userPsico.models.UserPsicoEntity;

import java.util.ArrayList;



public abstract class CitaMapper {

	public static CitaEntity DTOToEntity(SaveCitaReqDTO dto) {
		if (dto == null) {
			return null;
		}
		CitaEntity entity = new CitaEntity();
		entity.setFecha(dto.getFecha());
		entity.setUserPsicoEntity(new UserPsicoEntity());

		return entity;
	}

	public static CitaResDTO entityToDTO(CitaEntity entity) {
		if (entity == null) {
			return null;
		}
		CitaResDTO dto = new CitaResDTO();
		dto.setId(entity.getId());
		dto.setFecha(entity.getFecha());
		return dto;
	}
	
	public static List<CitaResDTO> entityListToDTOList(List<CitaEntity> entityList) {
		List<CitaResDTO> list = new ArrayList<CitaResDTO>();
		
		for(CitaEntity entity: entityList) {
			list.add(CitaMapper.entityToDTO(entity));
		}
		return list;
	}

}
