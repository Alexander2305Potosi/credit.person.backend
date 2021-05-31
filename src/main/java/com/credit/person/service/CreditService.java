package com.credit.person.service;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import com.credit.person.dto.CreditPersonDTO;
import com.credit.person.model.Credit;
import com.credit.person.repository.CreditRepository;
import com.credit.person.repository.PersonRepository;
import com.credit.person.util.ResponseEntity;

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
//		 Long idLastCredit = personRepository.count();
//		credit.setIdCredit(idLastCredit++);
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
