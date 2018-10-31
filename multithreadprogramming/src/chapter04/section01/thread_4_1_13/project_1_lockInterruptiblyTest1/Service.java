package chapter04.section01.thread_4_1_13.project_1_lockInterruptiblyTest1;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service {

	public ReentrantLock lock = new ReentrantLock();

	public void waitMethod(){
		try {
			lock.lock();
//			lock.lockInterruptibly();
			System.out.println("lock begin " 
			+ Thread.currentThread().getName());
			for (int i = 0; i < Integer.MAX_VALUE / 10; i++) {
				String newString = new String();
				Math.random();
			}
			System.out.println("lock   end " 
					+ Thread.currentThread().getName());
		} 
//		catch(InterruptedException e) {
//				System.out.println("线程"+Thread.currentThread().getName()+"进入catch~!");
//				e.printStackTrace();
//		}
		finally {
			if (lock.isHeldByCurrentThread()) {
				lock.unlock();
			}
		}
	}
}


















