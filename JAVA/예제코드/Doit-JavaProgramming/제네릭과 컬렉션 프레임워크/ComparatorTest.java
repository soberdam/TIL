package ch08;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2) * -1;
	}
	
}

public class ComparatorTest {

	public static void main(String[] args) {
		
		Set<String> set = new TreeSet<String>(new MyCompare());
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		System.out.println(set);
		
	}

}
