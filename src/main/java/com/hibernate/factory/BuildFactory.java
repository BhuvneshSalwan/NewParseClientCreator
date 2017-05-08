package com.hibernate.factory;

import java.io.File;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class BuildFactory {

	private static SessionFactory factory = null;
	
	public static SessionFactory getFactory(){
		
		if(null == factory){
			String hibernatePropsFilePath = "C://Users//bhuvnesh//Eclipse_Workspace//Xplanck//Core//ParseClientCreator//src//main//resources//hibernate.cfg.xml";
			
			File hibernatePropsFile = new File(hibernatePropsFilePath);

			factory = new Configuration().configure(hibernatePropsFile).buildSessionFactory();
			
			return factory;
		}
		else{
			return factory;
		}
		
	}
	
}
