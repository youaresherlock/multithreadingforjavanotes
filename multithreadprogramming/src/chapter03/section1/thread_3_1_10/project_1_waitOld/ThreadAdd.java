package chapter03.section1.thread_3_1_10.project_1_waitOld;

public class ThreadAdd extends Thread{

	private Add p;
	
	public ThreadAdd(Add p) {
		super();
		this.p = p;
	}
	
	@Override
	public void run() {
		p.add();
	}
}
