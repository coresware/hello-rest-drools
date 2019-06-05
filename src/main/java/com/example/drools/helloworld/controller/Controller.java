package com.example.drools.helloworld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.drools.rules.model.Viaje;
import com.example.drools.rules.service.TarifaTaxiService;

@RestController
public class Controller {

	@Autowired
	TarifaTaxiService service;

	@RequestMapping(value = "/calcular", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Long calcular(@RequestBody(required = true) Viaje viaje) {

		Long tarifaTotal = this.service.calcularTarifa(viaje);
		return tarifaTotal;
	}

}
