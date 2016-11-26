package com.examples.MongoDBexamples.IT;

import java.net.UnknownHostException;
import com.examples.MongoDBexamples.common.AbstractMongoDatabaseWrapperTest;
import com.mongodb.MongoClient;

public class MongoDatabaseWrapperIT extends AbstractMongoDatabaseWrapperTest {

	@Override
	public MongoClient createMongoClient() throws UnknownHostException {
		MongoClient mongoClient = new MongoClient();
		return mongoClient;
	}

}
