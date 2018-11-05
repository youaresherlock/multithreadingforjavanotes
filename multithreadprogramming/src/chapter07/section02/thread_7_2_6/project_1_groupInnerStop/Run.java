package chapter07.section02.thread_7_2_6.project_1_groupInnerStop;

public class Run {
	public static void main(String[] args) {
		try {
			ThreadGroup group = new ThreadGroup("Clarence");
			
			for(int i = 0; i < 5; i++) {
				MyThread thread = new MyThread(group, "�߳�" + (i + 1));
				thread.start();
			}
			Thread.sleep(5000);
			group.interrupt();
			System.out.println("������interrupt()����");
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("ͣ��ͣ��!");
			e.printStackTrace();
		}
	}
}

/*
result:
ThreadName=�߳�1׼����ʼ��ѭ���� :)
ThreadName=�߳�5׼����ʼ��ѭ���� :)
ThreadName=�߳�4׼����ʼ��ѭ���� :)
ThreadName=�߳�3׼����ʼ��ѭ���� :)
ThreadName=�߳�2׼����ʼ��ѭ���� :)
������interrupt()����
ThreadName=�߳�5������ :)
ThreadName=�߳�1������ :)
ThreadName=�߳�3������ :)
ThreadName=�߳�4������ :)
ThreadName=�߳�2������ :)
*/


































