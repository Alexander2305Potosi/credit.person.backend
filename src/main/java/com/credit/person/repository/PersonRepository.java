package com.credit.person.repository;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.credit.person.model.Credit;

import reactor.core.publisher.Mono;

public interface PersonRepository extends ReactiveCrudRepository<Credit, Long> {
	
}
