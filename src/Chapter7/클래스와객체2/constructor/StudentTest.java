package Chapter7.클래스와객체2.constructor;

public class StudentTest {

	public static void main(String[] args) {
		Student st = new Student();
		System.out.println(st.getName());
		System.out.println(st.getAge());
		
		//매개변수가 있는 생성자 호출
		Student st2 = new Student("이순신", 30);
		System.out.println(st2);
		
		//매개변수가 String만 있는 생성자 호출
		Student st3 = new Student("이방원");
		System.out.println(st3);
		
		//매개변수가 int만 있는 생성자 호출
		Student st4 = new Student(40);
		System.out.println(st4);
		
		

	}

}
