package com.example.administracion.Services;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	import com.example.administracion.Models.Rol;
	import com.example.administracion.Repositories.RolRepository;


	@Service
	public class RolService{
		@Autowired
		RolRepository rolRepository;

		public Rol getRolById(Long id){
			return rolRepository.findById(id).get();
		}

	}