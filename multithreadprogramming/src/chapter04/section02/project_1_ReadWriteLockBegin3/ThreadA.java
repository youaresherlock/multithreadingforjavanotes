package chapter04.section02.project_1_ReadWriteLockBegin3;

public class ThreadA extends Thread {

	private Service service;
	
	public ThreadA(Service service) {
		super();
		this.service = service;
	}
	
	@Override
	public void run() {
		service.read();
	}
}
