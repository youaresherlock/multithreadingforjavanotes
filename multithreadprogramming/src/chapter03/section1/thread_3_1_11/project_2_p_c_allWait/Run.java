package chapter03.section1.thread_3_1_11.project_2_p_c_allWait;

public class Run {
	public static void main(String[] args) throws InterruptedException{
		
		String lock = new String("");
		P p =new P(lock);
		C r = new C(lock);
		
		ThreadP[] pThread = new ThreadP[2];
		ThreadC[] rThread = new ThreadC[2];
		
		for(int i = 0; i < 2; i++) {
			pThread[i] = new ThreadP(p);
			pThread[i].setName("生产者" + (i + 1));
			
			rThread[i] = new ThreadC(r);
			rThread[i].setName("消费者" + (i + 1));
			
			pThread[i].start();
			rThread[i].start();
		}
		
		Thread.sleep(5000);
		/**
		 * Thread.currentThread().getThreadGroup()返回当前线程的所属线程组
		 * 当前所有线程包括main线程都属于main线程组，main线程组属于system线程组
		 * ThreadGroup类的activeCount()方法返回当前线程组的子线程组和active线程数量
		 * public int enumerate(Thread list[])方法用来将线程组中的内容拷贝进去
		 */
//		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		Thread[] threadArray = new Thread[Thread.currentThread()
		                                  .getThreadGroup().activeCount()];
		Thread.currentThread().getThreadGroup().enumerate(threadArray);
		
		for(Thread thread : threadArray) {
			System.out.println(thread.getName() + " " 
					+ thread.getState());
		}
		
	}
}
/*
result:
......................
消费者 消费者1 RUNNABLE了
消费者 消费者1 WAITING了#
消费者 消费者2 WAITING了#
生产者 生产者2 RUNNABLE了
生产者 生产者2 WAITING了*
生产者 生产者1 WAITING了*
system
main RUNNABLE
生产者1 WAITING
消费者1 WAITING
生产者2 WAITING
消费者2 WAITING
*/
















































