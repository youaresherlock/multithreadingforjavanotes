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
由 A 计算, count=3
由 B 计算, count=3
由 D 计算, count=2
由 C 计算, count=2
由 E 计算, count=1

添加同步操作之后的结果:
由 A 计算, count=4
由 E 计算, count=3
由 D 计算, count=2
由 C 计算, count=1
由 B 计算, count=0
*/