package chapter04.section01.thread_4_1_7.project_1_ConditionTest;

import chapter02.section01.thread_2_1_8.project_1_synNotExtends.MyThreadA;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		MyService myService = new MyService();
		
		ThreadA a = new ThreadA(myService);
		a.start();
		
		ThreadB b = new ThreadB(myService);
		b.start();
	}
}
/*
打印☆
打印★
打印☆
打印★
打印☆
打印★
打印☆
打印★
打印☆
打印★
*/
