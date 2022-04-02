package Chapter6.클래스와객체.member4;

class EzenIT{
	String name;
	int floor;
	
	public void hello() {
		System.out.println("안녕하세요.");
	}
}
public class Ezen {
	public static void main(String[] args) {
		EzenIT ezenIT = new EzenIT();
		ezenIT.name = "이젠";
		ezenIT.floor = 3;
		ezenIT.hello();
		System.out.println(ezenIT.name+" : "+ ezenIT.floor);
		
	}
}
