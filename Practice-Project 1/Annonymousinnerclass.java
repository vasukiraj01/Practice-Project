package simplelearn;
 abstract class A {

		abstract void test();
	}

		public class Annonymousinnerclass{
		public static void main(String[] args){
		A a= new A(){
		void test() {
		System.out.println("Hello Simplilearn");}
		};
		a.test();
		}
	}


