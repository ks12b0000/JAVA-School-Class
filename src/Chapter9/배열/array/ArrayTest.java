package Chapter9.배열.array;

public class ArrayTest {

	public static void main(String[] args) {
		
		//score 참조변수 
		int[] score;
		score = new int[5];
		System.out.println("score의 주소값 : "+ score);

		for(int i = 0; i < score.length; i++) {
			System.out.println("score의 ["+i+"] = "+ score[i]);
		}
		System.out.println();
		score[0] = 100;
		for(int i = 0; i < score.length; i++) {
			System.out.println("score의 ["+i+"] = "+ score[i]);
	}
		System.out.println();
		//배열 값을 대입
		
		//for(int i = 0; i < score.length; i++) {
			//score[i] = i + 10;
			
		//}
		for(int i = 0; i < score.length; i++) {
			
			score[i] = i + 20;
			System.out.println("score의 ["+i+"] = "+ score[i]);
		}
	}
}
