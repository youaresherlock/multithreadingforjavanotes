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
当anyString是setUsernamePassword中的局部变量的时候
异步执行
result:
线程名称为: A在1539617319796进入同步块
线程名称为: B在1539617319797进入同步块
线程名称为: A在1539617322796离开同步快
线程名称为: B在1539617322797离开同步快

当anyString是Service类中的实例变量的时候
同步执行
result:
线程名称为: A在1539656559451进入同步块
线程名称为: A在1539656562451离开同步快
线程名称为: B在1539656562451进入同步块
线程名称为: B在1539656565452离开同步快
*/
