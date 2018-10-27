package chapter03.section3.thread_3_3_2.project_1_ThreadLocalTest;

public class ThreadA extends Thread {

	@Override
	public void run() {
		try {
			for(int i = 0; i < 100; i++) {
				if(Tools.t1.get() == null) {
					Tools.t1.set("ThreadA" + (i + 1));
				} else {
					System.out.println("ThreadA get Value=" + Tools.t1.get());
				}
				Thread.sleep(200);
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}






























