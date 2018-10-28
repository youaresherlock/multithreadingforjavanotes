package chapter04.section01.thread_4_1_2.project_1_ConditionTestMoreMethod;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		MyService service = new MyService();

		ThreadA a = new ThreadA(service);
		a.setName("A");
		a.start();
		ThreadAA aa = new ThreadAA(service);
		aa.setName("AA");
		aa.start();

		Thread.sleep(100);

		ThreadB b = new ThreadB(service);
		b.setName("B");
		b.start();
		
		ThreadBB bb = new ThreadBB(service);
		bb.setName("BB");
		bb.start();
	}
}
/*
result:
methodA begin ThreadName=A time=1540723593087
methodA  end ThreadName=A time=1540723598088
methodA begin ThreadName=AA time=1540723598088
methodA  end ThreadName=AA time=1540723603088
methodB begin ThreadName=B time=1540723603088
methodB  end ThreadName=B time=1540723608088
methodB begin ThreadName=BB time=1540723608088
methodB  end ThreadName=BB time=1540723613089
*/