package chapter04.section01.thread_4_1_13.project_4_tryLock_param;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Service {

	public ReentrantLock lock = new ReentrantLock();

	public void waitMethod() {
		try {
			if (lock.tryLock(3, TimeUnit.SECONDS)) {
				System.out.println("      " + Thread.currentThread().getName()
						+ "�������ʱ�䣺" + System.currentTimeMillis());
				Thread.sleep(10000);
			} else {
				System.out.println("      " + Thread.currentThread().getName()
						+ "û�л����");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			if (lock.isHeldByCurrentThread()) {
				lock.unlock();
			}
		}
	}
}


















