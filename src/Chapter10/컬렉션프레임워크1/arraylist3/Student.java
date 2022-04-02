package Chapter10.컬렉션프레임워크1.arraylist3;

import java.util.ArrayList;

public class Student {
	
	String studentName;
	int studentID;
	ArrayList<Subject> subjectList;
	
	public Student(String studentName, int studentID) {
		
		this.studentName = studentName;
		this.studentID = studentID;
		subjectList = new ArrayList<>();
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);;
		subject.setScorePoint(score);;
		subjectList.add(subject);
	}
	
	public void showInfo() {
		int total = 0;
		for(Subject subject : subjectList) {
			total  += subject.getScorePoint();
			System.out.println("학생 "+studentName+"의 "+ subject.getName()+"과목 성적은"+
								subject.getScorePoint());
		}
		
		System.out.println("학생 "+studentName+"의 총점은"+total+"입니다.");
	}
	
	
	
	
	
}
