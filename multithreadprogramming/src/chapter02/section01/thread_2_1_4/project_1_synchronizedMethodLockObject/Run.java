package chapter02.section01.thread_2_1_4.project_1_synchronizedMethodLockObject;

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
方法不加synchronized关键字result:
begin methodA threadName=B
begin methodA threadName=A
end
end
加synchronized关键字result:
begin methodA threadName=A
end
begin methodA threadName=B
end
*/

























