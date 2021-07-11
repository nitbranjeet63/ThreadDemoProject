
public class PCMain {
	public static void main(String[] args) {
		Test test = new Test();
		new ProducerThread(test);
		new ConsumerThread(test);
		
	}
}
