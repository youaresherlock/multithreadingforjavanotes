package chapter04.section01.thread_4_1_4.project_1_UseConditionWaitNotifyOk;

public class Run {
	public static void main(String[] args) throws InterruptedException{
		MyService service = new MyService();
		
		ThreadA a = new ThreadA(service);
		a.start();
		
		Thread.sleep(3000);
		
		service.signal();
	}
}
/*
result:
 awaitʱ��Ϊ1540884494515
signalʱ��Ϊ1540884497516
B
���ͷ���!
*/

