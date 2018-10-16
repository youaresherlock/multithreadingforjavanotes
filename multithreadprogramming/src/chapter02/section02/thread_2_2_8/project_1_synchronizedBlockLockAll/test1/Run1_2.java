package chapter02.section02.thread_2_2_8.project_1_synchronizedBlockLockAll.test1;

public class Run1_2 {
	public static void main(String[] args) {
		Service service = new Service();
		MyObject object1 = new MyObject();
		MyObject object2 = new MyObject();
		
		ThreadA a = new ThreadA(service, object1);
		a.setName("a");
		a.start();
		
		ThreadB b = new ThreadB(service, object2);
		b.setName("b");
		b.start();
	}
}
/*
使用不同的"对象监视器"的result:
testMethod1 ___getLock time=1539677091933 run ThreadName=a
testMethod1 ___getLock time=1539677091933 run ThreadName=b
testMethod1 releaseLock time=1539677093934 run ThreadName=a
testMethod1 releaseLock time=1539677093934 run ThreadName=b
*/
