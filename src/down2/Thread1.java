package down2;

public class Thread1 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<20;i++) {
			try {
				sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception 
			}
			System.out.println("b"+i);	
		}
	}
}
