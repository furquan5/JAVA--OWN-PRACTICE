package test;
public class PClass {
	public static int a;
	public static void m1() {
		System.out.println("====PClass m()===");
		System.out.println("The value a :"+a);
	}
	static{
		System.out.println("Static block PClass");
	}

}
