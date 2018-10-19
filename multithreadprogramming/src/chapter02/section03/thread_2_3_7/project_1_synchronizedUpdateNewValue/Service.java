package chapter02.section03.thread_2_3_7.project_1_synchronizedUpdateNewValue;

public class Service {
	
	private boolean isContinueRun = true;
	
	public void runMethod() {
//		String anyString = new String();
		while(isContinueRun == true) {
//			synchronized(anyString) {
//				
//			}
		}
		System.out.println("Õ£œ¬¿¥¡À!");
	}
	
	public void stopMethod() {
		isContinueRun = false;
	}
}

















