package chapter05.section1.thread_5_1_2.project_2_timerTest2_periodLater;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("��ǰʱ��Ϊ: " + new Date());
		Calendar calendarRef = Calendar.getInstance();
		calendarRef.add(Calendar.SECOND, 10);
		Date runDate = calendarRef.getTime();
		System.out.println("�ƻ�ʱ��Ϊ: " + runDate);
		
		MyTask task = new MyTask();
		Timer timer = new Timer();
		timer.schedule(task, runDate, 3000);
	}
}
/*
result:
��ǰʱ��Ϊ: Sat Nov 03 14:56:34 CST 2018
�ƻ�ʱ��Ϊ: Sat Nov 03 14:56:44 CST 2018
A begin timer = Sat Nov 03 14:56:44 CST 2018
A   end timer = Sat Nov 03 14:56:49 CST 2018
A begin timer = Sat Nov 03 14:56:49 CST 2018
A   end timer = Sat Nov 03 14:56:54 CST 2018
A begin timer = Sat Nov 03 14:56:54 CST 2018
A   end timer = Sat Nov 03 14:56:59 CST 2018
*/


































