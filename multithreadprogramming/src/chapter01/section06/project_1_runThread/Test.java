package chapter01.section06.project_1_runThread;

public class Test {
	public static void main(String[] args) {
		Thread runThread = Thread.currentThread();
		System.out.println(runThread.getName() + " " + runThread.getId());
	}
}

/*
result:
main 1
*/








