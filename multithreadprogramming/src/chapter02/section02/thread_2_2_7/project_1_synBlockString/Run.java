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
result:
线程名称为: A在1539617319796进入同步块
线程名称为: B在1539617319797进入同步块
线程名称为: A在1539617322796离开同步快
线程名称为: B在1539617322797离开同步快
*/
