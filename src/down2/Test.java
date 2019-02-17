package down2;

public class Test {
	public static void main(String[] args) {
		Thread t1=new Thread1();
		Thread t2=new Thread2();
	
		Runnable r1=new Thread3();
		Thread t3=new Thread(r1);
		Runnable r2=new Thread4();
		Thread t4=new Thread(r2);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
