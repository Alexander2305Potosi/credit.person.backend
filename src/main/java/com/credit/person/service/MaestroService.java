package com.credit.person.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.credit.person.dto.MaestroDTO;
import com.credit.person.repository.MaestroRepository;

import reactor.core.publisher.Flux;

@Service
public class MaestroService {
	

	@Autowired
	private MaestroRepository maestroRepository ;

	public Flux<MaestroDTO> listPerson() {
		// TODO Auto-generated method stub
		return maestroRepository.getAllPerson();
	}

	public Flux<MaestroDTO> listTypeIdentification() {
		// TODO Auto-generated method stub
		return maestroRepository.getAllTypeIdentification();
	}

	public Flux<MaestroDTO> listCity() {
		// TODO Auto-generated method stub
		return maestroRepository.getAllCity();
	}

	public Flux<MaestroDTO> listSuburb(long idCity) {
		// TODO Auto-generated method stub
		return maestroRepository.getAllSuburbByCity(idCity);
	}

}
