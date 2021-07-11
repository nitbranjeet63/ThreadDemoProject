
public class ConsumerThread extends Thread {
	private Test test;
	public ConsumerThread(Test test) {
		this.test=test;
		start();
	}
	@Override
	public void run() {
		while(true) {
			test.getNum();
		}
	}
}
