package com.credit.person.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.credit.person.model.Credit;


public interface PersonRepository extends ReactiveCrudRepository<Credit, Long> {

}
