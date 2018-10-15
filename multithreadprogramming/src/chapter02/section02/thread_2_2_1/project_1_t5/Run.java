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
		
		System.out.println("��ʱ: " + ((endTime - beginTime) / 1000));
		
	}
}
/*
����ע�͵�result:
begin task
��ʱ�䴦��������Զ�̷��ص�ֵ1threadName=Thread-0
��ʱ�䴦��������Զ�̷��ص�ֵ2threadName=Thread-0
end task
begin task
��ʱ�䴦��������Զ�̷��ص�ֵ1threadName=Thread-1
��ʱ�䴦��������Զ�̷��ص�ֵ2threadName=Thread-1
end task
��ʱ: 6
����ע�͵�result:
begin task
begin task
��ʱ�䴦��������Զ�̷��ص�ֵ1threadName=Thread-1
��ʱ�䴦��������Զ�̷��ص�ֵ2threadName=Thread-0
��ʱ�䴦��������Զ�̷��ص�ֵ1threadName=Thread-0
��ʱ�䴦��������Զ�̷��ص�ֵ2threadName=Thread-0
end task
end task
��ʱ: 3
*/




























