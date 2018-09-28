package chapter01.section03.project_1_t6;

public class Run2 {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();
//		myThread.run(); //结果是由main主线程执行  结果是 run方法的打印: main
	}
}


/*

result:
构造方法的打印: main
run方法的打印: Thread-0
 */