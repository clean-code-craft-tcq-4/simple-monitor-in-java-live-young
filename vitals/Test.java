package vitals;

public class Test {
	void testConditions() {
		
		//test for success
		assert (Main.batteryIsOk(25, 70, 0.7f) == true);
		
		//negative test for temperature  
		assert (Main.batteryIsOk(50, 40, 0.4f) == false);
		
		//negative test for SOC
		assert (Main.batteryIsOk(40, 85, 0.0f) == false);
		
		//negative test for Charge Range 
		assert (Main.batteryIsOk(40, 40, 0.0f) == false);
		
		//negative test for temperature & Charge range 
		assert (Main.batteryIsOk(50, 40, 0.0f) == false);
		
		//negative test for checkIsOk temperature high
		assert (Main.checkIsOk(50,45 , 0, "Temperature") == false);
		
		//negative test for checkIsOk SOC high
		assert (Main.checkIsOk(85, 20, 80, "State of Charge") == false);
		
		//negative test for checkIsOk Charge Range high
		assert (Main.checkIsOk(0.9f, 0, 0.8, "Charge Rate") == false);		
			
		System.out.println("More tests Added");
	}
}
