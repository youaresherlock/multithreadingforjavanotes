package chapter04.section01.thread_4_1_4.project_1_UseConditionWaitNotifyOk;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	
	public void await() {
		try {
			lock.lock(); 
			System.out.println(" awaitʱ��Ϊ" + System.currentTimeMillis());
			condition.await();
			System.out.println("B");
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			lock.unlock();
			System.out.println("���ͷ���!");
		}
	}
	
	public void signal() {
		try {
			lock.lock();
			System.out.println("signalʱ��Ϊ" + System.currentTimeMillis());
			condition.signal();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			lock.unlock();
		}
	}
}











