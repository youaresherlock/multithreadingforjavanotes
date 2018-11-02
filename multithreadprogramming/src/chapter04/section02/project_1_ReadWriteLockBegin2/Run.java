package chapter04.section02.project_1_ReadWriteLockBegin2;

public class Run {
	public static void main(String[] args) {
		Service service = new Service();
		ThreadA a = new ThreadA(service);
		a.setName("A");
		ThreadB b = new ThreadB(service);
		b.setName("B");
		
		a.start();
		b.start();
	}
}
/*
result:
获得写锁A 1541148411610
获得写锁B 1541148421610
*/
































