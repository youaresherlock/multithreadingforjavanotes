package chapter02.section02.thread_2_2_16.project_1_setNewStringTwoLock;

public class Run1 {
	public static void main(String[] args) throws InterruptedException{
		MyService service = new MyService();
		
		ThreadA a = new ThreadA(service);
		a.setName("A");
		
		ThreadB b = new ThreadB(service);
		b.setName("B");
		
		a.start();
		Thread.sleep(50);
		b.start();
	}
}
/*
A begin 1539932674955
B begin 1539932675007
A end 1539932676958
B end 1539932677008
*/




























