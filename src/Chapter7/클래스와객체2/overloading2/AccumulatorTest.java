package Chapter7.클래스와객체2.overloading2;

/*
 * 인스턴스(객체) : new 키워드를 사용하여 클래스를 메모리에 생성한 상태
 * 참조 변수 : 메모리에 생성된 인스턴스를 가리키는 변수.
 * 참조 값 : 생성된 인스턴스의 메모리 주소 값.
 */
public class AccumulatorTest {

	public static void main(String[] args) {
		Accumulator accu = new Accumulator();
//		System.out.println(accu);
		int iResult = accu.add(6, 7);
		System.out.println("iResult : " +iResult);
		
		long lResult = accu.add(100, 200L);
		System.out.println("lResult :"+lResult);
		
		lResult = accu.add(10000L, 77);
		System.out.println("lResult2 :"+lResult);
		
		double dResult = accu.add(110.0, 120.0);
		System.out.println("dResult : "+dResult);
		
		iResult = accu.add(new A());
		System.out.println("iResult :"+iResult);
		
		lResult = accu.add(12L, 12L);
		System.out.println("lResult :"+lResult);
		
		String sResult = accu.add("안녕", "하세요");
		System.out.println("sResult :"+sResult);
		
		sResult = accu.add("안녕하세요. 저는 " ,24,"살 입니다!");
		System.out.println("sResult :"+sResult);
		
		
		
	}

}
