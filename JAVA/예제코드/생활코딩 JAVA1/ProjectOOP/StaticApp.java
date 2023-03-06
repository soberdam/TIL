class Foo {
	
	public static String classVar = "I class Var";
	public String instanceVar = "I instance Var";
	
	public static void classMethod() {
		System.out.println(classVar); // OK
//		System.out.println(instanceVar); //Error
	}
	
	public void instanceMethod() {
		System.out.println(classVar); // OK
		System.out.println(instanceVar); // OK
	}
	
}


public class StaticApp {

	public static void main(String[] args) {
		
		System.out.println(Foo.classVar); // OK
//		System.out.println(Foo.instanceVar); // Error
		Foo.classMethod(); // OK
//		Foo.instanceMethod(); // Error
		
		Foo f1 = new Foo();
		Foo f2 = new Foo();
		
		System.out.println(f1.classVar); // I class Var
		System.out.println(f1.instanceVar); // I instance Var
		
		f1.classVar = "Changed class Var";
		f1.instanceVar = "Changed instance Var";
		
		System.out.println(Foo.classVar); // Changed class Var
		System.out.println(f2.classVar); // Changed class Var
		System.out.println(f2.instanceVar); // I instance Var
		
				
		
	}

}
