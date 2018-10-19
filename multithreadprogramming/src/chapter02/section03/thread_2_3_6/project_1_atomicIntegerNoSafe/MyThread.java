package chapter02.section03.thread_2_3_6.project_1_atomicIntegerNoSafe;

public class MyThread extends Thread{
	private MyService myService;
	
	public MyThread(MyService myService) {
		super();
		this.myService = myService;
	}
	
	@Override
	public void run() {
		myService.addNum();
	}
}
