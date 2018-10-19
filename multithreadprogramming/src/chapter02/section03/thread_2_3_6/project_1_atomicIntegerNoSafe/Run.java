package chapter02.section03.thread_2_3_6.project_1_atomicIntegerNoSafe;

public class Run {
	public static void main(String[] args) {
		try {
			MyService service = new MyService();
			
			MyThread[] array = new MyThread[5];
			for(int i = 0; i < array.length; i++) {
				array[i] = new MyThread(service);
			}
			
			for(int i = 0; i < array.length; i++) {
				array[i].start();
			}
			
			Thread.sleep(1000);
			System.out.println(service.aiRef.get());
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

/*
ͬ������addNum()��result:
Thread-1����100֮���ֵ��:100
Thread-3����100֮���ֵ��:201
Thread-4����100֮���ֵ��:302
Thread-2����100֮���ֵ��:403
Thread-0����100֮���ֵ��:504
505
��ͬ������addNum()��result:
Thread-1����100֮���ֵ��:100
Thread-2����100֮���ֵ��:300
Thread-4����100֮���ֵ��:500
Thread-3����100֮���ֵ��:400
Thread-0����100֮���ֵ��:200
505
 */