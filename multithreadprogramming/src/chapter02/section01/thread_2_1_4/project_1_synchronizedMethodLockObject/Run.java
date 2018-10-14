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
��������synchronized�ؼ���result:
begin methodA threadName=B
begin methodA threadName=A
end
end
��synchronized�ؼ���result:
begin methodA threadName=A
end
begin methodA threadName=B
end
*/

























