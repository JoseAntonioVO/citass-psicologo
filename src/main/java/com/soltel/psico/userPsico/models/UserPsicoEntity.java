package com.soltel.psico.userPsico.models;



import java.util.List;

import com.soltel.psico.cita.models.CitaEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity()
@Table(name="userpsico")
@Data()
public class UserPsicoEntity {
	@Id()
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	
	@Column()
	private String nombre;
	
	@Column()
	private String apellidos;
	
	@Column()
	private int telefono;
	
	@Column()
	private String dni;
	
	@Column()
	private String contrasena;
	
	@OneToMany(mappedBy="userPsicoEntity", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<CitaEntity> citaEntityList;
	
}
