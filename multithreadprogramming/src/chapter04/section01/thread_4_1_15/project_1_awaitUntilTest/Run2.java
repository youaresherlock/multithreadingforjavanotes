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
2��֮�������̻߳���,˵���߳��ڵȴ�ʱ�䵽��ǰ�����Ա�����
�߳���ǰ����
wait begin timer=1541125265293
notify begin timer=1541125267264
notify   end timer=1541125267266
wait   end timer=1541125267266
*/
