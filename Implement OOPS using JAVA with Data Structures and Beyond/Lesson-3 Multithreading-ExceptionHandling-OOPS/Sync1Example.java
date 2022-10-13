package Thread_Exception;

class Chat1 {
	boolean flag = false;
	public synchronized void Question(String msg) {
        if (flag==true) {
           
      }
        System.out.println(msg);
        flag = true;
       // a method from object class which provide signal to next thread
    }
}


class Teacher implements Runnable {
    Chat1 m;
    String[] s1 = { "Hi", "How are you ?", "I am also doing fine!" };

    public Teacher(Chat1 m1) {
        this.m = m1;
        new Thread(this, "Teacher").start();
    }
    public void run() {
        for (int i = 0; i < s1.length; i++) {
            m.Question(s1[i]);
        }
    }
}
    public class Sync1Example {
        public static void main(String[] args) {
            Chat1 m = new Chat1();
            new Teacher(m);
}
    }
