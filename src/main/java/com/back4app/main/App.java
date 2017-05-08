package com.back4app.main;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import com.back4app.mongo.MongoDAO;

public class App{

	public static void main(String arg[]){
		
//		TimerTask tasknew = new App();
//		
//		Timer timer = new Timer();
//		timer.schedule(tasknew, new Date(), 1000*60*5);
		
//	}

//	@Override
//	public void run() {
		
		Common common = new Common();
		
		common.createClient();
		try{
			Thread.sleep(10000);
		}catch(Exception e){
			System.out.println(e);
		}
		try{
		common.updateClient();
		}catch(Exception e){
			System.out.println(e);
		}
		MongoDAO.database = null;
		MongoDAO.collection = null;
		MongoDAO.client.close();
		
//	}
	}
}
