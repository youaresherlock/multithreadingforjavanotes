package chapter01.section07.thread_1_7_2.project_1_t12;

public class Run1 {

	public static void main(String[] args) {
		Thread.currentThread().interrupt();
		System.out.println("�Ƿ�ֹͣ1? =" + Thread.interrupted());
		System.out.println("�Ƿ�ֹͣ2? =" + Thread.interrupted());
	}
}

/**
result:
�Ƿ�ֹͣ1? =true
�Ƿ�ֹͣ2? =false
 */