package Chapter15.기본클래스.string;

public class StringContentTest {

	public static void main(String[] args) {
		String str1 = new String("Apple");
		String str2 = new String("apple");
		String str3 = new String("Banana");
		
		//인스턴스 내용 비교
		if(str1.equals(str2))
			System.out.println("두 문자열은 같습니다.");
		else 
			System.out.println("두 문자열은 다릅니다.");	
		
		
		if(str1.compareToIgnoreCase(str2) == 0)
			System.out.println("두 문자열은 같습니다.");
		else 
			System.out.println("두 문자열은 다릅니다.");	
		
		int cmpResult = str1.compareTo(str2);		//대소문자 구분 비교(사전순으로 비교)
		if(cmpResult == 0) 
			System.out.println("두 문자열은 일치합니다.");
		else if(cmpResult < 0)
				System.out.println("사전의 앞에 위치하는 문자 : "+ str1);	//사전순으로 앞쪽에 있음.
		else
			System.out.println("사전의 앞에 위치하는 문자 : "+ str2);
				
		
		
	}

}
