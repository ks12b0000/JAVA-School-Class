package Chapter17.컬렉션프레임워크2.treeset2;

import java.util.Iterator;
import java.util.TreeSet;



public class MemberTreeSet {

	private TreeSet<Member> treeSet;
	
	public MemberTreeSet() {
		treeSet = new TreeSet<>();			//new Member()
	}
	
	public void addMember(Member member) {
		treeSet.add(member);
		
	}
	public boolean removeMember(int memberId) {
		Iterator<Member> ir = treeSet.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			if(member.getMemberId() == memberId) {
				treeSet.remove(member);
				return true;
			}
		}
		
		System.out.println(memberId+" 번호가 존재하지 않습니다.");
		return false;
	}
	
	public void ShowAllMember() {
		for(Member member : treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
