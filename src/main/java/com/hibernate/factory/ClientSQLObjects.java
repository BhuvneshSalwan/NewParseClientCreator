package com.hibernate.factory;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Expression;

import com.back4app.entities.Client;
import com.back4app.entities.Users;

public class ClientSQLObjects {

	public static Client getClientWithObjectID(String objectId){
	
		Session session = BuildFactory.getFactory().openSession();
		session.beginTransaction();
		
		Criteria criteria = session.createCriteria(Client.class);
		criteria.add(Expression.eq("object_id", objectId));
		List<Client> client = criteria.list();
		
		session.getTransaction();
		session.close();
		
		if(client.size() > 0 && client.size() < 2){
			return client.get(0);
		}
		else{
			return null;
		}
	}
	
	public static Users getUserWithClientID(int client_id){
		
		Session session = BuildFactory.getFactory().openSession();
		session.beginTransaction();
		
		Criteria criteria = session.createCriteria(Users.class);
		criteria.add(Expression.eq("client_id", client_id));
		List<Users> users = criteria.list();
		
		session.getTransaction();
		session.close();
		
		if(users.size() > 0 && users.size() < 2){
			return users.get(0);
		}
		else{
			return null;
		}
	}
}