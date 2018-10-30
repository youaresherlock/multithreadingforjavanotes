package chapter04.section01.thread_4_1_5.project_1_MustUseMoreCondition_Error;

public class Run {

	public static void main(String[] args) throws InterruptedException {

		MyService service = new MyService();

		ThreadA a = new ThreadA(service);
		a.setName("A");
		a.start();

		ThreadB b = new ThreadB(service);
		b.setName("B");
		b.start();

		Thread.sleep(3000);

		service.signalAll();

	}
}
/*
result:
begin awaitAʱ��Ϊ1540885187756 ThreadName=A
begin awaitBʱ��Ϊ1540885187756 ThreadName=B
  signalAllʱ��Ϊ1540885190756 ThreadName=main
  end awaitAʱ��Ϊ1540885190756 ThreadName=A
  end awaitBʱ��Ϊ1540885190756 ThreadName=B
*/
