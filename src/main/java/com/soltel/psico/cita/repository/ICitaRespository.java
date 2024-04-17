package com.soltel.psico.cita.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soltel.psico.cita.models.CitaEntity;

public interface ICitaRespository extends JpaRepository<CitaEntity, Integer> {
 
}
