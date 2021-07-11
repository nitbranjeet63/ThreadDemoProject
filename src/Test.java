
public class Test {
	private int num;
	private boolean flag = true;
	public synchronized int getNum() {
		if(flag==true) {
			try {
				wait();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println("GOT :"+num);
		flag = true;
		notify();
		return num;
	}

	public synchronized void setNum(int num) {
		if(flag == false) {
			try {
				wait();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		this.num = num;
		System.out.println("SET :"+num);
		flag=false;
		notify();
	}
	
	
}
