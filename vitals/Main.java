public class Main {
	static boolean batteryIsOk(float temperature, float soc, float chargeRate) {
		return (checkIsOk(temperature, 0, 45, "Temperature")
				&& checkIsOk(soc, 20, 80, "State of Charge") 
				&& checkIsOk(chargeRate, 0, 0.8, "Charge Rate"));
	}
	
	static boolean checkIsOk(float parameter, float lowerLimit , double upperLimit, String checkName) {
		if (parameter > upperLimit || parameter < lowerLimit ) {
			System.out.println(checkName +" is out of range!");
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {

		assert (batteryIsOk(25, 70, 0.7f) == true);
		assert (batteryIsOk(50, 85, 0.0f) == false);
		System.out.println("Some more tests needed");
	}
}
