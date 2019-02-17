package down;

public class Test {
	public static void main(String[] args) {
		Mainboard mainboard=new Mainboard();
		I3 i3=new I3();
		mainboard.setI3(i3);
		mainboard.method();
	}
}
