package chapter02.section02.thread_2_2_9.project_1_synStaticMethod;

public class Run {
	public static void main(String[] args) {
		ThreadA a = new ThreadA();
		a.setName("A");
		a.start();
		
		ThreadB b = new ThreadB();
		b.setName("B");
		b.start();
	}
}
/*
result:
线程名称为: A在1539688152259进入printA
线程名称为: A在1539688155259离开printA
线程名称为: B在1539688155259进入printB
线程名称为: B在1539688155259离开printB
 */