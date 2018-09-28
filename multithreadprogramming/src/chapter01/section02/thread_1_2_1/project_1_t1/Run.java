package chapter01.section02.thread_1_2_1.project_1_t1;

public class Run {
	public static void main(String args[]) {
		MyThread mythread = new MyThread(); //创建
		mythread.start(); //就绪等待运行
		System.out.println("运行结束!");
	}
}

/*
result:
运行结束!
MyThread

运行结束!
MyThread
*/