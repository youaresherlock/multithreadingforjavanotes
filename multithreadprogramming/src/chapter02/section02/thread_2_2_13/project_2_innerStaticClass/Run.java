package chapter02.section02.thread_2_2_13.project_2_innerStaticClass;


public class Run {
	public static void main(String[] args) {
		
		PublicClass publicClass = new PublicClass();
		publicClass.setUsername("usernameValue");
		publicClass.setPassword("passwordValue");
		
		System.out.println(publicClass.getUsername() + " " 
				+ publicClass.getPassword());
		
		/**
		 * 静态内部类，它是不需要依赖于外部类的，并且它
		 * 不能使用外部类的非static成员变量或方法
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






































