package chapter04.section01.thread_4_1_7.project_1_ConditionTest;

public class ThreadA extends Thread{
	private MyService service;
	
	public ThreadA(MyService service) {
		super();
		this.service = service;
	}
	
	@Override
	public void run() {
		while(true) {
			service.set();
		}
	}
}

