package Chapter24.종합.phonebook;

import java.io.Serializable;

// 인터페이스 추가하여 직렬화 기능에 의해 저장될 수 있음.
public class MyPhoneBook implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3792117339985323112L;
	String name;
	String phoneNumber;
	String email;
	
	public MyPhoneBook(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	public MyPhoneBook(String name, String phoneNumber,String email) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	public void showInfo() {
		System.out.println("Name : "+ name);
		System.out.println("PhoneNumber : "+ phoneNumber);
		if(email != null)
			System.out.println("Email : "+ email);
		System.out.println();
	}
	
}
