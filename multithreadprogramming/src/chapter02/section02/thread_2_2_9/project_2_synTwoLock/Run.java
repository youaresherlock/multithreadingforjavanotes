package chapter02.section02.thread_2_2_9.project_2_synTwoLock;

public class Run {
	public static void main(String[] args) {
		
		Service service = new Service();
		
		ThreadA a = new ThreadA(service);
		a.setName("A");
		a.start();
		
		ThreadB b = new ThreadB(service);
		b.setName("B");
		b.start();
		
		ThreadC c = new ThreadC(service);
		c.setName("C");
		c.start();
	}
}
/*
result:
线程名称为: A在1539689461825进入printA
线程名称为：C在1539689461826进入printC
线程名称为：C在1539689461826离开printC
线程名称为: A在1539689464825离开printA
线程名称为：B在1539689464825进入printB
线程名称为：B在1539689464825离开printB
*/





































