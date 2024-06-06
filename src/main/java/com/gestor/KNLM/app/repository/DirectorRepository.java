package com.gestor.KNLM.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestor.KNLM.app.entity.DirectorEntity;

@Repository
public interface DirectorRepository extends JpaRepository<DirectorEntity, Long> {

	DirectorEntity findByCedulaAndContra(Long cedula, String contra);
}
