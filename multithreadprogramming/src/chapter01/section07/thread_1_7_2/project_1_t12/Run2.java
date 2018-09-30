package chapter01.section07.thread_1_7_2.project_1_t12;

public class Run2 {

	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			thread.interrupt();
			Thread.sleep(1000);
			System.out.println("ÊÇ·ñÍ£Ö¹1? =" + thread.isInterrupted());
			System.out.println("ÊÇ·ñÍ£Ö¹2? =" + thread.isInterrupted());
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("main catch");
			e.printStackTrace();
		}
	}
}

/*
 MyThread.javaÖĞ¼ÓÈë×¢ÊÍÄÚÈİÖ®ºó
...
i=9995
ÊÇ·ñÍ£Ö¹? =9994 true
i=9996
ÊÇ·ñÍ£Ö¹? =9995 true
i=9997
ÊÇ·ñÍ£Ö¹? =9996 true
i=9998
ÊÇ·ñÍ£Ö¹? =9997 true
i=9999
ÊÇ·ñÍ£Ö¹? =9998 true
i=10000
ÊÇ·ñÍ£Ö¹? =9999 true
ÊÇ·ñÍ£Ö¹1? =false
ÊÇ·ñÍ£Ö¹2? =false
*/

