package Chapter9.배열.array3;

/*
 *  반 수 입력:3
 *  1반의 인원 : 2
 *  1반의 1번의 점수 :90
 *  1반의 2번의 점수 :100
 *  
 *  2반의 인원 : 3
 *  2반의 1번의 점수 :80
 *  2반의 2번의 점수 :89
 *   2반의 3번의 점수 :90
 *   
 *   3반의 인원 : 2
 *   3반의 1번의 점수 :100
 *  3반의 2번의 점수 :80
 *  
 *  반       합계       평균
 *  --------------------------
 *  1반       190       95.0
 *  2반
 *  3반
 *  계
 */

import java.util.Scanner;

public class TwoDArray2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("반 수 입력 : ");
		int A = scan.nextInt();
		
		System.out.println("1반의 인원 :");
		int[] arr = new int[scan.nextInt()];
		System.out.println("1반의 1번의 점수");
		arr[0] = (scan.nextInt());
		System.out.println("1반의 2번의 점수");
		arr[1] = (scan.nextInt());
		System.out.println("2반의 인원 :");
		int[] arr1 = new int[scan.nextInt()];
		System.out.println("2반의 1번의 점수");
		arr1[0] =(scan.nextInt());
		System.out.println("2반의 2번의 점수");
		arr1[1] =(scan.nextInt());
		System.out.println("2반의 3번의 점수");
		arr1[2] =(scan.nextInt());
		System.out.println("3반의 인원 :");
		int[] arr2 = new int[scan.nextInt()];
		System.out.println("3반의 1번의 점수");
		arr2[0] = (scan.nextInt());
		System.out.println("3반의 2번의 점수");
		arr2[1] = (scan.nextInt());
		
		int sum = 0;
		int sum1 = 0;
		int sum2 = 0;
		double avg = 0;
		double avg1 = 0;
		double avg2 = 0;
		System.out.println("반\t합계\t평균");
		System.out.println("==============================================");
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
			avg = sum/arr.length;
		for(int j = 0; j < arr1.length; j++)
			sum1 += arr1[j];
			avg = sum1/arr1.length;
		for(int d = 0; d < arr2.length; d++)
			sum2 += arr2[d];
			avg = sum2/arr2.length;
			
		System.out.printf("&d반\t%d\t%.2f",1,sum,avg);
		System.out.printf("&d반\t%d\t%.2f",2,sum1,avg1);
		System.out.printf("&d반\t%d\t%.2f",3,sum2,avg2);
		
		
		
		scan.close();

	}

}
}