package chapter04.section01.thread_4_1_13.project_3_tryLockTest;

import java.util.concurrent.locks.ReentrantLock;

public class Service {
	public ReentrantLock lock = new ReentrantLock();
	
	public void waitMethod() {
		if(lock.tryLock()) {
			System.out.println(Thread.currentThread().getName() + "�����");
		} else {
			System.out.println(Thread.currentThread().getName() + "û�л����");
		}
	}
}


















