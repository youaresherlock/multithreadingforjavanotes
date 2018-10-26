package chapter03.section2.thread_3_2_3.project_1_joinException;

public class ThreadB extends Thread{
	
	@Override
	public void run() {
		try {
			ThreadA a = new ThreadA();
			a.start();
			a.join();
			
			System.out.println("线程B在run end处打印了");
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("线程B在catch处打印了");
			e.printStackTrace();
		}
	}

}
