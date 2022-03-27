package com.sample;
class OuterClass{
	int i=20;
	private class InnerClass{
		int varinner;
		InnerClass(){
			varinner=10;
		}
		void method_inner() {
			System.out.println("Innerclass Method "+varinner);
			System.out.println("outer class variable i "+i);
		}
	}//inner class end
	
	void outer_method() {
		InnerClass ob=new InnerClass();
		ob.method_inner();//call inner class method
		
	}
}


public class MainAppli {

	public static void main(String[] args) {
		OuterClass ob=new OuterClass();
		ob.outer_method();

	}

}

