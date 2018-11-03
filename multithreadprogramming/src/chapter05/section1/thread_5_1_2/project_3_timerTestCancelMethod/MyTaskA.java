package chapter05.section1.thread_5_1_2.project_3_timerTestCancelMethod;

import java.util.TimerTask;
import java.util.Date;

public class MyTaskA extends TimerTask{
	@Override
	public void run() {
		System.out.println("A run timer =" + new Date());
		this.cancel();
		System.out.println("A任务自己移除自己");
	}
}






















