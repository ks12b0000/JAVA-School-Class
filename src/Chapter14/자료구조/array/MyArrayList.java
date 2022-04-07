package Chapter14.자료구조.array;

public class MyArrayList {
	
	int[] intArr;
	int count;
	
	public int ARRAY_SIZE;
	public static final int ERROR_NUM = -99999999;
	
	public MyArrayList() {
		count = 0;
		ARRAY_SIZE = 10;
		intArr = new int[ARRAY_SIZE];
	}
	
	public MyArrayList(int size) {
		count = 0;
		ARRAY_SIZE = size;
		intArr = new int[ARRAY_SIZE];
	}
	
	public void addElement(int num) {
		if(count >= ARRAY_SIZE) {
			System.out.println("not enough memory");
			return;
		}
		intArr[count++] = num;
		
	}
public void intsertElement(int position, int num) {
	int i;
	if(count >= ARRAY_SIZE) {
		System.out.println("not enough memory");
		return;
	}
	if(position < 0 || position > count) {
		System.out.println("insert error");
		return;
	}
	for(i = count-1; i >= position;i--) {
		intArr[i+1] = intArr[i];		//하나씩 이동
		
	}
	intArr[position] = num;
	count++;

	}
	public int removeElement(int position) {
		int ret = ERROR_NUM;
		
		if(isEmpty()) {
			System.out.println("There is no element");
			return ret;
		}
		if(position < 0 || position >= count) {
			System.out.println("remove Error");
			return ret;
		}
		ret = intArr[position];
		
		for(int i = position; i < count-1; i++) {
			intArr[i] = intArr[i+1];
		}
		count--;
		
		return ret;
	}
	public boolean isEmpty() {
		if(count == 0) {
			return true;
		}else
			return false;
	}
	public void printAll() {
	if(count == 0) {
		System.out.println("출력할 내용이 없습니다.");
		return;
	}
	for(int i = 0; i < count; i++) {
		System.out.println(intArr[i]);
	}
}
	//getElement()
	public int getElement(int position) {
		if(position < 0 ||position > count-1) {
			System.out.println("검색 위치 오류임. 현재 리스트의 개수는 "+ count+"개 입니다.");
			return ERROR_NUM;
			
		}
		return intArr[position];
		
	}

}
