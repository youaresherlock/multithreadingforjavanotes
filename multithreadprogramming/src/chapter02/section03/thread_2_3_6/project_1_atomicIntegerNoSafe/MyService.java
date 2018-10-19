package chapter02.section03.thread_2_3_6.project_1_atomicIntegerNoSafe;

import java.util.concurrent.atomic.AtomicLong;

public class MyService {
	
	public static AtomicLong aiRef = new AtomicLong();
	
	public void addNum() {
//	synchronized public void addNum() {
		System.out.println(Thread.currentThread().getName() + "加了100之后的值是:"
				+ aiRef.addAndGet(100));
		aiRef.addAndGet(1);
	}
}




















