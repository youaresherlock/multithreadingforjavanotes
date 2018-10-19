package chapter02.section02.thread_2_2_16.project_2_setNewPropertiesLockOne;

public class ThreadB extends Thread{
	private MyService service;
	private Userinfo userinfo;

	public ThreadB(MyService service, Userinfo userinfo) {
		super();
		this.service = service;
		this.userinfo = userinfo;
	}

	@Override
	public void run() {
		service.serviceMethodA(userinfo);
	}
}
