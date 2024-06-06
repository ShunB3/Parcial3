package com.gestor.KNLM.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.gestor.KNLM.app.entity.AdministradorEntity;
import com.gestor.KNLM.app.entity.CoordinadorEntity;
import com.gestor.KNLM.app.entity.DirectorEntity;
import com.gestor.KNLM.app.entity.EstudianteEntity;
import com.gestor.KNLM.app.entity.EvaluadorEntity;
import com.gestor.KNLM.app.entity.LoginUser;
import com.gestor.KNLM.app.repository.AdministradorRepository;
import com.gestor.KNLM.app.repository.CoordinadorRepository;
import com.gestor.KNLM.app.repository.DirectorRepository;
import com.gestor.KNLM.app.repository.EstudianteRepository;
import com.gestor.KNLM.app.repository.EvaluadorRepository;

@Controller
public class HomeController {
	
	@Autowired
	private AdministradorRepository administradorRepository;
	
	@Autowired
	private CoordinadorRepository  coordinadorRepository;
	
	@Autowired
	private DirectorRepository directorRepository;
	
	@Autowired
	private EstudianteRepository estudianteRepository;
	
	@Autowired
	private EvaluadorRepository evaluadorRepository;

	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("usuario", new LoginUser());
		
		return "login";
	}
	
	public boolean esNumero(String strNum) {
	    try {
	        Long.parseLong(strNum);
	        return true;
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	}
	
	@PostMapping("/loguearse")
	public String loguearse(LoginUser usuario, Model model) {
		Long idAdmin = null;
		Long idCoor = null;
		Long idDir = null;
		Long idEst = null;
		Long idEva = null;
		
		if(esNumero(usuario.getUsuario())) {
			DirectorEntity director = directorRepository.findByCedulaAndContra(Long.parseLong(usuario.getUsuario()), usuario.getContra());
	        if (director != null) {
	            idDir = director.getCedula();
	        }

	        CoordinadorEntity coordinador = coordinadorRepository.findByCedulaAndContra(Long.parseLong(usuario.getUsuario()), usuario.getContra());
	        if (coordinador != null) {
	            idCoor = coordinador.getCedula();
	        }

	        EstudianteEntity estudiante = estudianteRepository.findByCedulaAndContra(Long.parseLong(usuario.getUsuario()), usuario.getContra());
	        if (estudiante != null) {
	            idEst = estudiante.getCedula();
	        }

	        EvaluadorEntity evaluador = evaluadorRepository.findByCedulaAndContra(Long.parseLong(usuario.getUsuario()), usuario.getContra());
	        if (evaluador != null) {
	            idEva = evaluador.getCedula();
	        }
		}else {
			AdministradorEntity admin = administradorRepository.findByUsuarioAndContra(usuario.getUsuario(), usuario.getContra());
	        if (admin != null) {
	            idAdmin = admin.getId();
	        }
		}
		
		if(idAdmin != null) {
			return "redirect:/home-admin/"+idAdmin;
		}
		
		if(idCoor != null) {
			return "redirect:/home-coor/"+idCoor;
		}
		
		if(idDir != null) {
			return "redirect:/home-dir/"+idDir;
		}
		
		if(idEst != null) {
			return "redirect:/home-est/"+idEst;
		}
		
		if(idEva != null) {
			return "redirect:/home-eva/"+idEva;
		}
		
		return "login";
	}
}

