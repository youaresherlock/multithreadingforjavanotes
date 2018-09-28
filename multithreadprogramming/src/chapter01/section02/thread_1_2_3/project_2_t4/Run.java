package chapter01.section02.thread_1_2_3.project_2_t4;

public class Run {
	public static void main(String args[]) {
		MyThread myThread = new MyThread();
		Thread a = new Thread(myThread, "A");
		Thread b = new Thread(myThread, "B");
		Thread c = new Thread(myThread, "C");
		Thread d = new Thread(myThread, "D");
		Thread e = new Thread(myThread, "E");
		
		
		a.start();
		b.start();
		c.start();
		d.start();
		e.start();
	}
}

/*
result:
�� A ����, count=3
�� B ����, count=3
�� D ����, count=2
�� C ����, count=2
�� E ����, count=1

���ͬ������֮��Ľ��:
�� A ����, count=4
�� E ����, count=3
�� D ����, count=2
�� C ����, count=1
�� B ����, count=0
*/