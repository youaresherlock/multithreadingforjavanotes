package chapter02.section03.thread_2_3_2.project_1_t10;

public class Run {
	public static void main(String[] args) {
		PrintString printStringService = new PrintString();
		new Thread(printStringService).start();
		
		System.out.println("��Ҫֹͣ��! stopThread="
				+ Thread.currentThread().getName());
		printStringService.setContinuePrint(false);
		}
}
/*
result:
��Ҫֹͣ��! stopThread=main
run printStringMethod threadName=Thread-0
*/


















