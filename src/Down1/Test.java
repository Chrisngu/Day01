package Down1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Cpu i3=new I3();
		Cpu i5=new I5();
		Cpu i7=new I7();
		Mainboard mainboard=new Mainboard();
		mainboard.setCpu(i7);
		mainboard.method();
		Scanner s=new Scanner(System.in);
		s.nextInt();
		System.out.println("12345");
	}
}
