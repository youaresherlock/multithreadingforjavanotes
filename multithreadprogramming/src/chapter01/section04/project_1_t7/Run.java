package chapter01.section04.project_1_t7;

public class Run {
	public static void main(String[] args) throws InterruptedException {
		MyThread mythread = new MyThread();
		System.out.println("begin ==" + mythread.isAlive());
		mythread.start();
//		Thread.sleep(1000);
		System.out.println("end ==" + mythread.isAlive());
	}
}


/*
begin ==false
end ==true ���ֵ�ǲ�ȷ���ģ���Ϊmythread�̻߳�û��ִ�����������true
run=true

����Thread.sleep(1000);֮����
begin ==false
run=true
end ==false ������Ϊfalse,��Ϊmythread�����Ѿ���1s֮��ִ�����
*/