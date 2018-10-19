package chapter02.section02.thread_2_2_15.project_1_innerTest2;

import chapter02.section02.thread_2_2_15.project_1_innerTest2.OutClass.InnerClass1;
import chapter02.section02.thread_2_2_15.project_1_innerTest2.OutClass.InnerClass2;

public class Run {
	public static void main(String[] args) {
		final InnerClass1 in1 = new InnerClass1();
		final InnerClass2 in2 = new InnerClass2();
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				in1.method1(in2);
			}
		}, "T1");
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				in1.method2();
			}
		}, "T2");
		Thread t3 = new Thread(new Runnable() {
			public void run() {
				in2.method1();
			}
		}, "T3");
		t1.start();
		t2.start();
		t3.start();
	}
}
/*
result:
T1 进入InnerClass1类中的method1方法
i=0
T2 进入InnerClass1类中的method2方法
j=0
j=1
i=1
i=2
j=2
i=3
j=3
j=4
i=4
j=5
i=5
i=6
j=6
j=7
i=7
j=8
i=8
i=9
j=9
T2 离开InnerClass1类中的method2方法
T1 离开InnerClass1类中的method1方法
T3 进入InnerClass2类中的method1方法
k=0
k=1
k=2
k=3
k=4
k=5
k=6
k=7
k=8
k=9
T3 离开InnerClass2类中的method1方法
*/





































