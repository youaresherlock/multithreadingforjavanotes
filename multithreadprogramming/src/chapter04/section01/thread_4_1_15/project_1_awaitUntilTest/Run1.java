package chapter04.section01.thread_4_1_15.project_1_awaitUntilTest;

public class Run1 {
	public static void main(String[] args) throws InterruptedException {
		Service service = new Service();
		MyThreadA myThreadA = new MyThreadA(service);
		myThreadA.start();
	}
}
/*
result:
可以看到10秒后自动唤醒自己
wait begin timer=1541125193633
wait   end timer=1541125203620
*/