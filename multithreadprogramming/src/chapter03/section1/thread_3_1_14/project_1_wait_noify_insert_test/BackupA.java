package chapter03.section1.thread_3_1_14.project_1_wait_noify_insert_test;

public class BackupA extends Thread{
	private DBTools dbtools;
	
	public BackupA(DBTools dbtools) {
		super();
		this.dbtools = dbtools;
	}
	
	@Override
	public void run() {
		dbtools.backupA();
	}
}
