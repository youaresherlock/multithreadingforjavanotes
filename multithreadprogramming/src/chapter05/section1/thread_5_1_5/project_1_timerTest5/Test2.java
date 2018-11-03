package chapter05.section1.thread_5_1_5.project_1_timerTest5;

import java.util.Timer;
import java.util.TimerTask;


public class Test2 {
	
	static public class MyTask extends TimerTask {
		@Override
		public void run() {
			try {
				System.out.println("begin timer = "+ System.currentTimeMillis());
				Thread.sleep(1000);
				System.out.println("  end timer = "+ System.currentTimeMillis());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		MyTask task = new MyTask();
		System.out.println("当前时间："+System.currentTimeMillis());
		Timer timer = new Timer();
		timer.schedule(task,3000,4000);
	} 
}
/*
result:
当前时间：1541233293229
begin timer = 1541233296231
  end timer = 1541233297231
begin timer = 1541233300232
  end timer = 1541233301233
begin timer = 1541233304233
*/
