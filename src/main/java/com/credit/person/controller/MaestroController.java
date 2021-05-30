package com.credit.person.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.credit.person.dto.MaestroDTO;
import com.credit.person.service.MaestroService;

import reactor.core.publisher.Flux;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("maestro")
public class MaestroController {
	
	
	@Autowired
	private MaestroService maestroService;

	@GetMapping("/list-person")
	public Flux<MaestroDTO> listPerson() {
		return maestroService.listPerson();
	}
	
	@GetMapping("/list-typeIdentification")
	public Flux<MaestroDTO> listTypeIdentification() {
		return maestroService.listTypeIdentification();
	}
	
	@GetMapping("/list-city")
	public Flux<MaestroDTO> listCity() {
		return maestroService.listCity();
	}
	
	@GetMapping("/list-suburb")
	public Flux<MaestroDTO> listSuburbByCity(@RequestParam long idCity) {
		return maestroService.listSuburb(idCity);
	}
}
