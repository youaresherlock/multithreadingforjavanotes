package chapter07.section01.thread_7_1_4.project_1_stateTest4;

public class Run {
	public static void main(String[] args) {
		try {
			MyThread t = new MyThread();
			t.start();
			Thread.sleep(1000);
			System.out.println("main�����е�״̬: " + t.getState());
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
/*
result:
main�����е�״̬: WAITING
*/