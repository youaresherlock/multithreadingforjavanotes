package chapter03.section1.thread_3_1_8.project_1_waitHasParamMethod;

public class MyRunnable {
	static private Object lock = new Object();
	static private Runnable runnable1 = new Runnable() {
		@Override
		public void run() {
			try {
				synchronized(lock) {
					System.out.println("wait begin timer="
							+ System.currentTimeMillis());
					lock.wait(5000);
					System.out.println("wait   end timer="
							+ System.currentTimeMillis());
				}
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	};
	
	static private Runnable runnable2 = new Runnable() {
		@Override
		public void run() {
			synchronized(lock) {
				System.out.println("notify begin timer="
						+ System.currentTimeMillis());
				lock.notify();
				System.out.println("notify   end timer="
						+ System.currentTimeMillis());
			}
		}
	};
	
	public static void main(String[] args) throws InterruptedException{
		Thread t1 = new Thread(runnable1);
		t1.start();
		Thread.sleep(3000);
		Thread t2 = new Thread(runnable2);
		t2.start();
	}
}
/*
����ע�͵Ľ��result:
wait begin timer=1540343153258
wait   end timer=1540343158275
���Կ������˴�Լ5�����߳�t1���Զ�����
����ע�͵Ľ��result:
wait begin timer=1540343363801
notify begin timer=1540343366809
notify   end timer=1540343366809
wait   end timer=1540343366809
���Կ���3��󣬶Գ�WAITING״̬���߳̽����˻���
*/







































