package chapter01.section07.thread_1_7_8.project_1_use_ReturnInterrupt;

public class Run {
	public static void main(String[] args) {
		try {
			MyThread t = new MyThread();
			t.start();
			Thread.sleep(2000);
			t.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

/*
result:
...................
timer=1538321310471
timer=1538321310471
timer=1538321310471
timer=1538321310471
timer=1538321310471
Õ£÷π¡À!
 */