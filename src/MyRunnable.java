import java.util.Iterator;

public class MyRunnable implements Runnable {
	private Thread thread;
	
	public MyRunnable(String name,int priority) {
		thread=new Thread(this);
		thread.setName(name);
		thread.setPriority(priority);
		thread.start();
	}
	@Override
	public void run() {
//		// TODO Auto-generated method stub
//		System.out.println(thread.getName());
		for(int i=0;i<10;i++) {
			System.out.println(thread.getName()+":"+thread.getPriority());
		}
		
	}
	public static void main(String[] args) {
		MyRunnable myRunnable1=new MyRunnable("One",2);
		MyRunnable myRunnable2=new MyRunnable("Two",8);
		MyRunnable myRunnable3=new MyRunnable("Three",4);
	}
}
