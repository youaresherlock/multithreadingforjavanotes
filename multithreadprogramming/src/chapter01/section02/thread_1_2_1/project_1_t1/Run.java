package chapter01.section02.thread_1_2_1.project_1_t1;

public class Run {
	public static void main(String args[]) {
		MyThread mythread = new MyThread(); //����
		mythread.start(); //�����ȴ�����
		System.out.println("���н���!");
	}
}

/*
result:
���н���!
MyThread

���н���!
MyThread
*/