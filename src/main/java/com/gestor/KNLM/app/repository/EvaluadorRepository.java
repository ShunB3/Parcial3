package com.gestor.KNLM.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestor.KNLM.app.entity.EvaluadorEntity;

@Repository
public interface EvaluadorRepository extends JpaRepository<EvaluadorEntity, Long>{
	
	EvaluadorEntity findByCedulaAndContra(Long cedula, String contra);
}
