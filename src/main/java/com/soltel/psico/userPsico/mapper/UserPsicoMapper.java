package com.soltel.psico.userPsico.mapper;



import com.soltel.psico.userPsico.dtos.CreateUserPsicoReqDTO;
import com.soltel.psico.userPsico.dtos.CreateUserPsicoResDTO;
import com.soltel.psico.userPsico.models.UserPsicoEntity;

public class UserPsicoMapper implements IUserPsicoMapper {
	
	public UserPsicoEntity CreateUserPsicoReqDTOtoUserPsicoEntity(CreateUserPsicoReqDTO dto) {
        if ( dto == null ) {
            return null;
        }
        UserPsicoEntity userPsicoEntity = new UserPsicoEntity();
        userPsicoEntity.setNombre( dto.getNombre() );
        userPsicoEntity.setApellidos( dto.getApellidos() );
        userPsicoEntity.setDni( dto.getDni() );
        userPsicoEntity.setTelefono( dto.getTelefono() );
        userPsicoEntity.setContrasena( dto.getContrasena() );
        return userPsicoEntity;
	}
	
	public CreateUserPsicoResDTO UserPsicoEntitytoCreateUserPsicoResDTO(UserPsicoEntity entity) {
        if ( entity == null ) {
            return null;
        }
        CreateUserPsicoResDTO userPsicoDTO = new CreateUserPsicoResDTO();
        userPsicoDTO.setNombre( entity.getNombre() );
        userPsicoDTO.setApellidos( entity.getApellidos() );
        userPsicoDTO.setDni( entity.getDni() );
        userPsicoDTO.setTelefono( entity.getTelefono() );
        userPsicoDTO.setContrasena( entity.getContrasena() );
        return userPsicoDTO;
	}

}

