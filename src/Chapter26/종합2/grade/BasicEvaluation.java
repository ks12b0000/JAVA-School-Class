package Chapter26.종합2.grade;

public class BasicEvaluation implements GradeEvaluation {

	@Override
	public String getGrade(int score) {
		
		if(score > 89 && score < 100) {
			System.out.println("A");
		}
		
		return null;
	}

}
