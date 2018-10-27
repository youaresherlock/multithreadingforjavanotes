package chapter03.section3.thread_3_3_2.project_1_ThreadLocalTest;

public class ThreadB extends Thread {

	@Override
	public void run() {
		try {
			for (int i = 0; i < 100; i++) {
				if (Tools.t1.get() == null) {
					Tools.t1.set("ThreadB" + (i + 1));
				} else {
					System.out.println("ThreadB get Value=" + Tools.t1.get());
				}
				Thread.sleep(200);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
