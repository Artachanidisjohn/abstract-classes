
public class Car extends Machine {

	@Override
	public void start() {
		System.out.println("car starting..");
		
	}

	@Override
	public void doStuff() {
		System.out.println("do stuff in car");
		
	}

	@Override
	public void shutdown() {
		System.out.println("shutdown car");
		
	}

}
