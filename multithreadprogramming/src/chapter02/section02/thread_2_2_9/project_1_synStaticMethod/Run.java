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
�߳�����Ϊ: A��1539688152259����printA
�߳�����Ϊ: A��1539688155259�뿪printA
�߳�����Ϊ: B��1539688155259����printB
�߳�����Ϊ: B��1539688155259�뿪printB
 */