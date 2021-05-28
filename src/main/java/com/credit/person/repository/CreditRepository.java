package com.credit.person.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.credit.person.dto.CreditPersonDTO;

import reactor.core.publisher.Flux;

public interface CreditRepository extends ReactiveCrudRepository<CreditPersonDTO, Long> {

	 @Query("SELECT "
	 		+ "  p.id_person as id_person,"
	 		+ "  p.name as name_person,"
	 		+ "  p.last_name as last_name_person,"
	 		+ "  td.id_type_identification as id_type_identification,"
	 		+ "  td.name as name_id_type_identification,"
	 		+ "  p.number_identification as number_identification_person,"
	 		+ "  cd.id_credit as id_credit,"
	 		+ "  cd.total_cost as total_cost,"
	 		+ "  cd.total_fee as total_fee,"
	 		+ "  ct.id_city as id_city,"
	 		+ "  ct.name as name_city,"
	 		+ "  s.id_city as id_suburb,"
	 		+ "  s.name as name_suburb "
	 		+ " FROM person p"
	 		+ "        INNER JOIN"
	 		+ "    type_identification td ON td.id_type_identification = p.id_type_identification"
	 		+ "        INNER JOIN"
	 		+ "    credit cd ON p.id_person = cd.id_person"
	 		+ "        INNER JOIN"
	 		+ "    city ct ON ct.id_city = p.id_city_location"
	 		+ "    INNER JOIN"
	 		+ "    suburb s ON s.id_suburb = p.id_suburb_location")
	 Flux<CreditPersonDTO> findCreditAll(Pageable page);
	 
	 
}
