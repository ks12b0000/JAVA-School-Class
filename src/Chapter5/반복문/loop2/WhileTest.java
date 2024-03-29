package Chapter5.반복문.loop2;

public class WhileTest {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 1;
		/*
		 * while문 옆에 조건식만 들어간다.
		 * for문에 비해서 일반적 반복에서는 가독성이 떨어진다.
		 */
		while(i <= 100) {
			sum += i;
			i++;
		}System.out.println("1~100까지의 합 : "+ sum);
		System.out.println();
		
		/*
		 * while문은 무한루프용으로 많이 사용함.
		 * if()문 break문과 함께 무한루프를 벗어날 코드를 작성해 주는게 맞음.
		 */
		int j = 1;
		while(true) {
			System.out.println(j);
			if(j>=100) {
				break;
			}j++;
		}

	}

}
