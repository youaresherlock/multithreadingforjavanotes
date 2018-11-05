package chapter07.section02.thread_7_2_5.project_1_mainGroup;

public class Run {
	
	public static void main(String[] args) {
		System.out.println("�߳�������: " 
				+ Thread.currentThread().getThreadGroup().getName());
		System.out.println("�߳����л���߳�����: " 
				+ Thread.currentThread().getThreadGroup().activeCount());
		ThreadGroup newGroup = new ThreadGroup(Thread.currentThread()
				.getThreadGroup(), "newGroup");
		System.out.println("�߳������߳��������-��֮��: " 
				+ Thread.currentThread().getThreadGroup().activeGroupCount()); //main�߳����е�һ���߳���
		System.out.println("���߳�������: " 
				+ Thread.currentThread().getThreadGroup().getParent().getName());
	}
}
/*
result:
�߳�������: main
�߳����л���߳�����: 1
�߳������߳��������-��֮��: 1
���߳�������: system
*/