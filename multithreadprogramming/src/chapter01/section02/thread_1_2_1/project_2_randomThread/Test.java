package chapter01.section02.thread_1_2_1.project_2_randomThread;

public class Test {

	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.setName("myThread");
			thread.start();
			
			for(int i = 0; i < 100; i++) {
				int time = (int) (Math.random() * 1000);
				Thread.sleep(time);
				System.out.println("main=" + Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

/*
result:
main=main
run=myThread
main=main
main=main
run=myThread
run=myThread
main=main
main=main
run=myThread
main=main
run=myThread
main=main
main=main
run=myThread
run=myThread
main=main
run=myThread
main=main
run=myThread
main=main
main=main
run=myThread
run=myThread
main=main
run=myThread
run=myThread
main=main
run=myThread
run=myThread
main=main
main=main
main=main
main=main
run=myThread
run=myThread
 */