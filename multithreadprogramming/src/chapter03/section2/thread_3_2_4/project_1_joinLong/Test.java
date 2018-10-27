package chapter03.section2.thread_3_2_4.project_1_joinLong;

public class Test extends Thread{
	
	public static void main(String[] args) {
		try {
			MyThread threadTest = new MyThread();
			threadTest.start();
			
			threadTest.join(2000); //Ö»µÈ´ý2Ãë
//			Thread.sleep(2000);
			
			System.out.println("  end Timer=" + System.currentTimeMillis());
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
/*
result:
begin Timer=1540606857302
  end Timer=1540606859304
*/





























