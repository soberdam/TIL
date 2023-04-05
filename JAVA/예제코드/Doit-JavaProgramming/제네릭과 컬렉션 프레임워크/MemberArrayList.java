package ch05;
import java.util.*;
public class MemberArrayList {
	
	ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) {
		for (int i=0; i<arrayList.size(); i++ ) {
			Member member = arrayList.get(i);
			if(member.getMemberId()==memberId) {
				arrayList.remove(i);
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다");
		return false;
	}
	
	public void showAllMember() {
		for(int i=0; i<arrayList.size(); i++) {
			Member member = arrayList.get(i);
			System.out.println(member);
		}
		System.out.println();
	}
	
	
	
}
