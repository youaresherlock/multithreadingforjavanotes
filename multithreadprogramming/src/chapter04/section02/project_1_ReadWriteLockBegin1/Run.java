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
��ö���A 1541148175910
��ö���B 1541148175911
*/
































