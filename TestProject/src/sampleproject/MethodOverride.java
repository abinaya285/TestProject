package sampleproject;

class A {
	
	public void method1() {
		System.out.println("This is parent class");
	}
}
	class B extends A{
	@Override	
    public void method1() {
		System.out.println("This is child class");
	}
}

public class MethodOverride {

	public static void main(String[] args) {
		B bobj = new B();
		bobj.method1();	


	}

}
