package fr.schibani.mongo.bean;

import java.util.Date;

public class Accreditation {

	private Long accId;
	private String numero;
	private String statut;
	private Date datePriseEffet;
	private Long porteeId;

	public Long getAccId() {
		return accId;
	}

	public void setAccId(Long accId) {
		this.accId = accId;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public Date getDatePriseEffet() {
		return datePriseEffet;
	}

	public void setDatePriseEffet(Date datePriseEffet) {
		this.datePriseEffet = datePriseEffet;
	}

	public Long getPorteeId() {
		return porteeId;
	}

	public void setPorteeId(Long porteeId) {
		this.porteeId = porteeId;
	}

}
