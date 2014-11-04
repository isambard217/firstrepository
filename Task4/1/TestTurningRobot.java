public class TestTurningRobot{

	public static void main(String[] args){
		//----- Test step 2 -----
		// declaration and creation of robot with default constructor
		TurningRobot johnny = new TurningRobot();
		
		//----- Test step 3 ----- 
		// testing get methods 
		// --> for testing take comment sign /* */ away from lines below
		/*System.out.println("name: "+johnny.getName());
		System.out.println("current speed: "+johnny.getCurrentSpeed());
		System.out.println("direction: "+johnny.getDirection());*/
		
		//----- Test step 4 ----- 
		// testing class method
		// --> for testing take comment sign // away from line below
		//System.out.println("maximum speed: "+TurningRobot.getMaximumSpeed());
		
		//----- Test step 5 ----- 
		// testing speed changing methods 
		// --> for testing take comment sign /* */ away from lines below
		/*System.out.println("speed up by 30");
		johnny.speedUp(30);
		System.out.println("current speed: "+johnny.getCurrentSpeed());
		System.out.println("slow down by 10");
		johnny.slowDown(10);
		System.out.println("current speed: "+johnny.getCurrentSpeed());*/
		// add more tests to verify that you can't exceed the maxmimum/minimum speed
		
		//----- Test step 6 ----- 
		// testing the emergency stop methods 
		// --> write your own test below
		
		//----- Test step 7 ----- 
		// testing the toString methods 
		// --> for testing take comment sign // away from line below
		//System.out.println(johnny);
		
		//----- Test step 8 ----- 
		// declaration and creation of robot with values for initialisation
		// --> for testing take comment sign /* */ away from lines below
		/*TurningRobot timmy =new TurningRobot("Timmy",180);
		System.out.println(timmy);*/
		// change the test above to check if direction is between 0 and 359 for any number
		
		//----- Test step 9 ----- 
		// testing change of direction
		// --> for testing take comment sign /* */ away from lines below
		/*johnny.turn(300);
		System.out.println(johnny.getName()+" is now travelling in direction "+johnny.getDirection());*/
		// add more tests to verify that the turn method works correctly
	}	
}

