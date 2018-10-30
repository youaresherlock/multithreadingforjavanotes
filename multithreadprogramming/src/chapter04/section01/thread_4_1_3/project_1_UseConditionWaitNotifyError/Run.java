package chapter04.section01.thread_4_1_3.project_1_UseConditionWaitNotifyError;

public class Run {
	public static void main(String[] args) {
		MyService service = new MyService();
		
		ThreadA a = new ThreadA(service);
		a.start();
	}
}
/*
result:
Exception in thread "Thread-0" java.lang.IllegalMonitorStateException
	at java.base/java.util.concurrent.locks.ReentrantLock$Sync.tryRelease(Unknown Source)
	at java.base/java.util.concurrent.locks.AbstractQueuedSynchronizer.release(Unknown Source)
	at java.base/java.util.concurrent.locks.AbstractQueuedSynchronizer.fullyRelease(Unknown Source)
	at java.base/java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(Unknown Source)
	at chapter04.section01.thread_4_1_3.project_1_UseConditionWaitNotifyError.MyService.await(MyService.java:13)
	at chapter04.section01.thread_4_1_3.project_1_UseConditionWaitNotifyError.ThreadA.run(ThreadA.java:13)
*/
