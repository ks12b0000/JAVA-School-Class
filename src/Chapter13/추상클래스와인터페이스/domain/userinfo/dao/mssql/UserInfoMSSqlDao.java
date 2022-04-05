package Chapter13.추상클래스와인터페이스.domain.userinfo.dao.mssql;

import Chapter13.추상클래스와인터페이스.domain.userinfo.UserInfo;
import Chapter13.추상클래스와인터페이스.domain.userinfo.dao.UserInfoDao;

public class UserInfoMSSqlDao implements UserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("insert into MSSql DB userId = "+ userInfo.getUserId());
		
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("update into MSSql DB userId = "+ userInfo.getUserId());
		
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("delete into MSSql DB userId = "+ userInfo.getUserId());
		
	}

}
