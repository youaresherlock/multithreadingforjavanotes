package chapter05.section1.thread_5_1_1.project_2_timerTest2;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("��ǰʱ��Ϊ: " + new Date());
		Calendar calendarRef = Calendar.getInstance();
		calendarRef.set(Calendar.SECOND,  calendarRef.get(Calendar.SECOND) - 10);
		Date runDate = calendarRef.getTime();
		System.out.println("�ƻ�ʱ��Ϊ: " + runDate);
		
		MyTask task = new MyTask();
		Timer timer = new Timer();
		timer.schedule(task, runDate);
	}
}
/*
result:
��ǰʱ��Ϊ: Sat Nov 03 14:18:09 CST 2018
�ƻ�ʱ��Ϊ: Sat Nov 03 14:18:08 CST 2018
����ִ���ˣ� ʱ��Ϊ: Sat Nov 03 14:18:09 CST 2018
*/


































