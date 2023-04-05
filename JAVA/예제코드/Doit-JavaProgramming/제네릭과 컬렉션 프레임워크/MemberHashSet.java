package ch06;
import java.util.*;
public class MemberHashSet {
	
	HashSet<Member> hashSet;
	
	public MemberHashSet() {
		hashSet = new HashSet<Member>();
	}
	
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
//		for (int i=0; i<arrayList.size(); i++ ) {
//			Member member = arrayList.get(i);
//			if(member.getMemberId()==memberId) {
//				arrayList.remove(i);
//				return true;
//			}
//		}
		
		Iterator<Member> ir = hashSet.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			if(member.getMemberId() == memberId) {
				hashSet.remove(member);
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Member> ir = hashSet.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			System.out.println(member);
		}
		System.out.println();
	}
	
	
	
}
