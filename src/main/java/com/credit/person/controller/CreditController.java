package com.credit.person.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.credit.person.dto.CreditPersonDTO;
import com.credit.person.service.CreditService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("credit-person")
public class CreditController {

	@Autowired
	private CreditService creditService;

	@GetMapping("/list")
	public Flux<CreditPersonDTO> creditList(@RequestParam Integer page, @RequestParam Integer limit) {
		return creditService.findAll(PageRequest.of(page, limit));
	}

	@GetMapping("/{idPerson}")
	public Flux<CreditPersonDTO> getcredit(@PathVariable("idPerson") String idPerson) {
		return creditService.findById(idPerson);
	}

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Mono<CreditPersonDTO> savecredit(@RequestBody CreditPersonDTO creditPersonDTO) {
		return creditService.save(creditPersonDTO);
	}

	@PutMapping("/{idCredit}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Mono<CreditPersonDTO> updatecredit(@PathVariable("idCredit") String idCredit) {
		return creditService.update(idCredit);
	}

}
