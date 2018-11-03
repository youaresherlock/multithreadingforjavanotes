package chapter05.section1.thread_5_1_1.project_1_timerTest1;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("当前时间为: " + new Date());
		Calendar calendarRef = Calendar.getInstance();
		calendarRef.add(Calendar.SECOND, 10);
		Date runDate = calendarRef.getTime();
		
		MyTask task = new MyTask();
		Timer timer = new Timer();
		timer.schedule(task, runDate);
	}
}
/*
result:
当前时间为: Sat Nov 20 13:09:39 CST 2017
任务执行了， 时间为: Sat Nov 20 13:09:49 CST 2017
*/


































