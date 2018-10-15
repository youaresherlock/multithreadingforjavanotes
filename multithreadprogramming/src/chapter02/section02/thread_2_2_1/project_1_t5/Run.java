package chapter02.section02.thread_2_2_1.project_1_t5;

public class Run {
	public static void main(String[] args) {
		Task task = new Task();
		
		MyThread1 thread1 = new MyThread1(task);
		thread1.start();
		
		MyThread2 thread2 = new MyThread2(task);
		thread2.start();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		long beginTime = CommonUtils.beginTime1;
		if(CommonUtils.beginTime2 < CommonUtils.beginTime1) {
			beginTime = CommonUtils.beginTime2;
		}
		
		long endTime = CommonUtils.endTime1;
		if(CommonUtils.endTime2 > CommonUtils.endTime1) {
			endTime = CommonUtils.endTime2;
		}
		
		System.out.println("耗时: " + ((endTime - beginTime) / 1000));
		
	}
}
/*
带有注释的result:
begin task
长时间处理任务后从远程返回的值1threadName=Thread-0
长时间处理任务后从远程返回的值2threadName=Thread-0
end task
begin task
长时间处理任务后从远程返回的值1threadName=Thread-1
长时间处理任务后从远程返回的值2threadName=Thread-1
end task
耗时: 6
不带注释的result:
begin task
begin task
长时间处理任务后从远程返回的值1threadName=Thread-1
长时间处理任务后从远程返回的值2threadName=Thread-0
长时间处理任务后从远程返回的值1threadName=Thread-0
长时间处理任务后从远程返回的值2threadName=Thread-0
end task
end task
耗时: 3
*/




























