package chapter05.section1.thread_5_1_3.project_1_timerTest3;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run {
	static public class MyTask extends TimerTask{
		@Override 
		public void run() {
			System.out.println("������! ʱ��Ϊ: " + new Date());
		}
	}
	
	public static void main(String[] args) {
		MyTask task = new MyTask();
		Timer timer = new Timer();
		System.out.println("��ǰʱ��: " + new Date());
		timer.schedule(task, 7000);
	}
}
/*
result:
��ǰʱ��: Sat Nov 03 15:49:22 CST 2018
������! ʱ��Ϊ: Sat Nov 03 15:49:29 CST 2018
*/






























