package chapter03.section1.thread_3_1_14.project_1_wait_noify_insert_test;

public class Run {

	public static void main(String[] args) {
		DBTools dbtools = new DBTools();
		for(int i = 0; i < 20; i++) {
			BackupB output = new BackupB(dbtools);
			output.start();
			BackupA input = new BackupA(dbtools);
			input.start();
		}
	}
}
/*
result:
@@@@
@@@@
@@@@
@@@@
@@@@
****
****
****
****
****
@@@@
@@@@
@@@@
@@@@
@@@@
½»ÌæÔËÐÐ
*/