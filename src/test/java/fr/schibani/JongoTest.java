package fr.schibani;

import org.jongo.Jongo;
import org.jongo.MongoCollection;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mongodb.DB;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;

import fr.schibani.mongo.bean.Client;

public class JongoTest {

	MongoCollection collection;

	@Before
	public void setUp() throws Exception {
		Mongo mongo = new MongoClient(new ServerAddress("localhost", 27017));
		DB db = mongo.getDB("paco");
		Jongo jongo = new Jongo(db);
		collection = jongo.getCollection("clients");
	}
	
	@Test
	public void testInsertClient() throws Exception {
		Mongo mongo = new MongoClient(new ServerAddress("localhost", 27017));
		DB db = mongo.getDB("paco");
		Jongo jongo = new Jongo(db);
		MongoCollection collection = jongo.getCollection("clients");
		collection.drop();
		Iterable<Client> as = collection.find("{raisonSocial: {$regex: #}}", ".*").as(Client.class);
		
		int i = 0;
		for (Client client : as) {
			System.out.println(client.getAdresse1());
			i++;
		}
		System.out.println("i = " + i);
	}
	
	@After
	public void tearDown() {
		collection.drop();
	}
}
