package Chapter15.기본클래스.string;

public class SubString {

	public static void main(String[] args) {
		String str1 = "AppleBananaOrange";
		int num1 = str1.indexOf("Banana");		//시작위치 반환				5
		int num2 = str1.indexOf("Orange");		//						11
		
		String str2 = str1.substring(num1, num2);		//5~10
		System.out.println(str2);
		
		String str3 = str1.substring(num2);
		System.out.println(str3);
		
	}

}
