package vitals;

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
		Test test = new Test();
		test.testConditions();
		System.out.println("All is well!");
	}
}
