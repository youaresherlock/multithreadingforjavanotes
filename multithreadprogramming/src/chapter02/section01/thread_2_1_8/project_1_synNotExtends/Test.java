package chapter02.section01.thread_2_1_8.project_1_synNotExtends;

public class Test {
	public static void main(String[] args) {
		Sub subRef = new Sub();
		
		MyThreadA a = new MyThreadA(subRef);
		a.setName("A");
		a.start();
		
		MyThreadA b = new MyThreadA(subRef);
		b.setName("B");
		b.start();
	}
}
/*
Sub������д�̳и����serviceMethod()������synchronized�ؼ���
result:
int sub ��һ�� sleep begin threadName=A time=1539603860854
int sub ��һ�� sleep   end threadName=A time=1539603865855
int main ��һ�� sleep begin threadName=A time=1539603865855
int main ��һ�� sleep end threadName=A time=1539603870855
int sub ��һ�� sleep begin threadName=B time=1539603870855
int sub ��һ�� sleep   end threadName=B time=1539603875856
int main ��һ�� sleep begin threadName=B time=1539603875856
int main ��һ�� sleep end threadName=B time=1539603880856
Sub������д�̳и����serviceMethod()��������synchronized�ؼ���
result:
int sub ��һ�� sleep begin threadName=A time=1539604138579
int sub ��һ�� sleep begin threadName=B time=1539604138579
int sub ��һ�� sleep   end threadName=B time=1539604143580
int sub ��һ�� sleep   end threadName=A time=1539604143580
int main ��һ�� sleep begin threadName=B time=1539604143580
int main ��һ�� sleep end threadName=B time=1539604148581
int main ��һ�� sleep begin threadName=A time=1539604148581
int main ��һ�� sleep end threadName=A time=1539604153581
 */