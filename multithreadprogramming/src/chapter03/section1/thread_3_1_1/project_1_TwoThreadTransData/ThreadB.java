package chapter03.section1.thread_3_1_1.project_1_TwoThreadTransData;

public class ThreadB extends Thread{

	private MyList list;
	
	public ThreadB(MyList list) {
		super();
		this.list = list;
	}
	
	@Override
	public void run() {
		try {
			while (true) {
				System.out.println(list.size());
				//����?Ϊʲôû�������������ѯ��ⲻ��list.size��С��
				if (list.size() == 5) {
					System.out.println("==5�ˣ��߳�bҪ�˳��ˣ�");
					throw new InterruptedException();
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}























