package com.soltel.psico.cita.models;


import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.soltel.psico.userPsico.models.UserPsicoEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity()
@Table(name ="citas")
@Data()
public class CitaEntity {
	@Id()
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;
	
	@ManyToOne()
	@JoinColumn(name="idUsuario", nullable=false)
	private UserPsicoEntity userPsicoEntity;
	
}
