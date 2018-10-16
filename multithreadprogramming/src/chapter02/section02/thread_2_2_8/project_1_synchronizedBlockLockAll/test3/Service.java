package chapter02.section02.thread_2_2_8.project_1_synchronizedBlockLockAll.test3;

public class Service {
	
	public void testMethod1(MyObject object) {
		synchronized(object) {
			try {
				System.out.println("testMethod1 ___getLock time="
						+ System.currentTimeMillis() + " run ThreadName="
						+ Thread.currentThread().getName());
				Thread.sleep(5000);
				System.out.println("testMethod1 releaseLock time="
						+ System.currentTimeMillis() + " run ThreadName="
						+ Thread.currentThread().getName());
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}




































