package Chapter9.배열.array;

public class ArrayTest2 {

	public static void main(String[] args) {
		int sum = 0;
		double A = 0;
		
		int[] score = {100,100,100,100};
		System.out.println("배열의 크기 : "+score.length);
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
			//sum = sum+score[i];
			A = sum/score.length;
		}
		
		System.out.println("총점 : "+ sum);
		System.out.println("평균 : "+ A);
	}
	
}
