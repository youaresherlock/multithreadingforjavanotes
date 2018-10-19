package chapter02.section02.thread_2_2_13.project_1_innerClass;

//import chapter02.section02.thread_2_2_13.project_1_innerClass.PublicClass.PrivateClass;

public class Run {
	public static void main(String[] args) {
		
		PublicClass publicClass = new PublicClass();
		publicClass.setUsername("usernameValue");
		publicClass.setPassword("passwordValue");
		
		System.out.println(publicClass.getUsername() + " " 
				+ publicClass.getPassword());
		
		/**
		 * 成员内部类是依赖外部类而存在的，即，如果要创建成员
		 * 内部类的对象，前提是必须存在一个外部类对象。
		 * 这里对成员内部类不做详细介绍
		 */
		PublicClass.PrivateClass privateClass = publicClass.new PrivateClass();
		privateClass.setAge("ageValue");
		privateClass.setAddress("addressValue");
		
		System.out.println(privateClass.getAge() + " " 
				+ privateClass.getAddress());
	}
}
/*
result:
usernameValue passwordValue
ageValue addressValue
*/





























