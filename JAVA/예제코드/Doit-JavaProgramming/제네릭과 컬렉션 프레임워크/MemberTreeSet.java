package ch08;
import java.util.*;
public class MemberTreeSet {
	
	TreeSet<Member> treeSet;
	
	public MemberTreeSet() {
		treeSet = new TreeSet<Member>();
	}
	
	public void addMember(Member member) {
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
//		for (int i=0; i<arrayList.size(); i++ ) {
//			Member member = arrayList.get(i);
//			if(member.getMemberId()==memberId) {
//				arrayList.remove(i);
//				return true;
//			}
//		}
		
		Iterator<Member> ir = treeSet.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			if(member.getMemberId() == memberId) {
				treeSet.remove(member);
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Member> ir = treeSet.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			System.out.println(member);
		}
		System.out.println();
	}
	
	
	
}
