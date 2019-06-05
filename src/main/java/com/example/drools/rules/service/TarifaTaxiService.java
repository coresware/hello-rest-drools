package com.example.drools.rules.service;

import com.example.drools.rules.model.Viaje;

public interface TarifaTaxiService {

	Long calcularTarifa(Viaje viaje);
}
