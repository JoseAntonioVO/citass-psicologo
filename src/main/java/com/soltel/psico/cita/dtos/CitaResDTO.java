package com.soltel.psico.cita.dtos;

import java.time.LocalDate;

import lombok.Data;

@Data()
public class CitaResDTO {
	private int id;
	private LocalDate fecha;
}
