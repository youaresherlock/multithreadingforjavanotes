package chapter02.section02.thread_2_2_8.project_1_synchronizedBlockLockAll.test1;

public class Run1_1 {
	public static void main(String[] args) {
		Service service = new Service();
		MyObject object = new MyObject();
		
		ThreadA a = new ThreadA(service, object);
		a.setName("a");
		a.start();
		
		ThreadB b = new ThreadB(service, object);
		b.setName("b");
		b.start();
	}
}
/*
result:
testMethod1 ___getLock time=1539676986180 run ThreadName=a
testMethod1 releaseLock time=1539676988180 run ThreadName=a
testMethod1 ___getLock time=1539676988180 run ThreadName=b
testMethod1 releaseLock time=1539676990180 run ThreadName=b
同步的原因是使用了同一个"对象监视器".
*/






























