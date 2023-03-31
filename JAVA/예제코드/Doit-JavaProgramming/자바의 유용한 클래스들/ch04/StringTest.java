package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Class c3 = Class.forName("java.lang.String");
		
		Constructor<String>[] cons = c3.getConstructors();
		
		for(Constructor c : cons) {
			System.out.println(c);
		}
		
		Method[] methods = c3.getMethods();
		
		for(Method m : methods) {
			System.out.println(m);
		}
		

	}

}
