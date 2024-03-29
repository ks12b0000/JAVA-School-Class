package Chapter4.조건문.decision3;

public class RandomTest {

	public static void main(String[] args) {
		//Math.random() : 0.0000000~0.9999999사의의 값을 발생시킴
		System.out.println(Math.random());

		//주사위 숫자 랜덤하게 발생
		//int num = (int)(Math.random()*6);    //0~5
		int num = (int)(Math.random()*6)+1;  //1~6까지 범위 수를 발생	
		//int num=(int)(Math.random()*45)+1;     //로또 :1~45까지의 숫자 중 6개를 맞히면 됨
		System.out.println(num);
		
		if(num == 1) {
			System.out.println("1이 나왔네요!");
		}else if(num == 2) {
			System.out.println("2가 나왔네요!");
		}else if(num == 3) {
			System.out.println("3이 나왔네요!");
		}else if(num == 4 ) {
			System.out.println("4가 나왔네요!");
		}else if(num == 5) {
			System.out.println("5가 나왔네요!");
		}else  {
			System.out.println("6이 나왔네요!");
		}
		
		//switch
		
		switch(num) {
		case 1 :
		System.out.println("1이 나왔네요!");
		break;
		case 2 :
		System.out.println("2가 나왔네요!");
		break;
		case 3 :
		System.out.println("3이 나왔네요!");
		break;
		case 4 :
		System.out.println("4이 나왔네요!");
		break;
		case 5 :
		System.out.println("5이 나왔네요!");
		break;
		default :
		System.out.println("6이 나왔네요!");
		
		}
	}

}
