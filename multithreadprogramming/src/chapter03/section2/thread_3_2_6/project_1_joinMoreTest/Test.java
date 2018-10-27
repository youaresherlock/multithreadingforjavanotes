package chapter03.section2.thread_3_2_6.project_1_joinMoreTest;

public class Test {
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			System.out.println(ThreadId.get());
		}
	}
}
