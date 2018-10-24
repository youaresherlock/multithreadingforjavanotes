package chapter03.section1.thread_3_1_9.project_1_firstNotify;

public class MyRun {
	
	private String lock = new String("");
	private boolean isFirstRunB = false;
	
	private Runnable runnableA = new Runnable(){
		@Override
		public void run() {
			try {
				synchronized(lock) {
					while(isFirstRunB == false) {
						System.out.println("begin wait");
						lock.wait();
						System.out.println("  end wait");
					}
				}
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	};
	
	private Runnable runnableB = new Runnable() {
		@Override
		public void run() {
			synchronized(lock) {
				System.out.println("begin notify");
				lock.notify();
				System.out.println("  end notify");
				isFirstRunB = true;
			}
		}
	};
	
	public static void main(String[] args) throws InterruptedException {
		MyRun run = new MyRun();
		
//		Thread a = new Thread(run.runnableA);
//		a.start();
//		
//		Thread.sleep(100);
//		
//		Thread b = new Thread(run.runnableB);
//		b.start();
		
		Thread b = new Thread(run.runnableB);
		b.start();
		
		Thread.sleep(100);
		
		Thread a = new Thread(run.runnableA);
		a.start();
	}
}
/*
不替换成注释内容result:
begin notify
  end notify
这是因为notify提早通知了，如果发出notify操作时没有
处于阻塞状态中的线程，那么该命令将被忽略
result:
begin wait
begin notify
  end notify
  end wait
*/


































