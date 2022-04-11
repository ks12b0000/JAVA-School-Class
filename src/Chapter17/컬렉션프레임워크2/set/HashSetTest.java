package Chapter17.컬렉션프레임워크2.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("이순신");
		set.add("하륜");
		set.add("이방원");
		set.add("이순신");
		
		System.out.println(set);
		
		Iterator<String> ir = set.iterator();
		
		while(ir.hasNext()) {
			String str = ir.next();
			System.out.println(str);
		}
	}
}
