package Chapter5.반복문.loop;
//2의 배수 출력
public class ForExtension {

	public static void main(String[] args) {
		int i = 0;
		for(;i < 10; i++) {//초기식 생략
			if(i%2==0) // 2의 배수
				System.out.print(i +" ");
			
		}
		System.out.println();
		i = 0;
		for(;i < 10;) {      //초기식,증감식 생략
			if(i%2 == 0)
				System.out.println(i+" ");
			i++;
			
		}System.out.println();
		
		for(int j = 0; j < 10; j=j+2) {   //증감식 대신 연산 수식
			System.out.println(j + " ");
		}

	}

}
