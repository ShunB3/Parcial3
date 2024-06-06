package com.gestor.KNLM.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestor.KNLM.app.entity.DirectorEntity;
import com.gestor.KNLM.app.entity.EstudianteEntity;
import com.gestor.KNLM.app.entity.EvaluadorEntity;
import com.gestor.KNLM.app.entity.ProyectoEntity;




@Repository
public interface ProyectoRepository extends JpaRepository<ProyectoEntity, Long>{

	List<ProyectoEntity> findByEstudiante(EstudianteEntity estudiante);
	
	List<ProyectoEntity> findByDirector(DirectorEntity director);
	
	List<ProyectoEntity> findByEvaluador(EvaluadorEntity evaluador);
}
