package Chapter13.추상클래스와인터페이스.domain.userinfo.dao.oracle;

import Chapter13.추상클래스와인터페이스.domain.userinfo.UserInfo;
import Chapter13.추상클래스와인터페이스.domain.userinfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("insert into Oracle DB userId = "+ userInfo.getUserId());
		
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("update into Oracle DB userId = "+ userInfo.getUserId());
		
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("delete into Oracle DB userId = "+ userInfo.getUserId());
		
	}

}
