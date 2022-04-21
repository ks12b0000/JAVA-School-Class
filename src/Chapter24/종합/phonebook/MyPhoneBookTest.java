package Chapter24.종합.phonebook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MyPhoneBookTest {
	static Scanner scan = new Scanner(System.in);
	static Map<String, MyPhoneBook> map = new HashMap<>();
	
	
	
	
	public static void main(String[] args) {
		readInfo();
		
		int choice;
		while(true) {
			showMenu();
			choice = scan.nextInt();
			scan.nextLine();  //숫자를 입력하고 enter를 입력하기 때문에, 이 처리를 위함.
			switch(choice) {
			case 0 :
				showPhoneBook();
				break;
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
				saveInfo();		// 프로그램 종료 시 연락처 저장
				System.out.println("프로그램을 종료합니다.");
				return;
			default :
				System.out.println("잘못 입력했습니다.");
				break;
			}
		}

	}




	public static void showPhoneBook() {
		Set<String> ks = map.keySet();
		for(String s : ks) {
			map.get(s).showInfo();
		}
	}




	//프로그램 시작 시 연락처 로드
	public static void readInfo() {
		
		try(ObjectInputStream oi = 					//파일에서 객체를 읽어들임
				new ObjectInputStream(new FileInputStream("Object.bin"))){
			
			while(true) {
				MyPhoneBook myPhoneBook = (MyPhoneBook) oi.readObject();
				if(myPhoneBook == null)
					return;
				map.put(myPhoneBook.name, myPhoneBook);
			}
			
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println(e);
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			//e.printStackTrace();
			System.out.println(e);
		}
		
	}





	public static void saveInfo() {
		try(ObjectOutputStream oo =				//해시맵에 있는 정보를 파일을 만들고 파일에 저장. 
				new ObjectOutputStream(new FileOutputStream("Object.bin"))){
			//해시멥에 있는 키 값을 가져옴.
			Set<String> ks = map.keySet();
			for(String s : ks) {
				MyPhoneBook myPhoneBook = map.get(s);    //키값 이용해서 모든 해시에 저장된 값들을 가져옴.
				oo.writeObject(myPhoneBook);             //가져온 myPhoneBook 객체를 파일에 저장
			
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e);
		}
		
	}





	public static void delNumber() {
		System.out.print("삭제할 이름 : ");
		String name = scan.nextLine();
		
		MyPhoneBook myPhoneBook = map.remove(name);
		if(myPhoneBook != null) {
			System.out.println("삭제되었습니다.");
		}
		else {
			System.out.println("해당 값이 없습니다.");
		}
	}





	public static void selNumber() {
		System.out.print("조회할 이름 : ");
		String name = scan.nextLine();
		
		MyPhoneBook myPhoneBook = map.get(name);
		if(myPhoneBook == null) {
			System.out.println("해당 값이 없습니다.");
		}
		else 
		myPhoneBook.showInfo();
		
		
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
		if(email != null ) {
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
		System.out.println("0.전화번호 내용출력");
		System.out.println("1.전화번호 입력");
		System.out.println("2.전화번호 조회");
		System.out.println("3.전화번호 삭제");
		System.out.println("4.종료");
		System.out.print("선택 : ");
		
	}
	
	
}
