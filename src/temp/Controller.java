package temp;

public class Controller {

	/* Variables */
	public static int temp = 0;

	public final static int MIN = 50;
	public final static int MAX = 100;
	
	public static boolean setTemp(int temp) {
		if (temp > MAX) {
            return false;
		} else if (temp < MIN) {
            return false;
		}
		System.out.println("Setting temperature to: " + temp);
	    return true;
	}
	
	/* Methods */
}
