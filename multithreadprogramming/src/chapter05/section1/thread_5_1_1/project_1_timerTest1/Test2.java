package chapter05.section1.thread_5_1_1.project_1_timerTest1;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class Test2 {
	public static void main(String[] args) {
		System.out.println("��ǰʱ��Ϊ: " + new Date());
		Calendar calendarRef = Calendar.getInstance();
		calendarRef.add(Calendar.SECOND, 10);
		Date runDate = calendarRef.getTime();
		
		MyTask task = new MyTask();
		//�ػ��߳�
		Timer timer = new Timer(true);
		timer.schedule(task, runDate);
	}
}
/*
result:
��ǰʱ��Ϊ: Sat Nov 20 13:09:39 CST 2017
*/
