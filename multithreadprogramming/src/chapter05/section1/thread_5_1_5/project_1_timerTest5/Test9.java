package chapter05.section1.thread_5_1_5.project_1_timerTest5;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Test9 {

	static public class MyTask extends TimerTask {
		@Override
		public void run() {
			System.out.println("begin timer = " + new Date());
			System.out.println("  end timer = " + new Date());
		}
	}

	public static void main(String[] args) {
		MyTask task = new MyTask();
		System.out.println("����ִ��ʱ�䣺" + new Date());
		Calendar calendarRef = Calendar.getInstance();
		calendarRef.set(Calendar.SECOND, calendarRef.get(Calendar.SECOND) - 20);
		Date runDate = calendarRef.getTime();
		System.out.println("�ƻ�ִ��ʱ�䣺" + runDate);
		Timer timer = new Timer();
		timer.schedule(task, runDate, 2000);
	}
}
/*
result:
����ִ��ʱ�䣺Sat Nov 03 16:35:34 CST 2018
�ƻ�ִ��ʱ�䣺Sat Nov 03 16:35:14 CST 2018
begin timer = Sat Nov 03 16:35:34 CST 2018
  end timer = Sat Nov 03 16:35:34 CST 2018
begin timer = Sat Nov 03 16:35:36 CST 2018
  end timer = Sat Nov 03 16:35:36 CST 2018
begin timer = Sat Nov 03 16:35:38 CST 2018
  end timer = Sat Nov 03 16:35:38 CST 2018
begin timer = Sat Nov 03 16:35:40 CST 2018
*/
