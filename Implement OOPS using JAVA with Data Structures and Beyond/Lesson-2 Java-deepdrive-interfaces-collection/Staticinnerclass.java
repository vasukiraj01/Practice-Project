package simplelearn;

public class Staticinnerclass{
static class A{

public void hello(){
System.out.println("Hello Simplilearn!");
	}
}

public void hello(){
System.out.println("Hello Simplilearn!");
	}

public static void main(String[] args){

Staticinnerclass.A innerObj=new Staticinnerclass.A();
innerObj.hello();
	}
}
