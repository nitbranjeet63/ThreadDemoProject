
public class ThreadDemo extends Thread{
	@Override
	public void run() {
		//3. Running - thread is in execution
		System.out.println("Inside Run Method");
		
		//4.Pause State- thread execution may be paused
	}
	public static void main(String[] args) {
		//1.New born state- A thread Object is created
		ThreadDemo demo1=new ThreadDemo();
		
		//2.Ready to run- added in the thread pool
		demo1.start();
	}
}
