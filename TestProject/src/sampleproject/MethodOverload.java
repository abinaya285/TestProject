package sampleproject;

public class MethodOverload {

	public void methodadd(int a,int b) {
	int c=a+b;
	System.out.println(c);
	
	}
	
	public void methodadd(String a,String b) {
	String c = a.concat(b);
	System.out.println(c);
	
	}

	public static void main(String[] args) {
		MethodOverload mo = new MethodOverload();
		mo.methodadd(15, 20);
		mo.methodadd("Software", " Testing");
	
	}

}
