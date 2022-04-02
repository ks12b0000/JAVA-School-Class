package Chapter10.컬렉션프레임워크1.arraylist3;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student("이순신", 2022);
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 90);
		
		Student studentShin = new Student("신사임당",2022);
		studentShin.addSubject("국어", 90);
		studentShin.addSubject("수학", 99);
		studentShin.addSubject("영어", 91);
		
		studentLee.showInfo();
		System.out.println();
		studentShin.showInfo();

	}

}
