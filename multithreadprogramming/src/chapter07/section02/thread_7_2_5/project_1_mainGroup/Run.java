package chapter07.section02.thread_7_2_5.project_1_mainGroup;

public class Run {
	
	public static void main(String[] args) {
		System.out.println("线程组名称: " 
				+ Thread.currentThread().getThreadGroup().getName());
		System.out.println("线程组中活动的线程数量: " 
				+ Thread.currentThread().getThreadGroup().activeCount());
		ThreadGroup newGroup = new ThreadGroup(Thread.currentThread()
				.getThreadGroup(), "newGroup");
		System.out.println("线程组中线程组的数量-加之后: " 
				+ Thread.currentThread().getThreadGroup().activeGroupCount()); //main线程组中的一个线程组
		System.out.println("父线程组名称: " 
				+ Thread.currentThread().getThreadGroup().getParent().getName());
	}
}
/*
result:
线程组名称: main
线程组中活动的线程数量: 1
线程组中线程组的数量-加之后: 1
父线程组名称: system
*/