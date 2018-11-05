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
		System.out.println("main方法中的t2状态: " + t2.getState());
	}
}
/*
result:
a进入了业务方法!
main方法中的t2状态: BLOCKED
b进入了业务方法!
*/