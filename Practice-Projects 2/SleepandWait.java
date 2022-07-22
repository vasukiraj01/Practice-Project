package Thread_Exception;

public class SleepandWait  {
	static Object obj1 = new Object();
	
	public static void main(String[] args) throws InterruptedException {
		
		for (int i = 1;i<=4;i++) {
			System.out.println("Hi");
			Thread.sleep(1000);}

			synchronized (obj1) {
					obj1.wait(1000);
			   
			    System.out.println("Hello");}
		}
		

	}
	

