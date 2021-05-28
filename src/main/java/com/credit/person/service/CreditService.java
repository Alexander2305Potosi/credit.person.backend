package com.credit.person.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.credit.person.dto.CreditPersonDTO;
import com.credit.person.repository.CreditRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
//@Slf4j
@Transactional
public class CreditService {

	@Autowired
	private CreditRepository creditRepository;

	public  Flux<CreditPersonDTO> findAll(Pageable page) {
		return creditRepository.findCreditAll(page);
	}

	public Flux<CreditPersonDTO> findById(String idPerson) {
		return creditRepository.findAll();
	}

	public Mono<CreditPersonDTO> save(CreditPersonDTO creditPersonDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	public Mono<CreditPersonDTO> update(String idCredit) {
		// TODO Auto-generated method stub
		return null;
	}

}
