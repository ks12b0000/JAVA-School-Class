package Chapter10.컬렉션프레임워크1.arraylist;

import java.util.ArrayList;

public class ArrayListTest2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(4);
		list.add(2);
		list.add(0);
		list.add(1);
		list.add(3);
		
		
		ArrayList list2 = new ArrayList(list.subList(1, 4));
		
		print(list,list2);
//		list.clear();
//		System.out.println("데이터 모두 삭제");
//		list.remove(1);
//		System.out.println("1번쨰 자리삭제"+list);
//		list.set(1, 10);
//		list.set(0, 15);
//		System.out.print("변경"+list);
	}

	public static void print(ArrayList<Integer> list, ArrayList list2) {
		System.out.println("list : "+list.toString());
		System.out.println("list2 : " +list2.toString());
		System.out.println();
	}

}
