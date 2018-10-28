package chapter04.section01.thread_4_1_1.project_1_ReentrantLockTest;

public class Run {
	
	public static void main(String[] args) {

		MyService service = new MyService();

		MyThread a1 = new MyThread(service);
		MyThread a2 = new MyThread(service);
		MyThread a3 = new MyThread(service);
		MyThread a4 = new MyThread(service);
		MyThread a5 = new MyThread(service);

		a1.start();
		a2.start();
		a3.start();
		a4.start();
		a5.start();
	}
}
/*
result:
ThreadName=Thread-3 1
ThreadName=Thread-3 2
ThreadName=Thread-3 3
ThreadName=Thread-3 4
ThreadName=Thread-3 5
ThreadName=Thread-0 1
ThreadName=Thread-0 2
ThreadName=Thread-0 3
ThreadName=Thread-0 4
ThreadName=Thread-0 5
ThreadName=Thread-1 1
ThreadName=Thread-1 2
ThreadName=Thread-1 3
ThreadName=Thread-1 4
ThreadName=Thread-1 5
ThreadName=Thread-4 1
ThreadName=Thread-4 2
ThreadName=Thread-4 3
ThreadName=Thread-4 4
ThreadName=Thread-4 5
ThreadName=Thread-2 1
ThreadName=Thread-2 2
ThreadName=Thread-2 3
ThreadName=Thread-2 4
ThreadName=Thread-2 5
*/



























