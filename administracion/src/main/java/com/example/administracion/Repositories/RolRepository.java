package com.example.administracion.Repositories;

	import org.springframework.data.repository.CrudRepository;
	import org.springframework.stereotype.Repository;

	import com.example.administracion.Models.Rol;
	


	@Repository
	public interface RolRepository extends CrudRepository<Rol,Long>{
		
	}