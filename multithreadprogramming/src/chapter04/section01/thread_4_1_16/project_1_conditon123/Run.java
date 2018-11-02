package chapter04.section01.thread_4_1_16.project_1_conditon123;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Run {
	volatile private static int nextPrintWho = 1;
	private static ReentrantLock lock = new ReentrantLock();
	final private static Condition conditionA = lock.newCondition();
	final private static Condition conditionB = lock.newCondition();
	final private static Condition conditionC = lock.newCondition();
	
	public static void main(String[] args) {
		Thread threadA = new Thread() {
			@Override 
			public void run() {
				try {
					lock.lock();
					while(nextPrintWho != 1) {
						conditionA.await();
						System.out.println("ThreadA等待!");
					}
					for(int i = 0; i < 3; i++) {
						System.out.println("ThreadA " + (i + 1));
					}
					nextPrintWho = 2;
					conditionB.signalAll();
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				} finally {
					lock.unlock();
				}
			}
		};
		
		Thread threadB = new Thread(){
			@Override
			public void run() {
				try {
					lock.lock();
					while(nextPrintWho != 2) {
						conditionB.await();
						System.out.println("ThreadB等待!");
					}
					for(int i = 0; i < 3; i++) {
						System.out.println("ThreadB " + (i + 1));
					}
					nextPrintWho = 3;
					conditionC.signalAll();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				} finally {
					lock.unlock();
				}
			}
		};
		
		Thread threadC = new Thread() {
			public void run() {
				try {
					lock.lock();
					while (nextPrintWho != 3) {
						conditionC.await();
						System.out.println("ThreadC等待!");
					}
					for (int i = 0; i < 3; i++) {
						System.out.println("ThreadC " + (i + 1));
					}
					nextPrintWho = 1;
					conditionA.signalAll();
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					lock.unlock();
				}
			}
		};
		
		Thread[] aArray = new Thread[5];
		Thread[] bArray = new Thread[5];
		Thread[] cArray = new Thread[5];
		
		for(int i = 0; i < 5; i++) {
			aArray[i] = new Thread(threadA);
			bArray[i] = new Thread(threadB);
			cArray[i] = new Thread(threadC);
			
			aArray[i].start();
			bArray[i].start();
			cArray[i].start();
		}
	}
}
/*
result:
ThreadA 1
ThreadA 2
ThreadA 3
ThreadB 1
ThreadB 2
ThreadB 3
ThreadC 1
ThreadC 2
ThreadC 3
ThreadA 1
ThreadA 2
ThreadA 3
ThreadB 1
ThreadB 2
ThreadB 3
ThreadC 1
ThreadC 2
ThreadC 3
ThreadC等待!
ThreadC等待!
ThreadA 1
ThreadA 2
ThreadA 3
ThreadB等待!
ThreadB 1
ThreadB 2
ThreadB 3
ThreadB等待!
ThreadC等待!
ThreadC 1
ThreadC 2
ThreadC 3
ThreadA等待!
ThreadA 1
ThreadA 2
ThreadA 3
ThreadA等待!
ThreadB等待!
ThreadB 1
ThreadB 2
ThreadB 3
ThreadC等待!
ThreadC 1
ThreadC 2
ThreadC 3
ThreadC等待!
ThreadB等待!
ThreadA等待!
ThreadA 1
ThreadA 2
ThreadA 3
ThreadB等待!
ThreadB 1
ThreadB 2
ThreadB 3
ThreadC等待!
ThreadC 1
ThreadC 2
ThreadC 3
*/





































