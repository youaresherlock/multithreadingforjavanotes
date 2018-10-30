package chapter04.section01.thread_4_1_5.project_1_MustUseMoreCondition_Error;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	
	public void awaitA() {
		try {
			lock.lock();
			System.out.println("begin awaitAʱ��Ϊ" + System.currentTimeMillis()
			+ " ThreadName=" + Thread.currentThread().getName());
			condition.await();
			System.out.println("  end awaitAʱ��Ϊ" + System.currentTimeMillis() 
			+ " ThreadName=" + Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
	public void awaitB() {
		try {
			lock.lock();
			System.out.println("begin awaitBʱ��Ϊ" + System.currentTimeMillis()
					+ " ThreadName=" + Thread.currentThread().getName());
			condition.await();
			System.out.println("  end awaitBʱ��Ϊ" + System.currentTimeMillis()
					+ " ThreadName=" + Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
	public void signalAll() {
		try {
			lock.lock();
			System.out.println("  signalAllʱ��Ϊ" + System.currentTimeMillis()
					+ " ThreadName=" + Thread.currentThread().getName());
			condition.signalAll();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			lock.unlock();
		}
	}
}











