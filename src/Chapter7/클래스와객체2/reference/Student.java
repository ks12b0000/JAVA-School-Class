package Chapter7.클래스와객체2.reference;

public class Student {
	
	String Studentname;
	int Studentid;
	
	
	Subject korea;
	Subject math;
	
	public Student(int id,String name) {
		Studentid = id;
		Studentname = name;
		
		korea = new Subject();
		math = new Subject();
	}
	
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
		
	}
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	public void showStudentScore() {
		int total = korea.score + math.score;
		System.out.println(Studentname+"학생의 총점은"+total+"점 입니다.");
	}
	
}
