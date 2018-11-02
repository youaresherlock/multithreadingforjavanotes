package chapter04.section02.project_1_ReadWriteLockBegin1;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Service {
	private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
	
	public void read() {
		try {
			lock.readLock().lock();
			System.out.println("»ñµÃ¶ÁËø" + Thread.currentThread().getName()
					+ " " + System.currentTimeMillis());
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			lock.readLock().unlock();
		}
	}
}





























