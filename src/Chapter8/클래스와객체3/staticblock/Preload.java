package Chapter8.클래스와객체3.staticblock;

/*
 * 인스턴스 생성과 관계없이
 * static 변수가 메모리 공간에 할당될 때 실행됨.
 */
import java.util.Random;

public class Preload {

	static int num;       // 클래스 변수, static 맴버 변수, 전역 변수, 공유 변수
	
	//static 초기화 블록
	//main() 실행 전에 이미 난숫값이 대입 됨.
	static {
		Random random = new Random();
		num = random.nextInt(100);     // 100을 매개변수로 넣어주면 0~99사이에서 임의의 숫자를 반환함.
		
	}

	public static void main(String[] args) {
		System.out.println(num);
	}
}
