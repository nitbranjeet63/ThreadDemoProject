
public class ProducerThread extends Thread {
	private Test test;
	public ProducerThread(Test test) {
		this.test=test;
		start();
	}
	@Override
	public void run() {
		int counter=0;
		while(counter<=100) {
			test.setNum(counter++);
		}
	}
}
