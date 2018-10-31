package chapter04.section01.thread_4_1_12.project_1_lockMethodTest3.test1;

import java.util.concurrent.locks.ReentrantLock;

public class Service {

	private ReentrantLock lock;

	public Service(boolean isFair) {
		super();
		lock = new ReentrantLock(isFair);
	}

	public void serviceMethod() {
		try {
			lock.lock();
			System.out.println("��ƽ�������" + lock.isFair());
		} finally {
			lock.unlock();
		}
	}
}




















