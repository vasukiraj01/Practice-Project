package Thread_Exception;

public class ThreadCreation extends Thread {
	public void run() {
		System.out.println("This a Thread class");
	}

	public static void main(String[] args) {
		ThreadCreation T = new ThreadCreation();
		T.start();

	}
}
