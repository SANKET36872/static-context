package com.durga;
class B{
	int i =10;
	static int j = 10;
	static void m1() {
		System.out.println(j);
		System.out.println("Static Context");
	}
	void m2() {
		System.out.println("Non-static Method");
		System.out.println(this.j);
	}
}

public class St{
	public static void main(String[] args) {
        B a1 =new B();
        a1.m2();
        a1.m1();
        System.out.println(a1.i+"  "+a1.j);
        a1.i=a1.i+1;
        a1.j=a1.j+1;
        System.out.println(a1.i+"  "+a1.j);
        
        B a2 = new B();
        System.out.println(a2.i+"  "+a2.j);
        a2.i=a2.i+1;
        a2.j=a2.j + 1;
          System.out.println(a1.i+"  "+a1.j);
        System.out.println(a2.j+"  "+a2.j);
        
        B a3 = new B();
        System.out.println(a3.i+"  "+a3.j);
        a3.i = a3.i + 1;
        a3.j = a3.j + 1;
        System.out.println(a1.i+"  "+a1.j);
          System.out.println(a2.i+"  "+a2.j);
        System.out.println(a3.i+"  "+a3.j);
        

	}

}
