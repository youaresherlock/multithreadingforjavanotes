package chapter07.section02.thread_7_2_4.project_1_getGroupParent;

public class Run {
	
	public static void main(String[] args) {
		System.out.println("�̣߳�" + Thread.currentThread().getName()
				+ " ���ڵ��߳�����Ϊ��"
				+ Thread.currentThread().getThreadGroup().getName());
		System.out
				.println("main�߳����ڵ��߳���ĸ��߳���������ǣ�"
						+ Thread.currentThread().getThreadGroup().getParent()
								.getName());
		System.out.println("main�߳����ڵ��߳���ĸ��߳���ĸ��߳���������ǣ�"
				+ Thread.currentThread().getThreadGroup().getParent()
						.getParent().getName());
	}
}
/*
result:
�̣߳�main ���ڵ��߳�����Ϊ��main
main�߳����ڵ��߳���ĸ��߳���������ǣ�system
Exception in thread "main" java.lang.NullPointerException
	at chapter07.section02.thread_7_2_4.project_1_getGroupParent.Run.main(Run.java:15)
*/