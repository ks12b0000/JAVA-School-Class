package Chapter17.컬렉션프레임워크2.set2;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(1001, "이방원");
		Member memberHa = new Member(1002, "하륜");
		Member memberSunk = new Member(1003, "이숙번");
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberHa);
		memberHashSet.addMember(memberSunk);		
		memberHashSet.ShowAllMember();
		
		memberHashSet.removeMember(1000);
		memberHashSet.removeMember(1001);
		memberHashSet.ShowAllMember();
		
		Member memberHang = new Member(1003, "황희");
		memberHashSet.addMember(memberHang);
		memberHashSet.ShowAllMember();
	}

}
