package chapter04.section01.thread_4_1_8.project_1_ConditionTestManyToMany;

import chapter02.section01.thread_2_1_8.project_1_synNotExtends.MyThreadA;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		MyService myService = new MyService();
		
		ThreadA[] threadA = new ThreadA[10];
		ThreadB[] threadB = new ThreadB[10];
		
		for(int i = 0; i < 10; i++) {
			threadA[i] = new ThreadA(myService);
			threadB[i] = new ThreadB(myService);
			threadA[i].start();
			threadB[i].start();
		}
	}
}
/*
�п��ܡ������
�п��ܡ������
�п��ܡ������
�п��ܡ������
��ӡ��
�п��ܡ�����
�п��ܡ�����
�п��ܡ�����
�п��ܡ�����
�п��ܡ�����
��ӡ��
�п��ܡ������
�п��ܡ������
�п��ܡ������
��ӡ��
�п��ܡ�����
�п��ܡ�����
*/
