package chapter02.section02.thread_2_2_13.project_2_innerStaticClass;


public class Run {
	public static void main(String[] args) {
		
		PublicClass publicClass = new PublicClass();
		publicClass.setUsername("usernameValue");
		publicClass.setPassword("passwordValue");
		
		System.out.println(publicClass.getUsername() + " " 
				+ publicClass.getPassword());
		
		/**
		 * ��̬�ڲ��࣬���ǲ���Ҫ�������ⲿ��ģ�������
		 * ����ʹ���ⲿ��ķ�static��Ա�����򷽷�
		 */
		PublicClass.PrivateClass privateClass = new PublicClass.PrivateClass();
		privateClass.setAge("ageValue");
		privateClass.setAddress("addressValue");
		privateClass.setAddress("addressValue");
	}
}

/*
result:
usernameValue passwordValue
ageValue addressValue
*/






































