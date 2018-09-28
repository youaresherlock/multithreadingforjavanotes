package chapter01.section02.thread_1_2_4.project_1_smaeNum;

public class Run {
	
	
	public static void main(String[] args) {
		MyThread run = new MyThread();
		
		Thread t1 = new Thread(run);
		Thread t2 = new Thread(run);
		Thread t3 = new Thread(run);
		Thread t4 = new Thread(run);
		Thread t5 = new Thread(run);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
	
}

/*
result:
i=4 threadName=Thread-3
i=1 threadName=Thread-4
i=2 threadName=Thread-5
i=3 threadName=Thread-2
i=5 threadName=Thread-1
 */