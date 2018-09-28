package chapter01.section03.project_2_currentThreadExt;

public class Run {
	public static void main(String[] args) {
		CountOperate c = new CountOperate();
		Thread t1 = new Thread(c);
//		t1.setName("A");
		System.out.println(c.getName() + t1.getName());
		t1.start();
	}
}

/*
result:
CountOperate--begin
Thread.currentThread().getName()=main
this.getName()=Thread-0
CountOperate---end
run---begin
Thread.currentThread().getName()=A
this.getName()=Thread-0
run--end
*/