package simplelearn;

import java.util.jar.Attributes.Name;
//parameterized constructor
class Constructor1 {
	String Name;
	int age;
	Constructor1(String s,int i){
		Name =s ;
		age = i;
	}
	void display() {
		System.out.println(Name+" age is "+age);
	}
}

	public class Constructor{
	public static void main(String [] args) {
		Constructor1 obj = new Constructor1("ana",25);
		Constructor1 o=new Constructor1("Annie",20);
		obj.display();
		o.display();

	}

}
