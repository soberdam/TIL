class InterfaceTest3 {
	public static void main(String[] args) {
		A3 a = new A3();
		a.methodA();
	}
}

 class A3 {
    void methodA() {
          I3 i = InstanceManager.getInstance();
		  i.methodB();
		  System.out.println(i.toString()); // 인터페이스로 Object클래스의 메서드 호출가능
     }
 }

 interface I3 {
      public abstract void methodB();
 }

 class B3 implements I3 {
     public void methodB() {
          System.out.println("methodB in B3 class");
     }

	 public String toString() { return "class B3";}
 }

 class InstanceManager {
	public static I3 getInstance() {
		return new B3(); // 어떤 인스턴스를 불러올지 이부분만 수정하면 됨
	}
 }
