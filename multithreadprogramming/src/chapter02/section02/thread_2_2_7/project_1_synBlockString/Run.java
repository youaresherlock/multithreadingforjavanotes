package chapter02.section02.thread_2_2_7.project_1_synBlockString;

public class Run {
	
	public static void main(String[] args) {
		Service service = new Service();
		
		ThreadA a = new ThreadA(service);
		a.setName("A");
		a.start();
		
		ThreadB b = new ThreadB(service);
		b.setName("B");
		b.start();
	}
}

/*
��anyString��setUsernamePassword�еľֲ�������ʱ��
�첽ִ��
result:
�߳�����Ϊ: A��1539617319796����ͬ����
�߳�����Ϊ: B��1539617319797����ͬ����
�߳�����Ϊ: A��1539617322796�뿪ͬ����
�߳�����Ϊ: B��1539617322797�뿪ͬ����

��anyString��Service���е�ʵ��������ʱ��
ͬ��ִ��
result:
�߳�����Ϊ: A��1539656559451����ͬ����
�߳�����Ϊ: A��1539656562451�뿪ͬ����
�߳�����Ϊ: B��1539656562451����ͬ����
�߳�����Ϊ: B��1539656565452�뿪ͬ����
*/
