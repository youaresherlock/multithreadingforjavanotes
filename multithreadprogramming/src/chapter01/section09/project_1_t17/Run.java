package chapter01.section09.project_1_t17;

public class Run {
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.start();
	}
}

/*
不带注释result:
用时: 11206毫秒!
加上注释result:
用时: 20毫秒!
 */