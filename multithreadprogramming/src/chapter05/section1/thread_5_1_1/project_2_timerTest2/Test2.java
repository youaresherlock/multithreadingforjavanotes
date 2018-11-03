package chapter05.section1.thread_5_1_1.project_2_timerTest2;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class Test2 {
	public static void main(String[] args) {
		System.out.println("当前时间为: " + new Date());
		Calendar calendarRef1 = Calendar.getInstance();
		calendarRef1.add(Calendar.SECOND, 10);
		Date runDate1 = calendarRef1.getTime();
		System.out.println("计划时间为: " + runDate1);
		
		Calendar calendarRef2 = Calendar.getInstance();
		calendarRef2.add(Calendar.SECOND, 15);
		Date runDate2 = calendarRef2.getTime();
		System.out.println("计划时间为: " + runDate2);
		
		MyTask task1 = new MyTask();
		MyTask task2 = new MyTask();
		Timer timer = new Timer();
		timer.schedule(task1, runDate1);
		timer.schedule(task2, runDate2);
	}
}
/*
result:
当前时间为: Sat Nov 03 14:34:47 CST 2018
计划时间为: Sat Nov 03 14:34:57 CST 2018
计划时间为: Sat Nov 03 14:35:02 CST 2018
任务执行了， 时间为: Sat Nov 03 14:34:57 CST 2018
任务执行了， 时间为: Sat Nov 03 14:35:02 CST 2018
*/

















