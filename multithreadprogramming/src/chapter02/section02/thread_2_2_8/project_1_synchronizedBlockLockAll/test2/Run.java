package chapter02.section02.thread_2_2_8.project_1_synchronizedBlockLockAll.test2;

public class Run {
	public static void main(String[] args) throws InterruptedException {
		Service service = new Service();
		MyObject object = new MyObject();
		
		ThreadA a = new ThreadA(service, object);
		a.setName("a");
		a.start();
		
		Thread.sleep(100);
		
		ThreadB b = new ThreadB(object);
		b.setName("b");
		b.start();	
	}
}
/*
��ȥ��ע��result:
testMethod1 ___getLock time=1539679985913 run ThreadName=a
testMethod1 releaseLock time=1539679990916 run ThreadName=a
speedPrintString __getLock time=1539679990916 run ThreadName=b
----------------------
speedPrintString releaseLock time=1539679990916 run ThreadName=b
ȥ��ע�ͣ��ĳ�synchronized(this)�������Կ��������ͬ��Ч��
result:
testMethod1 ___getLock time=1539683725343 run ThreadName=a
testMethod1 releaseLock time=1539683730343 run ThreadName=a
speedPrintString __getLock time=1539683730343 run ThreadName=b
----------------------
speedPrintString releaseLock time=1539683730344 run ThreadName=b
*/



























