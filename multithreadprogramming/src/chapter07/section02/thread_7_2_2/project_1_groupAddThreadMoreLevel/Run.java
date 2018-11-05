package chapter07.section02.thread_7_2_2.project_1_groupAddThreadMoreLevel;

public class Run {
	public static void main(String[] args) {
		// ��main�������һ���߳���A��Ȼ�������A��������̶߳���Z
		// ����activeGroupCount()��activeCount()��ֵ���ǹ̶���
		// ��ϵͳ�л�����һ������
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		ThreadGroup group = new ThreadGroup(mainGroup, "A");
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				try {
					System.out.println("runMethod!");
					Thread.sleep(1000); //�̱߳���������״̬�ſ����������
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		};
		
		Thread newThread = new Thread(group, runnable);
		newThread.setName("z");
		newThread.start(); // �̱߳�������Ȼ��Ź鵽��A��
		
		ThreadGroup listGroup[] = new ThreadGroup[Thread.currentThread()
		                                          .getThreadGroup().activeGroupCount()];
		//java.lang.ThreadGroup.enumerate(ThreadGroup[] list):
		//���Ƶ����߳�����ָ�����������õ����л����
		Thread.currentThread().getThreadGroup().enumerate(listGroup);
		System.out.println("main�߳����ж��ٸ����߳���: " + listGroup.length + " ����Ϊ: "
				+ listGroup[0].getName()); //����ֻ��һ����
		Thread listThread[] = new Thread[listGroup[0].activeCount()];
		listGroup[0].enumerate(listThread);
		System.out.println(listThread[0].getName());
	}
}
/*
result:
main�߳����ж��ٸ����߳���: 1 ����Ϊ: A
runMethod!
z
 */








































