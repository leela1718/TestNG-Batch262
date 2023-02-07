package runner;
import classes.Shippment;
public class TestShipmentDemo {
	public static void main(String[] args) {
		Shippment ship = new Shippment(); // Object Creation
		System.out.println(ship.originLoc); // Accessing Property
		System.out.println(ship.destLoc );
		int shWeight = ship.getShipmentWeight(); // Accessing Method
		System.out.println(shWeight);
		
		String pcName = Shippment.getPackageName();
		System.out.println(pcName);
	}
}
