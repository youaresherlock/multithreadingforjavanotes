package chapter04.section01.thread_4_1_9.project_1_Fair_noFair_test;

public class RunFair {

	public static void main(String[] args) throws InterruptedException {
		final Service service = new Service(true);

		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("���߳�" + Thread.currentThread().getName()
						+ "������");
				service.serviceMethod();
			}
		};

		Thread[] threadArray = new Thread[10];
		for (int i = 0; i < 10; i++) {
			threadArray[i] = new Thread(runnable);
		}
		for (int i = 0; i < 10; i++) {
			threadArray[i].start();
		}
	}
}
/*
result:
���߳�Thread-1������
���߳�Thread-8������
���߳�Thread-6������
���߳�Thread-7������
���߳�Thread-3������
���߳�Thread-5������
���߳�Thread-0������
���߳�Thread-4������
���߳�Thread-2������
���߳�Thread-9������
ThreadName=Thread-0�������
ThreadName=Thread-4�������
ThreadName=Thread-6�������
ThreadName=Thread-8�������
ThreadName=Thread-2�������
ThreadName=Thread-1�������
ThreadName=Thread-5�������
ThreadName=Thread-3�������
ThreadName=Thread-7�������
ThreadName=Thread-9�������
*/