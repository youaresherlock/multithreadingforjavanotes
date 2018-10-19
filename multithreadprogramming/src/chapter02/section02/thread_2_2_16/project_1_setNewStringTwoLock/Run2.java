package chapter02.section02.thread_2_2_16.project_1_setNewStringTwoLock;

public class Run2 {
	public static void main(String[] args) throws InterruptedException{
		MyService service = new MyService();

		ThreadA a = new ThreadA(service);
		a.setName("A");

		ThreadB b = new ThreadB(service);
		b.setName("B");

		a.start();
		b.start();
	}
}
/*
result:
A begin 1539932865275
A end 1539932867283
B begin 1539932867283
B end 1539932869294
 */