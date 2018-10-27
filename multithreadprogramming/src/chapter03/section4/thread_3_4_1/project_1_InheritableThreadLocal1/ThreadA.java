package chapter03.section4.thread_3_4_1.project_1_InheritableThreadLocal1;

public class ThreadA extends Thread {

	@Override
	public void run() {
		try {
			for (int i = 0; i < 3; i++) {
				System.out.println("在ThreadA线程中取值=" + Tools.t1.get().getTime());
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}





























