package Thread_Exception;
//Throw Exception
public class Trycatch {
	public static void Age(int a) {
	if( a<18) {
		throw new ArithmeticException("Access denied - You must be at least 18 years old");
	}
	else { 
		System.out.println("Yes you are eligible");}
	}
	public static void main(String[] args) {
		int Numbers [] = {1,2,3};
//trycatch block and final		
		try{
		System.out.println(Numbers[3]);	//Numbers[2] --->output 3
		}catch(Exception e) {
			System.out.println("Sorry it cannot execute");
			}
		finally {
			System.out.println("Reason :ArrayIndexoutofBoundException ");
		}
		Age(15); 
		//Age(25); ---> output: Yes you are eligible
		}
	}




