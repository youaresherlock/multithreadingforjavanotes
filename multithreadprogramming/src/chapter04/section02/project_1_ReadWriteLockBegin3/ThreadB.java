package chapter04.section02.project_1_ReadWriteLockBegin3;

public class ThreadB extends Thread {

	private Service service;
	
	public ThreadB(Service service) {
		super();
		this.service = service;
	}
	
	@Override
	public void run() {
		service.write();
	}
}

