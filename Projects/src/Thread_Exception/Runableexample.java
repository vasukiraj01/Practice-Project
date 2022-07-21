package Thread_Exception;

public class Runableexample implements Runnable  {
	String Run;
	Runableexample(String Run){
		this.Run = Run;
	}

	public void run() {
		System.out.println(" This a Runnable class "+Run);
	}

	public static void main(String[] args) {
		Runableexample obj = new Runableexample("yes!");
		new Thread(obj).start();
		

	}

}
