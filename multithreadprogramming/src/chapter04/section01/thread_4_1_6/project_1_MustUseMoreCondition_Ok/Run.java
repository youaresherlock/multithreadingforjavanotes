package chapter04.section01.thread_4_1_6.project_1_MustUseMoreCondition_Ok;

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

		service.signalAll_A();
	}
}
/*
result:
begin awaitAʱ��Ϊ1540885681597 ThreadName=A
begin awaitBʱ��Ϊ1540885681598 ThreadName=B
  signalAll_Aʱ��Ϊ1540885684599 ThreadName=main
  end awaitAʱ��Ϊ1540885684600 ThreadName=A
*/
