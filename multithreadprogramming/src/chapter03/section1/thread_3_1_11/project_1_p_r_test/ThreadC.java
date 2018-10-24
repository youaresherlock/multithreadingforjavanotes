package chapter03.section1.thread_3_1_11.project_1_p_r_test;

public class ThreadC extends Thread{
	private C r;
	
	public ThreadC(C r) {
		super();
		this.r = r;
	}
	
	@Override
	public void run() {
		while(true) {
			r.getValue();
		}
	}
}
