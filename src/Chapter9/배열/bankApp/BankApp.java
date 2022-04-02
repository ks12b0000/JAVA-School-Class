package Chapter9.배열.bankApp;

import java.util.Scanner;

public class BankApp {

	//배열100개 정적멤버 
	private static Account[] accountsArray = new Account[100];
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean run = true;
		while(run) {
			System.out.println("-------------------------------------");
			System.out.println("1. 계좌생성  | 2. 계좌목록  |  3. 예금하기  | 4. 출금하기  | 5. 종료하기");
			System.out.println("-------------------------------------");
			System.out.println("선택> ");
			
			int choice = scan.nextInt();
			
			if(choice == 1) {
				createAccount();
			}else if(choice == 2) {
				accountList();
			}else if(choice == 3) {
				deposite();
			}else if(choice == 4) {
				withdraw();
			}else if(choice == 5) {
				System.out.println("계좌관리 프로그램을 종료합니다.");
				run = false;
			}
			else {
				System.out.println("잘못 입력했습니다.");
			}
		}
		

	}


		
	
	//출금하기
	private static void withdraw() {
		System.out.println("--------");
		System.out.println("출금");
		System.out.println("--------");
		System.out.print("계좌번호: ");
		String ano = scan.next();
		System.out.print("출금액: ");
		int money = scan.nextInt();
		
		Account account = findAccount(ano);

		if(account == null) {
			System.out.println("결과 : 계좌가 없습니다. 확인 바랍니다.");
			return;
		}
		account.setBalance(account.getBalance() - money);
		System.out.println("결과 : 출금이 성공했습니다. 현재잔액 : "+account.getBalance());
		
	}
	//계좌목록 출력하기
	private static void accountList() {
		 
		        System.out.println("------");
		        System.out.println("계좌목록");
		        System.out.println("------");
		    
		        for(int i=0; i<accountsArray.length; i++) {
//		        	if (accountsArray[i] == null) {
//						break;
//					}
//		            System.out.println(accountsArray[i].getAno() + "     " + accountsArray[i].getOwner() + "     " + accountsArray[i].getBalance());
		        Account account = accountsArray[i];
		        
		        //계좌에 대한에 내용이 존재한다면
		        if(account != null) {
		        	System.out.print(account.getAno());
		        	System.out.print("\t");
		        	System.out.print(account.getOwner());
		        	System.out.print("\t");
		        	System.out.print(account.getBalance());
		        	System.out.println();
		        }
		        }
		    }
		
	
	//예금하기
	private static void deposite() {
		System.out.println("--------");
		System.out.println("예금을 합니다.");
		System.out.println("--------");
		System.out.print("계좌번호 입력 : ");
		String ano = scan.next();
		System.out.print("예금액 : ");
		int money = scan.nextInt();
		Account account = findAccount(ano);
		
		if(account == null) {
			System.out.println("결과 : 계좌가 없습니다. 확인 바랍니다.");
			return;
		}
		account.setBalance(account.getBalance() + money);
		System.out.println("결과 : 예금이 성공했습니다. 현재 잔액 : "+ account.getBalance());
		
		
		//계좌찾기
		
		//예금하기(setBalance())
	}
	
	
	private static Account findAccount(String ano) {
		
		Account account = null;
		for(int i = 0; i < accountsArray.length; i++) {
			if(accountsArray[i] != null) {
				//매개변수로 넘어온 계좌번호와 동일하다면 
				if(accountsArray[i].getAno().equals(ano)) {
					account = accountsArray[i];
					break;
				}
			}
		}
		
		return account;
	}
		


	//계좌생성
	private static void createAccount() {
		System.out.println("----------------------------");
		System.out.println("계좌를 생성합니다.");
		System.out.println("----------------------------");
		
		System.out.print("계좌 번호 : ");
		/*
		 * next()	: 한단어를 입력받았을 때 용이한 메서드(공백을 발견하면 그 앞까지만 String으로 리턴)
		 * nextLine()	: 한문장이나 한줄을 입력받을 때 용이한 메서드
		 */
		String ano = scan.next();
		
		System.out.print("계좌주 : ");
		String owner = scan.next();
		
		System.out.print("초기 입금액 : ");
		int balance = scan.nextInt();
		
		Account newAccount = new Account(ano, owner, balance);
		for(int i = 0; i <accountsArray.length; i++) {
			if(accountsArray[i]==null) {
				accountsArray[i] = newAccount;
				System.out.println("결과 : 계좌 생성 완료되었습니다.");
//				System.out.println(accountsArray[i].getAno()+","+
//									accountsArray[i].getOwner()+","+
//									accountsArray[i].getBalance());
				break;
			}
		}
	}
		
	}

