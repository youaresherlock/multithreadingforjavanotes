package chapter03.section1.thread_3_1_1.project_1_TwoThreadTransData;

public class Test {

	public static void main(String[] args) {
		MyList service = new MyList();

		ThreadA a = new ThreadA(service);
		a.setName("A");
		a.start();

		ThreadB b = new ThreadB(service);
		b.setName("B");
		b.start();
	}
}
/*
result:
.............
�����5��Ԫ��
==5�ˣ��߳�bҪ�˳��ˣ�
java.lang.InterruptedException
	at chapter03.section1.thread_3_1_1.project_1_TwoThreadTransData.ThreadB.run(ThreadB.java:20)
�����6��Ԫ��
�����7��Ԫ��
�����8��Ԫ��
�����9��Ԫ��
�����10��Ԫ��
*/