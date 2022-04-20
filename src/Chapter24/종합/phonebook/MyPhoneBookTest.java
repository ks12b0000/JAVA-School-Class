package Chapter24.종합.phonebook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MyPhoneBookTest {
	static Scanner scan = new Scanner(System.in);
	static Map<String, MyPhoneBook> map = new HashMap<>();
	
	
	
	
	public static void main(String[] args) {
		
		int choice;
		while(true) {
			showMenu();
			choice = scan.nextInt();
			scan.nextLine();  //숫자를 입력하고 enter를 입력하기 때문에, 이 처리를 위함.
			switch(choice) {
			case 1 :
				addNumber();
				break;
			case 2 :
				selNumber();
				break;
			case 3 : 
				delNumber();
				break;
			case 4 : 
				System.out.println("프로그램을 종료합니다.");
				return;
			default :
				System.out.println("잘못 입력했습니다.");
				break;
			}
		}

	}





	public static void delNumber() {
		// TODO Auto-generated method stub
		
	}





	public static void selNumber() {
		// TODO Auto-generated method stub
		
	}





	public static void addNumber() {
		//전화번호 정보 입력 받음
		System.out.print("이름 : ");
		String name = scan.nextLine();
		System.out.print("전화번호 : ");
		String phoneNumber = scan.nextLine();
		System.out.print("이메일 : ");
		String email = scan.nextLine();
		
		MyPhoneBook myPhoneBook;
		if(email != null) {
			myPhoneBook = new MyPhoneBook(name, phoneNumber, email);
		}
		else {
			myPhoneBook = new MyPhoneBook(name, phoneNumber);
		}
		myPhoneBook.showInfo();
		
		map.put(name, myPhoneBook);
		System.out.println("맵의 크기 : "+ map.size());
		
	}





	private static void showMenu() {
		System.out.println("[메뉴 선택]");
		System.out.println("1.전화번호 입력");
		System.out.println("2.전화번호 조회");
		System.out.println("3.전화번호 삭제");
		System.out.println("4.종료");
		System.out.print("선택 : ");
		
	}
	
	
}
