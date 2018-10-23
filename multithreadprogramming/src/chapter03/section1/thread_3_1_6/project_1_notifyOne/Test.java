package chapter03.section1.thread_3_1_6.project_1_notifyOne;

public class Test {

	public static void main(String[] args) throws InterruptedException {

		Object lock = new Object();

		ThreadA a = new ThreadA(lock);
		a.start();

		ThreadB b = new ThreadB(lock);
		b.start();

		ThreadC c = new ThreadC(lock);
		c.start();

		Thread.sleep(1000);

		NotifyThread notifyThread = new NotifyThread(lock);
		notifyThread.start();
	}
}
/*
result:
begin wait() ThreadName=Thread-0
begin wait() ThreadName=Thread-1
begin wait() ThreadName=Thread-2
  end wait() ThreadName=Thread-0
  end wait() ThreadName=Thread-2
  end wait() ThreadName=Thread-1
 */