package chapter05.section1.thread_5_1_2.project_4_TimerCancelMethod;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class Test {
	
	public static void main(String[] args) throws InterruptedException{
		System.out.println("��ǰʱ��Ϊ��" + new Date());
		Calendar calendarRef1 = Calendar.getInstance();
		Date runDate1 = calendarRef1.getTime();
		System.out.println("�ƻ�ʱ��Ϊ��" + runDate1);
		MyTaskA task1 = new MyTaskA();
		MyTaskB task2 = new MyTaskB();
		Timer timer = new Timer();
		timer.schedule(task1, runDate1, 2000);
		timer.schedule(task2, runDate1, 2000);
		Thread.sleep(10000);
		timer.cancel();
	}	
}
/*
result:
��ǰʱ��Ϊ��Sat Nov 03 15:16:35 CST 2018
�ƻ�ʱ��Ϊ��Sat Nov 03 15:16:35 CST 2018
A run timer = Sat Nov 03 15:16:35 CST 2018
B run timer = Sat Nov 03 15:16:35 CST 2018
B run timer = Sat Nov 03 15:16:37 CST 2018
A run timer = Sat Nov 03 15:16:37 CST 2018
A run timer = Sat Nov 03 15:16:39 CST 2018
B run timer = Sat Nov 03 15:16:39 CST 2018
B run timer = Sat Nov 03 15:16:41 CST 2018
A run timer = Sat Nov 03 15:16:41 CST 2018
A run timer = Sat Nov 03 15:16:43 CST 2018
B run timer = Sat Nov 03 15:16:43 CST 2018
*/
