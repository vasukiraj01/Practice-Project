package simplelearn;
//Parameter passed to the method , call by value method,method over loading
public class Method {
	int i = 20;                 //call by value
	int Value(int i) {
	i=i*20;
	System.out.println(" Before calling a value by method "+ i);
		return i;
	}

	static void Speed(int a) {
		System.out.println(" The speed of the car is "+ a+"!");
	}
	static  void Speed(String i) {       //method overloading
		System.out.println(i);
	}

	public static void main(String[] args) {
		Method obj = new Method();
		obj.Speed(144);
		obj.Value(20);
		System.out.println(" Before calling a value by method "+ obj.i);
		Speed(" Hi");
		
	}

}
