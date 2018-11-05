package chapter07.section01.thread_7_1_1.project_1_stateTest1;

public class Run {
	public static void main(String[] args) {
		try {
			MyThread t = new MyThread();
			System.out.println("main�����е�״̬1: " + t.getState());
			Thread.sleep(1000);
			t.start();
			Thread.sleep(1000);
			System.out.println("main�����е�״̬2: " + t.getState());
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
/*
result:
���췽���е�״̬: RUNNABLE
main�����е�״̬1: NEW
run�����е�״̬: RUNNABLE
main�����е�״̬2: TERMINATED
*/