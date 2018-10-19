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
同步方法addNum()后result:
Thread-1加了100之后的值是:100
Thread-3加了100之后的值是:201
Thread-4加了100之后的值是:302
Thread-2加了100之后的值是:403
Thread-0加了100之后的值是:504
505
不同步方法addNum()后result:
Thread-1加了100之后的值是:100
Thread-2加了100之后的值是:300
Thread-4加了100之后的值是:500
Thread-3加了100之后的值是:400
Thread-0加了100之后的值是:200
505
 */