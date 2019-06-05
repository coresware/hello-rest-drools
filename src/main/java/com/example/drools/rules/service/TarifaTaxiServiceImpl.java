package com.example.drools.rules.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.drools.rules.model.Tarifa;
import com.example.drools.rules.model.Viaje;

@Service
public class TarifaTaxiServiceImpl implements TarifaTaxiService {

	private static final Logger LOGGER = LoggerFactory.getLogger(TarifaTaxiServiceImpl.class);

	@Autowired
	private KieContainer kContainer;

	@Override
	public Long calcularTarifa(Viaje viaje) {
		Tarifa tarifa = new Tarifa();
		KieSession kieSession = kContainer.newKieSession();
		kieSession.setGlobal("tarifa", tarifa);
		kieSession.insert(viaje);
		kieSession.fireAllRules();
		kieSession.dispose();
		LOGGER.info("¡¡ TARIFA CALCULADA !! " + tarifa.getTarifaTotal());
		return tarifa.getTarifaTotal();
	}
}
