package Chapter5.반복문.loop2;

public class ContinueTest {

	public static void main(String[] args) {
		//1~100까지 사이에서 홀수만 출력하는 프로그램.
		for(int i = 1; i <= 100; i++) {
			if((i%2) != 0) {
				continue;     //continue문은 뒷문장은 실행하지 않고 바로 증감식으로 이동함.
			}System.out.println("짝수 : "+i);
		}
		
		//2와 3의 공배수만 출력하시오.
		
		for(int j = 1; j <= 100; j++) {
			if((j%2) == 0 && (j%3) == 0) {
				System.out.println("2와 3의 공배수 : " +j);
			}
		}

	}

}
