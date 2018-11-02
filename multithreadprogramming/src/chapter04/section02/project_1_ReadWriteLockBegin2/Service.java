package chapter04.section02.project_1_ReadWriteLockBegin2;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Service {
	private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
	
	public void write() {
		try {
			lock.writeLock().lock();
			System.out.println("»ñµÃÐ´Ëø" + Thread.currentThread().getName()
					+ " " + System.currentTimeMillis());
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			lock.writeLock().unlock();
		}
	}
}





























