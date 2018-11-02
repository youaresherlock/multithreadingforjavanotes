package chapter04.section02.project_1_ReadWriteLockBegin3;

public class Run {
	public static void main(String[] args) throws InterruptedException{
		Service service = new Service();
		ThreadA a = new ThreadA(service);
		a.setName("A");
		a.start();
		
		Thread.sleep(1000);
		
		ThreadB b = new ThreadB(service);
		b.setName("B");
		b.start();
	}
}
/*
result:
获得读锁A 1541148794846
获得写锁B 1541148804848
*/
































