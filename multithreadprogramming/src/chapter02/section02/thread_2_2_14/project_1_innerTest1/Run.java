package chapter02.section02.thread_2_2_14.project_1_innerTest1;
import chapter02.section02.thread_2_2_14.project_1_innerTest1.OutClass.Inner;

public class Run {
	public static void main(String[] args) {
		final Inner inner = new Inner();
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
			inner.method1();
			}	
		}, "A");
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				inner.method2();
			}
		}, "B");
		
		t1.start();
		t2.start();
	}
}
/*
可以看到结果是异步执行的，因为线程持有不同的"对象监视器"
result:
......
B i=8
A i=8
A i=9
B i=9
A i=10
......
*/

















