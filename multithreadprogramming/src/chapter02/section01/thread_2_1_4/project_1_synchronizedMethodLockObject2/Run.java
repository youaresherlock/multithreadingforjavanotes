package chapter02.section01.thread_2_1_4.project_1_synchronizedMethodLockObject2;

public class Run {
	
	public static void main(String[] args) {
		MyObject object = new MyObject();
		ThreadA a = new ThreadA(object);
		a.setName("A");
		ThreadB b = new ThreadB(object);
		b.setName("B");
		
		a.start();
		b.start();
	}
}

/*
methodB方法不加synchronized关键字result:
begin methodA threadName=A
begin methodB threadName=B begin time=1539504218450
end
end
methodB方法加synchronized关键字result:
begin methodA threadName=A
end
begin methodB threadName=B begin time=1539504295420
end
*/

























