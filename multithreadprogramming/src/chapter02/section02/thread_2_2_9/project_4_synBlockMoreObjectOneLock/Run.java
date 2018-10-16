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
�߳�����Ϊ��A��1539691007700����printA
�߳�����Ϊ��A��1539691010702�뿪printA
�߳�����Ϊ��B��1539691010702����printB
�߳�����Ϊ��B��1539691010702�뿪printB
*/
