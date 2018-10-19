package chapter02.section02.thread_2_2_16.project_2_setNewPropertiesLockOne;

public class Run {
	public static void main(String[] args) {

		try {
			MyService service = new MyService();
			Userinfo userinfo = new Userinfo();

			ThreadA a = new ThreadA(service, userinfo);
			a.setName("a");
			a.start();
			Thread.sleep(50);
			ThreadB b = new ThreadB(service, userinfo);
			b.setName("b");
			b.start();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
/*
可以看到对象不变，属性变化时同步效果
时间相差3000毫秒
result:
a
end! time=1539933771256
b
end! time=1539933774256
*/
