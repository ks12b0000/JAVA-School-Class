package Chapter4.조건문.decision2;

public class SwitchTest {

	public static void main(String[] args) {
		
		int score = 91;
		
		switch(score) {
			case 95 :
				System.out.println("95점 입니다.");
				break;
			case 94 :
				System.out.println("94점 입니다.");
				break;
			case 93 :
				System.out.println("93점 입니다.");
				break;
				default : 
					System.out.println("잘못된 값입니다.");
		}

	}

}
