package chapter07.section01.thread_7_1_3.project_1_stateTest3;

public class Run {
	public static void main(String[] args) throws InterruptedException{
		MyThread1 t1 = new MyThread1();
		t1.setName("a");
		t1.start();
		MyThread2 t2 = new MyThread2();
		t2.setName("b");
		t2.start();
		Thread.sleep(1000);
		System.out.println("main�����е�t2״̬: " + t2.getState());
	}
}
/*
result:
a������ҵ�񷽷�!
main�����е�t2״̬: BLOCKED
b������ҵ�񷽷�!
*/