package chapter07.section02.thread_7_2_3.project_1_autoAddGroup;

public class Run {
	public static void main(String[] args) {
		System.out.println("A���̣߳�"+Thread.currentThread().getName()
				+ " �������߳�����Ϊ��"
				+ Thread.currentThread().getThreadGroup().getName()+ " "
				+ " �����߳���������"+Thread.currentThread().getThreadGroup().activeGroupCount());
		ThreadGroup group=new ThreadGroup("�µ���");
		System.out.println("B���̣߳�"+Thread.currentThread().getName()
				+ " �������߳�����Ϊ��"
				+ Thread.currentThread().getThreadGroup().getName()+ " "
				+" �����߳���������"+Thread.currentThread().getThreadGroup().activeGroupCount());
		ThreadGroup[] threadGroup=new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];
		Thread.currentThread().getThreadGroup().enumerate(threadGroup);
		for (int i = 0; i < threadGroup.length; i++) {
			System.out.println("��һ���߳�������Ϊ��"+threadGroup[i].getName());
		}
	}
}
/*
result:
A���̣߳�main �������߳�����Ϊ��main  �����߳���������0
B���̣߳�main �������߳�����Ϊ��main  �����߳���������1
��һ���߳�������Ϊ���µ���
 */








































