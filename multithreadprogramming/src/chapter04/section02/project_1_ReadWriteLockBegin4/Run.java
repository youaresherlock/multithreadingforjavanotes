package chapter04.section02.project_1_ReadWriteLockBegin4;

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
获得写锁A 1541221271838
获得读锁B 1541221281841
*/
































