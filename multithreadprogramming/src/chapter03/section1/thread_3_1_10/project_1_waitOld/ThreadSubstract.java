package chapter03.section1.thread_3_1_10.project_1_waitOld;

public class ThreadSubstract extends Thread{
	private Substract r;
	
	public ThreadSubstract(Substract r) {
		super();
		this.r = r;
	}
	
	@Override 
	public void run() {
		r.substract();
	}
}
