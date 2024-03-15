package com.project.apirestfull.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.apirestfull.models.EmpresaModel;
import com.project.apirestfull.models.User;
import com.project.apirestfull.repositorys.EmpresaRepo;

import jakarta.persistence.EntityNotFoundException;

@Service
public class EmpresaService {
	@Autowired
	private EmpresaRepo empresaRepo;
	
	
	

	
	public EmpresaModel empresaAddInUser(User user) {
		return empresaRepo.findById(user.getEmpresa().getId_empresa())
        .orElseThrow();
		
	}
	
	public EmpresaModel addEmpresa(EmpresaModel empresa) {
		return empresaRepo.save(empresa);
		
	}
	
	public List<EmpresaModel> returnEmpresas() {
		if (empresaRepo != null) {
			return empresaRepo.findAll();
		} else {
			return null;
		}
		
	}
	public EmpresaModel returnOneEmpresa(Integer id) {
		existEmpresa(id);
		 return empresaRepo.findById(id).orElse(null);
		
	}
	
	
	private void existEmpresa(Integer id) {
		if (!empresaRepo.existsById(id)) {

			
			throw new EntityNotFoundException("Empresa com o id: *" + id + "* não encontrado");
			
		}
	}

}
