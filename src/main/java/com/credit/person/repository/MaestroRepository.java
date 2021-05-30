package com.credit.person.repository;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.credit.person.dto.MaestroDTO;

import reactor.core.publisher.Flux;

public interface MaestroRepository extends ReactiveCrudRepository<MaestroDTO, Long>  {

	@Query("SELECT id_person as id, CONCAT(name, \" \", last_name) as name  FROM person")
	Flux<MaestroDTO> getAllPerson();
	
	@Query("SELECT id_type_identification as id, name  FROM type_identification")
	Flux<MaestroDTO> getAllTypeIdentification();
	
	@Query("SELECT id_city as id, name  FROM city")
	Flux<MaestroDTO> getAllCity();
	
	@Query("SELECT id_suburb as id, name  FROM credit.suburb WHERE id_city = ?")
	Flux<MaestroDTO> getAllSuburbByCity(long idCity);

}
