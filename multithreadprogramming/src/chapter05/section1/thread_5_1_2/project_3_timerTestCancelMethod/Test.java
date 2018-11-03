package chapter05.section1.thread_5_1_2.project_3_timerTestCancelMethod;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class Test {
	
	public static void main(String[] args) {
		System.out.println("当前时间为："+ new Date());
		Calendar calendarRef1 = Calendar.getInstance();
		Date runDate1 = calendarRef1.getTime();
		System.out.println("计划时间为：" + runDate1);
		MyTaskA task1 = new MyTaskA();
		MyTaskB task2 = new MyTaskB();
		Timer timer = new  Timer();
		timer.schedule(task1, runDate1,4000);
		timer.schedule(task2, runDate1,4000);
	}
}
/*
result:
当前时间为：Sat Nov 03 15:05:28 CST 2018
计划时间为：Sat Nov 03 15:05:28 CST 2018
A run timer =Sat Nov 03 15:05:28 CST 2018
A任务自己移除自己
B run timer = Sat Nov 03 15:05:28 CST 2018
B run timer = Sat Nov 03 15:05:32 CST 2018
B run timer = Sat Nov 03 15:05:36 CST 2018
B run timer = Sat Nov 03 15:05:40 CST 2018
*/
