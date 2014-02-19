package fr.schibani.mongo.bean;

import org.bson.types.ObjectId;

import com.github.jmkgreen.morphia.annotations.Id;

public class Adresse {

	@Id
	private ObjectId id;
	private String adresse1;
	private String adresse2;
}
