package chapter02.section03.thread_2_3_3.project_1_t16;

public class Run {
	public static void main(String[] args) {
		try {
			RunThread thread = new RunThread();
			thread.start();
			Thread.sleep(1000);
			thread.setRunning(false);
			System.out.println("�Ѿ���ֵΪfalse");
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
/*
result:
����run��
�Ѿ���ֵΪfalse����run��
����������ѭ��
����volatile�ؼ��ֺ�result:
����run��
�Ѿ���ֵΪfalse
�̱߳�ֹͣ�ˣ�
 */