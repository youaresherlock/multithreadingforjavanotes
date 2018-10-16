package chapter02.section02.thread_2_2_8.project_1_synchronizedBlockLockAll.test3;

public class ThreadA extends Thread{
	private MyObject object;
	private Service service;
	
	public ThreadA(Service service, MyObject object) {
		super();
		this.service = service;
		this.object = object;
	}
	
	
	@Override
	public void run() {
		super.run();
		service.testMethod1(object);
	}	
}











