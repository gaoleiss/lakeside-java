package com.lakeside.data.mongodb;

import com.lakeside.data.mongo.MongoDbSnapshot;



public class MongoDbSnapshotTest {

	public void test() {
		String output= "D:\\temp\\mongodump-test";
		String host= "172.18.109.20";
		String database= "tencentUserRelationNew";
		
		MongoDbSnapshot db = new MongoDbSnapshot(output, host, database,"users");
		db.start();
	}

}
