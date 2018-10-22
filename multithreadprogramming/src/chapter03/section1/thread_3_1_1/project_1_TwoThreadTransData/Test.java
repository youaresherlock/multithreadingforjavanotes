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
添加了5个元素
==5了，线程b要退出了！
java.lang.InterruptedException
	at chapter03.section1.thread_3_1_1.project_1_TwoThreadTransData.ThreadB.run(ThreadB.java:20)
添加了6个元素
添加了7个元素
添加了8个元素
添加了9个元素
添加了10个元素
*/