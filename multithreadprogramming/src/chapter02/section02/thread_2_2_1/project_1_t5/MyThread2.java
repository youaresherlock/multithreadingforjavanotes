package chapter02.section02.thread_2_2_1.project_1_t5;

public class MyThread2 extends Thread{
	private Task task;
	
	public MyThread2(Task task) {
		this.task = task;
	}
	
	@Override
	public void run() {
		super.run();
		CommonUtils.beginTime2 = System.currentTimeMillis();
		task.doLongTimeTask();
		CommonUtils.endTime2 = System.currentTimeMillis();
	}
}
