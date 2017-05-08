package com.back4app.mongoOperation;

import java.util.ArrayList;

import org.bson.BsonDocument;
import org.bson.Document;

import com.back4app.mongo.MongoDAO;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoOp {

	@SuppressWarnings("finally")
	public static ArrayList<Document> getClientData(int updated_value) {

		try {

			MongoCollection<Document> collection = MongoDAO.getMongoObject();

			BsonDocument filter = BsonDocument.parse("{\"is_updated\" : "+updated_value+"}");
			
			ArrayList<Document> allDocuments = collection.find(filter).into(new ArrayList<Document>());
			
			for(Document document : allDocuments){
				Helpers.printJson(document);
			}
			
			return allDocuments;

		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
		
	}
	
}