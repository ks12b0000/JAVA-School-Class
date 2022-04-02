package Chapter9.배열.array;

import java.util.Arrays;

public class ArrayTest3 {

	public static void main(String[] args) {
		
		int[] A = new int[10];
		for(int i = 0; i < A.length; i++) {
			A[i] = (int)(Math.random()*A.length)+1;
			
		}System.out.println(Arrays.toString(A));
		
		int[] B = {1,2,3,4,5,6,};
		for(int C : B ) {
			System.out.println(C);
		}
	}

}
