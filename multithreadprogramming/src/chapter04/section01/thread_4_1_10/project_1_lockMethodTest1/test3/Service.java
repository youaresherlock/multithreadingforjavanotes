package chapter04.section01.thread_4_1_10.project_1_lockMethodTest1.test3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service {

	private ReentrantLock lock = new ReentrantLock();
	private Condition newCondition = lock.newCondition();

	public void waitMethod() {
		try {
			lock.lock();
			newCondition.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public void notityMethod() {
		try {
			lock.lock();
			System.out.println("��" + lock.getWaitQueueLength(newCondition)
					+ "���߳����ڵȴ�newCondition");
			newCondition.signal();
		} finally {
			lock.unlock();
		}
	}
}