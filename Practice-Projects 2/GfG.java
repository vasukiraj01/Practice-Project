package Thread_Exception;
//Java program to demonstrate the difference
//between wait and sleep

class GfG{

private static Object LOCK = new Object();

public static void main(String[] args)
throws InterruptedException {

	
	for (int i = 1;i<=4;i++) {
	System.out.println("Thread '" + Thread.currentThread().getName() +
	"' is woken after sleeping for 1 second");
	Thread.sleep(1000);}

	synchronized (LOCK)
	{
		LOCK.wait(1000);
	
		System.out.println("Object '" + LOCK + "' is woken after" +
		" waiting for 1 second");
	}
}
}
