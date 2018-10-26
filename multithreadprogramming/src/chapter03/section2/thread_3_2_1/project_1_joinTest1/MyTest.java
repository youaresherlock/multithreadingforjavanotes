package chapter03.section2.thread_3_2_1.project_1_joinTest1;

public class MyTest extends Thread {
	
	@Override
	public void run() {
		try {
			int secondValue = (int)(Math.random() * 10000);
			System.out.println(secondValue);
			Thread.sleep(secondValue);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
