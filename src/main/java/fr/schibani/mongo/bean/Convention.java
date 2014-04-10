package fr.schibani.mongo.bean;

import java.util.Date;

public class Convention {

	private Long conId;
	private String pilote;
	private String secretaire;
	private Long numero;
	private Client client;
	private String section;
	private Date dateSignature;
	
	public Long getConId() {
		return conId;
	}

	public void setConId(Long conId) {
		this.conId = conId;
	}

	public String getPilote() {
		return pilote;
	}

	public void setPilote(String pilote) {
		this.pilote = pilote;
	}

	public String getSecretaire() {
		return secretaire;
	}

	public void setSecretaire(String secretaire) {
		this.secretaire = secretaire;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public Date getDateSignature() {
		return dateSignature;
	}

	public void setDateSignature(Date dateSignature) {
		this.dateSignature = dateSignature;
	}

}
