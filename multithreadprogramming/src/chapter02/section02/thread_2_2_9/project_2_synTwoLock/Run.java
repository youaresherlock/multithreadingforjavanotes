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
�߳�����Ϊ: A��1539689461825����printA
�߳�����Ϊ��C��1539689461826����printC
�߳�����Ϊ��C��1539689461826�뿪printC
�߳�����Ϊ: A��1539689464825�뿪printA
�߳�����Ϊ��B��1539689464825����printB
�߳�����Ϊ��B��1539689464825�뿪printB
*/





































