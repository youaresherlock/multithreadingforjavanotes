package chapter02.section02.thread_2_2_7.project_1_synBlockString;

public class Service {
	
	private String usernameParam;
	private String passwordParam;
	
	public void setUsernamePassword(String username,
			String password) {
		try {
			String anyString = new String();
			synchronized(anyString) {
				System.out.println("�߳�����Ϊ: " + Thread.currentThread().getName()
						+ "��" + System.currentTimeMillis() + "����ͬ����");
				usernameParam = username;
				Thread.sleep(3000);
				passwordParam = password;
				System.out.println("�߳�����Ϊ: " + Thread.currentThread().getName()
						+ "��" + System.currentTimeMillis() + "�뿪ͬ����");
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
