package chapter07.section01.thread_7_1_3.project_1_stateTest3;

public class MyService {
	synchronized static public void serviceMethod() {
		try {
			System.out.println(Thread.currentThread().getName() + "������ҵ�񷽷�!");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}













