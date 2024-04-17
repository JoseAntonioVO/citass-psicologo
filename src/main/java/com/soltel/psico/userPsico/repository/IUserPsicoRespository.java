package com.soltel.psico.userPsico.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soltel.psico.userPsico.models.UserPsicoEntity;


public interface IUserPsicoRespository extends JpaRepository<UserPsicoEntity, Integer> {
 
}
