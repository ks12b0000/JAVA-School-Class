package Chapter17.컬렉션프레임워크2.treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("정도전");
		treeSet.add("최영");
		treeSet.add("이순신");
		
		for(String str : treeSet) {
			System.out.println(str);
		}

	}

}
