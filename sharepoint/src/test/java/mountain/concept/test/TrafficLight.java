package mountain.concept.test;

//enum Signal{GREEN, YELLOW, RED,}

public class TrafficLight {
	Signal color = Signal.RED;
	public void change() {
		switch (color) {
		case RED:
			color = Signal.GREEN;
			break;
		case GREEN:
			color = Signal.YELLOW;
			break;
		case YELLOW:
			color = Signal.RED;
			break;
		}
	}
	public String toString() {
		return "The traffic light is " + color;
	}
	public static void main(String[] args) {
		TrafficLight trafficLight = new TrafficLight();
		for (int i = 0; i < 10; i++) {
			System.out.println(trafficLight);
			trafficLight.change();
		}
//		printFoo();
		int j = 0;
		for (printFoo(); j < 10; j++) {
			System.out.println("333");
		}
	}
	
	public static void printFoo() {
		System.out.println("1111");
	}
}
