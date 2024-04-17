package com.soltel.psico.userPsico.mapper;

import java.util.List;
import java.util.ArrayList;

import com.soltel.psico.cita.models.CitaEntity;
import com.soltel.psico.userPsico.dtos.SaveUserPsicoReqDTO;
import com.soltel.psico.userPsico.dtos.UserPsicoResDTO;
import com.soltel.psico.userPsico.models.UserPsicoEntity;

public abstract class UserPsicoMapper {

	public static UserPsicoEntity DTOtoEntity(SaveUserPsicoReqDTO dto) {
		if (dto == null) {
			return null;
		}
		UserPsicoEntity entity = new UserPsicoEntity();
		entity.setNombre(dto.getNombre());
		entity.setApellidos(dto.getApellidos());
		entity.setDni(dto.getDni());
		entity.setTelefono(dto.getTelefono());
		entity.setContrasena(dto.getContrasena());
		entity.setCitaEntityList(new ArrayList<CitaEntity>());
		return entity;
	}

	public static UserPsicoResDTO entityToDTO(UserPsicoEntity entity) {
		if (entity == null) {
			return null;
		}
		UserPsicoResDTO dto = new UserPsicoResDTO();
		dto.setId(entity.getId());
		dto.setNombre(entity.getNombre());
		dto.setApellidos(entity.getApellidos());
		dto.setDni(entity.getDni());
		dto.setTelefono(entity.getTelefono());
		dto.setContrasena(entity.getContrasena());
		return dto;
	}
	
	public static List<UserPsicoResDTO> entityListToDTOList(List<UserPsicoEntity> entityList) {
		List<UserPsicoResDTO> list = new ArrayList<UserPsicoResDTO>();
		
		for(UserPsicoEntity entity: entityList) {
			list.add(UserPsicoMapper.entityToDTO(entity));
		}
		return list;
	}

}
