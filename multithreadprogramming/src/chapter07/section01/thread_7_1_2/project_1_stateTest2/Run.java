package chapter07.section01.thread_7_1_2.project_1_stateTest2;

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
begin sleep
main�����е�״̬: TIMED_WAITING
  end sleep
*/