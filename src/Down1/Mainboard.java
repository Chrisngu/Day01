package Down1;

public class Mainboard {
	private Cpu cpu;

	public Cpu getCpu() {
		return cpu;
	}

	public void setCpu(Cpu cpu) {
		this.cpu = cpu;
	}
	public void method() {
		cpu.method();
	}
}
