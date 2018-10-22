package chapter03.section1.thread_3_1_1.project_1_TwoThreadTransData;

public class ThreadB extends Thread{

	private MyList list;
	
	public ThreadB(MyList list) {
		super();
		this.list = list;
	}
	
	@Override
	public void run() {
		try {
			while (true) {
				System.out.println(list.size());
				//疑问?为什么没有上面的语句就轮询检测不到list.size大小了
				if (list.size() == 5) {
					System.out.println("==5了，线程b要退出了！");
					throw new InterruptedException();
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}























