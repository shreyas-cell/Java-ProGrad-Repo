package com.p;
class AA{
	void m1() {
		System.out.println("in m1 of A...");
	}
	void m2() {
		System.out.println("in m2 of A...");
	}
}

class B extends AA{
	void m1() {
		System.out.println("in m1 of B...");
	}
	void m2() {
		System.out.println("in m2 of B...");
	}
	void m2(int a) {
		System.out.println("m2 of B "+a);
	}
}


public class InheritanceEx extends B implements InterfaceEx {
	public void m1() {
		System.out.println("m1 of Interface");
	}
	public static void main(String[] args) {

		B h=new InheritanceEx();
		h.m1();
		h.m2();
		h.m2(5);
	}

}
