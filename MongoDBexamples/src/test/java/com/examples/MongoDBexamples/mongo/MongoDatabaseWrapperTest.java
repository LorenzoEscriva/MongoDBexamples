package com.examples.MongoDBexamples.mongo;

import com.examples.MongoDBexamples.common.AbstractMongoDatabaseWrapperTest;
import com.github.fakemongo.Fongo;
import com.mongodb.MongoClient;

public class MongoDatabaseWrapperTest extends AbstractMongoDatabaseWrapperTest {
	@Override
	public MongoClient createMongoClient() {
		Fongo fongo = new Fongo("mongo server 1");
		MongoClient mongoClient = fongo.getMongo();
		return mongoClient;
	}
}