package Chapter8.클래스와객체3.collabration2; 

public class Student {
	String studentName;
	int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	public void taketaxi(Taxi taxi) {
		taxi.take(10000);
		this.money -= 10000;
	}
	public void studentInfo() {
		System.out.println(studentName+"님의 남은 돈은"+money+"원 입니다.");
	}
		
	
	
}
