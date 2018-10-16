package chapter02.section02.thread_2_2_9.project_4_synBlockMoreObjectOneLock;

public class Run {
	public static void main(String[] args) {

		Service service1 = new Service();
		Service service2 = new Service();

		ThreadA a = new ThreadA(service1);
		a.setName("A");
		a.start();

		ThreadB b = new ThreadB(service2);
		b.setName("B");
		b.start();
	}
}
/*
result:
线程名称为：A在1539691007700进入printA
线程名称为：A在1539691010702离开printA
线程名称为：B在1539691010702进入printB
线程名称为：B在1539691010702离开printB
*/
