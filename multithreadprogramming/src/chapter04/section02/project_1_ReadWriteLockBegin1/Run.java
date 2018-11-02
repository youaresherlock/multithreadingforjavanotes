package chapter04.section02.project_1_ReadWriteLockBegin1;

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
获得读锁A 1541148175910
获得读锁B 1541148175911
*/
































