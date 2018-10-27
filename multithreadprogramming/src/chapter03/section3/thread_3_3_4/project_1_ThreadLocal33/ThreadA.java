package chapter03.section3.thread_3_3_4.project_1_ThreadLocal33;

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





























