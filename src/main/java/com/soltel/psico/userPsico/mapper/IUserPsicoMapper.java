package com.soltel.psico.userPsico.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.soltel.psico.userPsico.dtos.CreateUserPsicoReqDTO;
import com.soltel.psico.userPsico.dtos.CreateUserPsicoResDTO;
import com.soltel.psico.userPsico.models.UserPsicoEntity;

@Mapper(componentModel = "spring")
public interface IUserPsicoMapper {
	IUserPsicoMapper MAP = Mappers.getMapper(IUserPsicoMapper.class);
	
	public UserPsicoEntity CreateUserPsicoReqDTOtoUserPsicoEntity(CreateUserPsicoReqDTO dto);
	public CreateUserPsicoResDTO UserPsicoEntitytoCreateUserPsicoResDTO(UserPsicoEntity entity);

}

