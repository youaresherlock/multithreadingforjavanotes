package chapter02.section02.thread_2_2_7.project_4_t9;

public class MyService {
	
	public MyOneList addServiceMethod(MyOneList list, String data) {
		try {
//			synchronized (list) {
//				if(list.getSize() < 1) {
//					Thread.sleep(2000);  //模拟从远程花费2秒取回数据
//					list.add(data);
//				}
//			}
			if(list.getSize() < 1) {
				Thread.sleep(2000);
				list.add(data);
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}
}
