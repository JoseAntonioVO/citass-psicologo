package com.soltel.psico.cita.dtos;

import java.time.LocalDate;

import lombok.Data;

@Data()
public class SaveCitaReqDTO {

	private LocalDate fecha;
}
