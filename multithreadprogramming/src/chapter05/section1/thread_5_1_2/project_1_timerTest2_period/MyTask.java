package chapter05.section1.thread_5_1_2.project_1_timerTest2_period;

import java.util.Date;
import java.util.TimerTask;

public class MyTask extends TimerTask {
	
	@Override
	public void run() {
		System.out.println("����ִ���ˣ� ʱ��Ϊ: " + new Date());
	}
}












