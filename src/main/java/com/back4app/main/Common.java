package com.back4app.main;

import java.util.ArrayList;

import org.bson.Document;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.json.JSONException;

import com.back4app.entities.Client;
import com.back4app.entities.Users;
import com.back4app.mongo.MongoDAO;
import com.back4app.mongoOperation.MongoOp;
import com.hibernate.factory.BuildFactory;
import com.hibernate.factory.ClientSQLObjects;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;

public class Common {

	public void createClient(){
		
		ArrayList<Document> getClients = MongoOp.getClientData(1);
		
		System.out.println(getClients.size());
		
		if(getClients.size() > 0){
		
			SessionFactory factory = BuildFactory.getFactory();	
			
			System.out.println(factory);
			
			for(Document client : getClients){
				
				Client sqlClient = new Client();
				Users sqlUsers = new Users();
				
				System.out.println("The client object id outside is : "+client.getString("_id"));
				
				if(client.containsKey("ad_account")){
					
					sqlClient.setAccount_id(client.getString("ad_account"));
					sqlClient.setAd_account(client.getString("ad_account"));
					
				}else{
					sqlClient.setAccount_id("854142334676040");
					sqlClient.setAd_account("854142334676040");
				}
				
				if(client.containsKey("address")){
					
					sqlClient.setAddress(client.getString("address"));
					
				}else{
					sqlClient.setAddress(null);
				}
				
				if(client.containsKey("business_category")){
					
					sqlClient.setBusiness_category(String.valueOf(client.getLong("business_category")));
					
				}else{
					sqlClient.setBusiness_category(null);
				}
				
				if(client.containsKey("business_logo_url")){
					
					sqlClient.setBusiness_logo_url(client.getString("business_logo_url"));
					
				}else{
					sqlClient.setBusiness_logo_url(null);
				}
				
				if(client.containsKey("business_name")){
					
					sqlClient.setCompany_name(client.getString("business_name"));
					
				}else{
					sqlClient.setCompany_name(null);
				}
				
				if(client.containsKey("city")){
					
					Document cityDoc = (Document) client.get("city");
					
					sqlClient.setCity(cityDoc.toJson());
					
				}else{
					sqlClient.setCity("{ \"city1\" : \"New Delhi\", \"city2\" : \"Mumbai\", \"city3\" : \"Bengaluru\", \"city4\" : \"Pune\", \"city5\" : \"Hyderabad\", \"city6\" : \"Chennai\", \"city7\" : \"Ahmedabad\", \"city8\" : \"Indore\", \"city9\" : \"Chandigarh\", \"city10\" : \"Noida\" }");
				}
				
				if(client.containsKey("contact")){
					
					//sqlClient.setMobile_number((new BigInteger(client.getString("contact"))));
					sqlUsers.setContact(client.getString("contact"));
					
				}else{
					//sqlClient.setMobile_number(null);
					sqlUsers.setContact(null);
				}
				
				if(client.containsKey("email")){
					
					sqlUsers.setEmail(client.getString("email"));
					
				}else{
					sqlUsers.setEmail(null);
				}
				
				if(client.containsKey("ext_id")){
					
					sqlClient.setExt_id(client.getString("ext_id"));
					
				}else{
					sqlClient.setExt_id(null);
				}
				
				if(client.containsKey("fb_page_access")){
					
					sqlClient.setIs_facebook_access_granted(client.getString("fb_page_access"));
					
				}else{
					sqlClient.setIs_facebook_access_granted(null);
				}
				
				if(client.containsKey("fb_page_id")){
					
					sqlClient.setFb_page_id(client.getString("fb_page_id"));
					
				}else{
					sqlClient.setFb_page_id(null);
				}
				
				if(client.containsKey("fb_page_url")){
					
					sqlClient.setFb_page_url(client.getString("fb_page_url"));
					
				}else{
					sqlClient.setFb_page_url(null);
				}
				
				if(client.containsKey("gender")){
					
					sqlClient.setGender(client.getString("gender"));
					
				}else{
					sqlClient.setGender("Both");
				}
				
				if(client.containsKey("instagram_id")){
					
					sqlClient.setInstagram_id(client.getString("instagram_id"));
					
				}else{
					sqlClient.setInstagram_id(null);
				}
				
				if(client.containsKey("is_responsive")){
					
					sqlClient.setIs_responsive(String.valueOf(client.getLong("is_responsive")));
					
				}else{
					sqlClient.setIs_responsive(null);
				}
				
				if(client.containsKey("is_ssl_enabled")){
					
					sqlClient.setIs_ssl_enabled(String.valueOf(client.getLong("is_ssl_enabled")));
					
				}else{
					sqlClient.setIs_ssl_enabled(null);
				}
				
				if(client.containsKey("is_updated")){
					
					sqlClient.setIs_updated(client.getInteger("is_updated"));
					
				}else{
					sqlClient.setIs_updated(1);
				}
				
				if(client.containsKey("is_updated_adset")){
					
					sqlClient.setIs_updated_adset(client.getInteger("is_updated_adset"));
					
				}else{
					sqlClient.setIs_updated_adset(0);
				}
				
				if(client.containsKey("max_age")){
					
					sqlClient.setMax_age(client.getInteger("max_age"));
					
				}else{
					sqlClient.setMax_age(65);
				}
				
				if(client.containsKey("min_age")){
					
					sqlClient.setMin_age(client.getInteger("min_age"));
					
				}else{
					sqlClient.setMin_age(18);
				}
				
				if(client.containsKey("meta_data")){
					
					sqlClient.setMeta_data(client.getString("meta_data"));
					
				}else{
					sqlClient.setMeta_data(null);
				}
				
				if(client.containsKey("name")){
					
					sqlUsers.setName(client.getString("name"));
					
				}else{
					sqlUsers.setName(null);
				}
				
				if(client.containsKey("_id")){
					System.out.println("The Object ID is : "+client.getString("_id"));
					sqlClient.setObject_id(client.getString("_id"));
				}else{
					sqlClient.setObject_id(null);
				}
				
				if(client.containsKey("partner")){
					
					sqlClient.setPartner(client.getString("partner"));
					
				}else{
					sqlClient.setPartner(null);
				}
				
				if(client.containsKey("referrer")){
					
					sqlClient.setReferrer(client.getString("referrer"));
					
				}else{
					sqlClient.setReferrer(null);
				}
				
				if(client.containsKey("website")){
					
					sqlClient.setWebsite(client.getString("website"));
					
				}else{
					sqlClient.setWebsite(null);
				}
				
				if(client.containsKey("_created_at")){
					
					sqlClient.setDatetime(client.getDate("_created_at"));
					
				}else{
					sqlClient.setDatetime(null);
				}
				
				if(client.containsKey("_updated_at")){
					
					sqlClient.setUpdated_at(client.getDate("_updated_at"));
					
				}else{
					sqlClient.setUpdated_at(null);
				}
				
				Session session = BuildFactory.getFactory().openSession();
				session.beginTransaction();
		
				System.out.println("Session Value is : " + session);
				
				System.out.println(sqlClient.toValueString());
				
				int client_id = (Integer) session.save(sqlClient);
				
				System.out.println("Client ID created is : "+client_id);
				
				int user_id = 0;
				
				if(client_id == 0){
					continue;
				}
				else{
					sqlUsers.setClient_id(client_id);
					
					user_id = (Integer) session.save(sqlUsers);
					
					System.out.println("User ID created is : "+user_id);
				}
				
				if(user_id == 0){
					session.getTransaction().rollback();
					session.close();
					continue;
				}
				
				session.getTransaction().commit();
				session.close();
				
				MongoDAO.collection.updateOne(Filters.eq("_id", client.getString("_id")), Updates.set("is_updated", 0));
			
				System.out.println("The client with object ID : "+client.getString("_id")+" is successfully created.");
			
			}
			
		}else{
			System.out.println("No Creation is requested in Parse.");
		}
			
	}
	
