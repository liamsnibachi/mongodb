package fr.schibani.mongo.bean;

import org.bson.types.ObjectId;

import com.github.jmkgreen.morphia.annotations.Id;

public class Client {

	@Id
	private ObjectId cliId;
	private String raisonSociale;
	
}
