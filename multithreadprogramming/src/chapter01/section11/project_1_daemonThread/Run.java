package chapter01.section11.project_1_daemonThread;

public class Run {
	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.setDaemon(true); //����Ϊ�ػ��߳�
			thread.start();
			Thread.sleep(5000);
			System.out.println("���뿪thread����Ҳ���ٴ�ӡ�ˣ�Ҳ����ֹͣ��!");
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
/*
result:
i=1
i=2
i=3
i=4
i=5
���뿪thread����Ҳ���ٴ�ӡ�ˣ�Ҳ����ֹͣ��!
 */