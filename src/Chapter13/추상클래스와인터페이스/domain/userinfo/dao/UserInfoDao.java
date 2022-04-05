package Chapter13.추상클래스와인터페이스.domain.userinfo.dao;

import Chapter13.추상클래스와인터페이스.domain.userinfo.UserInfo;

public interface UserInfoDao {
	
	void insertUserInfo(UserInfo userInfo);
	void updateUserInfo(UserInfo userInfo);
	void deleteUserInfo(UserInfo userInfo);
	
	
	
	
	

}
