package chapter02.section03.thread_2_3_3.project_1_t16;

public class RunThread extends Thread{
//	volatile private boolean isRunning = true;
	private boolean isRunning = true;
	
	public boolean isRunning() {
		return isRunning;
	}

	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}
	
	@Override
	public void run() {
		System.out.println("����run��");
		while(isRunning == true) {
		}
		System.out.println("�̱߳�ֹͣ�ˣ�");
	}
 }
