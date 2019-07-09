package com.visa.prj.dao;

import java.util.ResourceBundle;

public class MobileDaoFactory {

	private static String Name = "";
	
	static
	{
		ResourceBundle res = ResourceBundle.getBundle("config");
		Name = res.getString("MOBILE_DAO").trim();
	}
	
	public static MobileDao getMobileDao() 
	{
		// TODO Auto-generated method stub
		//return new MobileDaoMongoImpl();
		try {
			return(MobileDao) Class.forName(Name).newInstance();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return null;
	}

}
