package Chapter13.추상클래스와인터페이스.userinfo.web;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import Chapter13.추상클래스와인터페이스.domain.userinfo.UserInfo;
import Chapter13.추상클래스와인터페이스.domain.userinfo.dao.UserInfoDao;
import Chapter13.추상클래스와인터페이스.domain.userinfo.dao.mssql.UserInfoMSSqlDao;
import Chapter13.추상클래스와인터페이스.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import Chapter13.추상클래스와인터페이스.domain.userinfo.dao.oracle.UserInfoOracleDao;

public class UserInfoTest {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("db.properties");
		
		Properties properties = new Properties();
		properties.load(fis);
		
		String dbType = properties.getProperty("DBTYPE");
		
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId("ezen");
		userInfo.setPasswd("0824");
		userInfo.setUserName("이순신");
		
		UserInfoDao userInfoDao = null;
		
		
		if(dbType.equals("ORACLE")) {
			userInfoDao = new UserInfoOracleDao();			
		}
		else if(dbType.equals("MYSQL")) {
			userInfoDao = new UserInfoMySqlDao();
		}
		else if(dbType.equals("MSSQL")) 
			userInfoDao = new UserInfoMSSqlDao();
		else {
			System.out.println("db support error");
			return;
		}
		userInfoDao.insertUserInfo(userInfo);
		userInfoDao.updateUserInfo(userInfo);
		userInfoDao.deleteUserInfo(userInfo);
	}

}
