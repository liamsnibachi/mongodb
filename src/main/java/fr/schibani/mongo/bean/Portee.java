package fr.schibani.mongo.bean;

public class Portee {

	private Long porId;
	private String type;
	private boolean accreditee;
	private Long conId;
	private Long conNumero;

	public Long getPorId() {
		return porId;
	}

	public void setPorId(Long porId) {
		this.porId = porId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isAccreditee() {
		return accreditee;
	}

	public void setAccreditee(boolean accreditee) {
		this.accreditee = accreditee;
	}

	public Long getConId() {
		return conId;
	}

	public void setConId(Long conId) {
		this.conId = conId;
	}

	public Long getConNumero() {
		return conNumero;
	}

	public void setConNumero(Long conNumero) {
		this.conNumero = conNumero;
	}

}
