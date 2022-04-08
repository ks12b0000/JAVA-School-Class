package Chapter15.기본클래스.etc;

public class VarArgsTest {
	public static void helloEzen(String...vargs) {   //가변인수 표시
		for(String str : vargs) {
			System.out.print(str + "\t");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		helloEzen("이순신");
		helloEzen("이도","이방원");
		helloEzen("이도","이방원","이성계");
	}
}
