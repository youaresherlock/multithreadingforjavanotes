package chapter04.section01.thread_4_1_8.project_1_ConditionTestManyToMany;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	private boolean hasValue = false;
	
	public void set() {
		try {
			lock.lock();
			while(hasValue == true) {
				System.out.println("�п��ܡ������");
				condition.await();
			}
			System.out.println("��ӡ��");
			hasValue = true;
			//condition.signal();
			condition.signalAll();
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
	public void get() {
		try {
			lock.lock();
			while(hasValue == false) {
				System.out.println("�п��ܡ�����");
				condition.await();
			}
			System.out.println("��ӡ��");
			hasValue = false;
			//condition.signal();
			condition.signalAll();
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
}














































