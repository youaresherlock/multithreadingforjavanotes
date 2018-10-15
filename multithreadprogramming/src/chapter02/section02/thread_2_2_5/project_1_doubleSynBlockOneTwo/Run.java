package chapter02.section02.thread_2_2_5.project_1_doubleSynBlockOneTwo;

public class Run {

	public static void main(String[] args) {
		ObjectService service = new ObjectService();

		ThreadA a = new ThreadA(service);
		a.setName("a");
		a.start();

		ThreadB b = new ThreadB(service);
		b.setName("b");
		b.start();
	}

}
/*
result:
A begin time=1539609986341
A end    end=1539609988343
A begin time=1539609988343
A end    end=1539609990343
*/
