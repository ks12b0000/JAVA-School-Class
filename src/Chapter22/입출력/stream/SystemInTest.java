package Chapter22.입출력.stream;

import java.io.IOException;

public class SystemInTest {

	public static void main(String[] args) {
		System.out.print("알파벳 하나를 쓰고 [Enter]를 누르세요: ");
		
		int i;
		
		try {
			i = System.in.read();
			System.out.println(i);
			System.out.println((char)i);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}







