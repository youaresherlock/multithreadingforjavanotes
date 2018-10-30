package chapter04.section01.thread_4_1_8.project_1_ConditionTestManyToMany;

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

