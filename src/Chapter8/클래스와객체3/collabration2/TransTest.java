package Chapter8.클래스와객체3.collabration2;

public class TransTest {

	public static void main(String[] args) {
		Student studentLee = new Student("이순신",20000);
		
		Taxi taxi1 = new Taxi("Ezen운수택시");
		
		studentLee.taketaxi(taxi1);
		
		studentLee.studentInfo();
		taxi1.taxiInfo();
		
	}
	

}
