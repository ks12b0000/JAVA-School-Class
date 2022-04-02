package Chapter6.클래스와객체.member3;

public class TimeTest {

	public static void main(String[] args) {
		Time t = new Time();
		//t.
		System.out.println(t.getHour());
		System.out.println(t.getMinute());
		System.out.println(t.getSecond());
		
		System.out.println(t);
		
		//시를 설정
	    t.setHour(-22);
	    System.out.println(t);
	    t.setHour(27);
	    t.setHour(11);
	    System.out.println(t);
	    
	    //분을 설정
	    t.setMinute(72);
	    System.out.println(t);
	    t.setMinute(23);
	    System.out.println(t);
	    
	    //초를 설정
	    t.setSecond(70);
	    System.out.println(t);
	    t.setSecond(23);
	    System.out.println(t);
	}

}
