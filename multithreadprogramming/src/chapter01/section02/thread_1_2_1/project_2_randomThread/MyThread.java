package chapter01.section02.thread_1_2_1.project_2_randomThread;

public class MyThread extends Thread{
	
	@Override
	public void run() {
		try {
			for(int i = 0; i < 100; i++) {
				int time = (int) (Math.random() * 1000);
				Thread.sleep(time);
				System.out.println("run=" + Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
