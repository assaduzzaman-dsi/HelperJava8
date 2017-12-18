package test;

public class Test {
	 public void foo(String s) {
	 System.out.println("String");
	 }

	 public void foo(StringBuffer sb){
	 System.out.println("StringBuffer");
	 }

	 public static void main(String[] args) {
		new Test().foo(null);
	}
}