	public void updateClient() throws JSONException{
		
		System.out.println("Inside the update client 1..");
		
		ArrayList<Document> getClients = MongoOp.getClientData(2);
		
		if(getClients.size() > 0){
		
			for(Document client : getClients){
				
				System.out.println("The updated Parse Object ID is : "+client.getString("_id"));
				
				if(null != ClientSQLObjects.getClientWithObjectID(client.getString("_id"))){				
				
					Client sqlClient = ClientSQLObjects.getClientWithObjectID(client.getString("_id"));
				
					System.out.println("Client ID fetched for Object ID : "+client.getString("_id")+" is : "+sqlClient.getId());
	
					Users sqlUsers = ClientSQLObjects.getUserWithClientID(sqlClient.getId());
					
					System.out.println("User ID fetched for Client ID : "+sqlClient.getId()+" is : "+sqlUsers.getId());
					
					if(client.containsKey("ad_account")){
						
						sqlClient.setAccount_id(client.getString("ad_account"));
						sqlClient.setAd_account(client.getString("ad_account"));
						
					}
					
					if(client.containsKey("address")){
						
						sqlClient.setAddress(client.getString("address"));
						
					}else{
						sqlClient.setAddress(null);
					}
					
					if(client.containsKey("business_category")){
						
						sqlClient.setBusiness_category(String.valueOf(client.getLong("business_category")));
						
					}else{
						sqlClient.setBusiness_category(null);
					}
					
					if(client.containsKey("business_logo_url")){
						
						sqlClient.setBusiness_logo_url(client.getString("business_logo_url"));
						
					}else{
						sqlClient.setBusiness_logo_url(null);
					}
					
					if(client.containsKey("business_name")){
						
						sqlClient.setCompany_name(client.getString("business_name"));
						
					}else{
						sqlClient.setCompany_name(null);
					}
					
					if(client.containsKey("city")){
					
						Document cityDoc = (Document) client.get("city");
						
						sqlClient.setCity(cityDoc.toJson());
						
					}
					
					if(client.containsKey("contact")){
						
						//sqlClient.setMobile_number((new BigInteger(client.getString("contact"))));
						sqlUsers.setContact(client.getString("contact"));
						
					}else{
						//sqlClient.setMobile_number(null);
						sqlUsers.setContact(null);
					}
					
					if(client.containsKey("email")){
						
						sqlUsers.setEmail(client.getString("email"));
						
					}else{
						sqlUsers.setEmail(null);
					}
					
					if(client.containsKey("ext_id")){
						
						sqlClient.setExt_id(client.getString("ext_id"));
						
					}else{
						sqlClient.setExt_id(null);
					}
					
					if(client.containsKey("fb_page_access")){
						
						sqlClient.setIs_facebook_access_granted(client.getString("fb_page_access"));
						
					}else{
						sqlClient.setIs_facebook_access_granted(null);
					}
					
					if(client.containsKey("fb_page_id")){
						
						sqlClient.setFb_page_id(client.getString("fb_page_id"));
						
					}else{
						sqlClient.setFb_page_id(null);
					}
					
					if(client.containsKey("fb_page_url")){
						
						sqlClient.setFb_page_url(client.getString("fb_page_url"));
						
					}else{
						sqlClient.setFb_page_url(null);
					}
					
					if(client.containsKey("gender")){
						
						sqlClient.setGender(client.getString("gender"));
						
					}
					
					if(client.containsKey("instagram_id")){
						
						sqlClient.setInstagram_id(client.getString("instagram_id"));
						
					}else{
						sqlClient.setInstagram_id(null);
					}
					
					if(client.containsKey("is_responsive")){
						
						sqlClient.setIs_responsive(String.valueOf(client.getLong("is_responsive")));
						
					}else{
						sqlClient.setIs_responsive(null);
					}
					
					if(client.containsKey("is_ssl_enabled")){
						
						sqlClient.setIs_ssl_enabled(String.valueOf(client.getLong("is_ssl_enabled")));
						
					}else{
						sqlClient.setIs_ssl_enabled(null);
					}
					
					if(client.containsKey("is_updated")){
						
						sqlClient.setIs_updated(1);
						
					}else{
						sqlClient.setIs_updated(1);
					}
					
					if(client.containsKey("is_updated_adset")){
						
						sqlClient.setIs_updated_adset(client.getInteger("is_updated_adset"));
						
					}else{
						sqlClient.setIs_updated_adset(0);
					}
					
					if(client.containsKey("max_age")){
						
						sqlClient.setMax_age(client.getInteger("max_age"));
						
					}
					
					if(client.containsKey("min_age")){
						
						sqlClient.setMin_age(client.getInteger("min_age"));
						
					}
					
					if(client.containsKey("meta_data")){
						
						sqlClient.setMeta_data(client.getString("meta_data"));
						
					}else{
						sqlClient.setMeta_data(null);
					}
					
					if(client.containsKey("name")){
						
						sqlUsers.setName(client.getString("name"));
						
					}else{
						sqlUsers.setName(null);
					}
					
					if(client.containsKey("partner")){
						
						sqlClient.setPartner(client.getString("partner"));
						
					}else{
						sqlClient.setPartner(null);
					}
					
					if(client.containsKey("referrer")){
						
						sqlClient.setReferrer(client.getString("referrer"));
						
					}else{
						sqlClient.setReferrer(null);
					}
					
					if(client.containsKey("website")){
						
						sqlClient.setWebsite(client.getString("website"));
						
					}else{
						sqlClient.setWebsite(null);
					}
					
					if(client.containsKey("_updated_at")){
						
						sqlClient.setUpdated_at(client.getDate("_updated_at"));
						
					}else{
						sqlClient.setUpdated_at(null);
					}
		
					Session session = BuildFactory.getFactory().openSession();
					session.beginTransaction();
					
					session.saveOrUpdate(sqlClient);
					session.saveOrUpdate(sqlUsers);
					
					session.getTransaction().commit();
					session.close();
					
					MongoDAO.collection.updateOne(Filters.eq("_id", client.getString("_id")), Updates.combine(Updates.set("is_updated", 0), Updates.set("is_updated_adset", 0)));
					
					System.out.println("The client with object ID : "+client.getString("_id")+" is successfully created.");
					
				}
				else{
					
					System.out.println("Some Issue: The client with object ID : "+client.getString("_id")+" is not updated successfully.");
					
				}
			}
		}else{
			System.out.println("No Updation is there in the Parse Client Table.");
		}
	}
}