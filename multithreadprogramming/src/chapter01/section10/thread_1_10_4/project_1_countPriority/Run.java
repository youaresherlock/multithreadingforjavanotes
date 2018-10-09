package chapter01.section10.thread_1_10_4.project_1_countPriority;

public class Run {
	public static void main(String[] args) {
		try {
			ThreadA a = new ThreadA();
			a.setPriority(Thread.NORM_PRIORITY - 3);
			a.start();
			
			ThreadB b = new ThreadB();
			b.setPriority(Thread.NORM_PRIORITY + 3);
			b.start();
			
			Thread.sleep(2000);
			a.stop();
			b.stop();
			
			System.out.println("a=" + a.getCount());
			System.out.println("b=" + b.getCount());
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
/*
result:
a=1281551366
b=1284108671
可以看到优先级高的运行的快一些
*/

















