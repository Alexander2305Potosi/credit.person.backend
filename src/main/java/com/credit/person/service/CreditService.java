package com.credit.person.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.credit.person.dto.CreditPersonDTO;
import com.credit.person.model.Credit;
import com.credit.person.repository.CreditRepository;
import com.credit.person.repository.PersonRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CreditService {

	@Autowired
	private CreditRepository creditRepository;

	@Autowired
	private PersonRepository personRepository;

	public Flux<CreditPersonDTO> findAll(String filter) {
		return creditRepository.findCreditAll(filter);
	}

	public Mono<Credit> save(Credit credit) {
		return personRepository.findAll().last().flatMap(num -> {
			credit.setIdCredit(num.getIdCredit()+1);
			  return this.personRepository.save(credit);
		}).switchIfEmpty(this.personRepository.save(credit.setAsNew()));
	}

	public Mono<Credit> update(Credit credit) {
		return personRepository.findById(credit.getIdCredit()).flatMap(creditRes -> {
			creditRes.setTotalCost(credit.getTotalCost());
			return personRepository.save(creditRes);
		});
	}

	public Mono<Void> delete(long idCredit) {
		return personRepository.deleteById(idCredit);
	}

}
