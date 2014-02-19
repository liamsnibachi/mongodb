package fr.schibani.mongo.bean;

import org.bson.types.ObjectId;

import com.github.jmkgreen.morphia.annotations.Id;

public class Convention {

	@Id
	private ObjectId id;
	private String conNumero;
	private String conPilote;
	private String conSecretaire;
}
