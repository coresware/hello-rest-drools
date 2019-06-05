package com.example.drools.rules.model;

public class Tarifa {

	private Long recargoNocturno;
	private Long tarifaViaje;

	public Tarifa() {
		recargoNocturno = 0L;
		tarifaViaje = 0L;
	}

	public Long getRecargoNocturno() {
		return recargoNocturno;
	}

	public void setRecargoNocturno(Long recargoNocturno) {
		this.recargoNocturno = recargoNocturno;
	}

	public Long getTarifaViaje() {
		return tarifaViaje;
	}

	public void setTarifaViaje(Long tarifaViaje) {
		this.tarifaViaje = tarifaViaje;
	}

	public Long getTarifaTotal() {
		return recargoNocturno + tarifaViaje;
	}

}
