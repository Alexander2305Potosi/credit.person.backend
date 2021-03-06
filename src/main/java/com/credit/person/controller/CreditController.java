package com.credit.person.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
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
import com.credit.person.model.Credit;
import com.credit.person.service.CreditService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("credit-person")
public class CreditController {

	@Autowired
	private CreditService creditService;

	@GetMapping("/list")
	public Flux<CreditPersonDTO> creditList(@RequestParam String filter) {
		return creditService.findAll(filter);
	}

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Mono<Credit> savecredit(@RequestBody Credit credit) {
		return creditService.save(credit);
	}

	@PutMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Mono<Credit> updatecredit(@RequestBody Credit credit) {
		return creditService.update(credit);
	}

	@DeleteMapping("/{idCredit}")
	public Mono<Void> updatecredit(@PathVariable long idCredit) {
		return creditService.delete(idCredit);
	}
}
