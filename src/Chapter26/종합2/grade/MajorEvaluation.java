package Chapter26.종합2.grade;

/*
 * 필수과목 학점 기준
 *     S,     A,     B,     C,     D,    F
 *     -----------------------------------
 *     95~100 90~94 80~89 70~79   60~69  60점 미만
 */

public class MajorEvaluation implements GradeEvaluation {

	@Override
	public String getGrade(int score) {
		String grade;
		
		if(score >= 95 && score <= 100)
			grade = "S";
		else if(score >= 90 && score >= 94)
			grade = "A";
		else if(score >= 80 && score >= 89)
			grade = "B";
		else if(score >= 70 && score >= 79)
			grade = "C";
		else if(score >= 60 && score >= 69)
			grade = "D";
		else
			grade = "F";
		return grade;
		
	}

}
