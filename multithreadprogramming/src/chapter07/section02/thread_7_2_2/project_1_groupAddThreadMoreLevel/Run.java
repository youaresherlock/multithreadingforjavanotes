package chapter07.section02.thread_7_2_2.project_1_groupAddThreadMoreLevel;

public class Run {
	public static void main(String[] args) {
		// 在main组中添加一个线程组A，然后在这个A组中添加线程对象Z
		// 方法activeGroupCount()和activeCount()的值不是固定的
		// 是系统中环境的一个快照
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		ThreadGroup group = new ThreadGroup(mainGroup, "A");
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				try {
					System.out.println("runMethod!");
					Thread.sleep(1000); //线程必须在运行状态才可以受组管理
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		};
		
		Thread newThread = new Thread(group, runnable);
		newThread.setName("z");
		newThread.start(); // 线程必须启动然后才归到组A中
		
		ThreadGroup listGroup[] = new ThreadGroup[Thread.currentThread()
		                                          .getThreadGroup().activeGroupCount()];
		//java.lang.ThreadGroup.enumerate(ThreadGroup[] list):
		//复制到该线程组中指定的数组引用的所有活动子组
		Thread.currentThread().getThreadGroup().enumerate(listGroup);
		System.out.println("main线程中有多少个子线程组: " + listGroup.length + " 名字为: "
				+ listGroup[0].getName()); //这里只有一个组
		Thread listThread[] = new Thread[listGroup[0].activeCount()];
		listGroup[0].enumerate(listThread);
		System.out.println(listThread[0].getName());
	}
}
/*
result:
main线程中有多少个子线程组: 1 名字为: A
runMethod!
z
 */








































