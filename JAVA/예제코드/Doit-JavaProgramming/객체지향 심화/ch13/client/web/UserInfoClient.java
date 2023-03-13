package ch13.client.web;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;
import ch13.domain.userinfo.dao.mysql.UserInfoMysqlDao;
import ch13.domain.userinfo.dao.oracle.UserInfoOracleDao;

public class UserInfoClient  {
	
	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("db.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		
		String dbType = prop.getProperty("DBTYPE");
		
		UserInfo userInfo = new UserInfo();
		
		userInfo.setUserId("user01");
		userInfo.setPasswd("12345");
		userInfo.setUserName("James");
		
		UserInfoDao userInfoDao = null;
		
		if(dbType.equals("ORACLE")) {
			userInfoDao = new UserInfoOracleDao();
		}else if (dbType.equals("MySQL")) {
			userInfoDao = new UserInfoMysqlDao();
		}else {
			System.out.println("not support");
		}
		
		if(userInfoDao != null) {
			userInfoDao.insertUserInfo(userInfo);
			userInfoDao.updateUserInfo(userInfo);
			userInfoDao.deleteUserInfo(userInfo);
		}
	}
}
