
class Ta extends Thread {
int total;
public void run() {
	synchronized (this) {
		for (int i = 0; i < 100; i++) {
			total += i;
		}
		notify();
	}
}
}
class Tb{
	public static void main(String[] args) throws InterruptedException {
		Ta ob=new Ta();
		ob.start();
		synchronized (ob) {
			ob.wait();
		}
		System.out.println("total is:"+ob.total);
	}
}
