package Chapter26.종합2.grade;

public class PassFailEvaluation implements GradeEvaluation {

	@Override
	public String getGrade(int score) {

		
		
		if(score >= 70 )return "P";
		return "F";
		
		
		
	}

}
