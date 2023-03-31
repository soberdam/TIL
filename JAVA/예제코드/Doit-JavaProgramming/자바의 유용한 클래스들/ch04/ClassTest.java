package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Person person = new Person("James");
		System.out.println(person);
		
		Class c1 = Class.forName("ch04.Person");
		
		Class[] parameterTypes = {String.class};
		Constructor con = c1.getConstructor(parameterTypes);
		
		Object[] initargs= {"김유신"};
		Person personKim = (Person)con.newInstance(initargs);
		System.out.println(personKim);
	}

}
