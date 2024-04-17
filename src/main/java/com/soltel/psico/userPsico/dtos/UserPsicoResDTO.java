package com.soltel.psico.userPsico.dtos;

import lombok.Data;

@Data()
public class UserPsicoResDTO {

	private int id;
	private String nombre;
	private String apellidos;
	private int telefono;
	private String dni;
	private String contrasena;
}
