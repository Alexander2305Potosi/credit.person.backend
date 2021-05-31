package com.credit.person.service;

import java.util.concurrent.atomic.AtomicLong;

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
		AtomicLong atomicLong = new AtomicLong();
		personRepository.count().subscribe(value -> atomicLong.set(value));
		Long idCreditSave = atomicLong.longValue();
		credit.setIdCredit(idCreditSave);
		return personRepository.save(credit);
	}

	public Mono<Credit> update(Credit credit) {
		return personRepository.findById(credit.getIdCredit()).flatMap(dbCredit -> {
			dbCredit.setTotalCost(credit.getTotalCost());
			return personRepository.save(dbCredit);
		});
	}

	public Mono<Void> delete(long idCredit) {
		return personRepository.deleteById(idCredit);
	}

}
