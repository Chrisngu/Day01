package down2;

public class Thread4 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<20;i++) {
			try {
				Thread.currentThread().sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception 
			}
			System.out.println("d"+i);	
		}
	}
	
}
