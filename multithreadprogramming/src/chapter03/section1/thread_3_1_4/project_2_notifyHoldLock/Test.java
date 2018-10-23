package chapter03.section1.thread_3_1_4.project_2_notifyHoldLock;

public class Test {
	public static void main(String[] args) throws InterruptedException {

		Object lock = new Object();

		ThreadA a = new ThreadA(lock);
		a.start();

		NotifyThread notifyThread = new NotifyThread(lock);
		notifyThread.start();

		synNotifyMethodThread c = new synNotifyMethodThread(lock);
		c.start();
	}
}
/*
result:
begin wait() ThreadName=Thread-0
begin notify() ThreadName=Thread-1 time=1540283462655
  end notify() ThreadName=Thread-1 time=1540283467660
  end wait() ThreadName=Thread-0
begin notify() ThreadName=Thread-2 time=1540283467660
  end notify() ThreadName=Thread-2 time=154028347266
 */
