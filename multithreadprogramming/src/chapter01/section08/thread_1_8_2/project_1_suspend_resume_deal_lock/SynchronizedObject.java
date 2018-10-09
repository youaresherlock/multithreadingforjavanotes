package chapter01.section08.thread_1_8_2.project_1_suspend_resume_deal_lock;

public class SynchronizedObject {
	synchronized public void printString() {
		System.out.println("begin");
		if(Thread.currentThread().getName().equals("a")) {
			System.out.println("aœﬂ≥Ã”¿‘∂ suspend¡À!");
			Thread.currentThread().suspend();
		}
		System.out.println("end");
	}
}
