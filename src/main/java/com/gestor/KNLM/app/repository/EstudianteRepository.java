package com.gestor.KNLM.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestor.KNLM.app.entity.EstudianteEntity;

@Repository
public interface EstudianteRepository extends JpaRepository<EstudianteEntity, Long>{

	EstudianteEntity findByCedulaAndContra(Long cedula, String contra);
}
