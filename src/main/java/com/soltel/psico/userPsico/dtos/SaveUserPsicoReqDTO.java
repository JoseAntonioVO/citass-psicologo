package com.soltel.psico.userPsico.dtos;

import lombok.Data;

@Data()
public class SaveUserPsicoReqDTO {

	private String nombre;
	private String apellidos;
	private int telefono;
	private String dni;
	private String contrasena;
}
