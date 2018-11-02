package chapter04.section01.thread_4_1_15.project_1_awaitUntilTest;

public class Run2 {

	public static void main(String[] args) throws InterruptedException {
		Service service = new Service();
		MyThreadA myThreadA = new MyThreadA(service);
		myThreadA.start();

		Thread.sleep(2000);

		MyThreadB myThreadB = new MyThreadB(service);
		myThreadB.start();
	}
}
/*
result:
2秒之后被其他线程唤醒,说明线程在等待时间到达前，可以被其他
线程提前唤醒
wait begin timer=1541125265293
notify begin timer=1541125267264
notify   end timer=1541125267266
wait   end timer=1541125267266
*/
