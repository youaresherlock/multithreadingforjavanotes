package chapter01.section07.thread_1_7_2.project_1_t12;

public class Run1 {

	public static void main(String[] args) {
		Thread.currentThread().interrupt();
		System.out.println("ÊÇ·ñÍ£Ö¹1? =" + Thread.interrupted());
		System.out.println("ÊÇ·ñÍ£Ö¹2? =" + Thread.interrupted());
	}
}

/**
result:
ÊÇ·ñÍ£Ö¹1? =true
ÊÇ·ñÍ£Ö¹2? =false
 */