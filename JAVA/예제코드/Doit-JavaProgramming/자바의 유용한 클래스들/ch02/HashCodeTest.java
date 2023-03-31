package ch02;

public class HashCodeTest {

	public static void main(String[] args) {
		
		Student Lee = new Student(100, "Lee");
		Student Lee2 = Lee;
		Student Shun = new Student(100, "Lee");
		
		System.out.println(Lee.hashCode());
		System.out.println(Shun.hashCode());
		
		System.out.println(System.identityHashCode(Lee));
		System.out.println(System.identityHashCode(Shun));
		
		String str1 = new String("test");
		String str2 = new String("test");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
	}

}
