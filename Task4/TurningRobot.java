/*** Define the class TurningRobot in this file.
 * See the worksheet for the required methods.
 * Use TestTurningRobot.java to test your coding.
 */
 
 import java.util.*;

 
 public class TurningRobot{
	
	
	private int currentSpeed = 0;
	private static final int maximumSpeed = 100; // if the variable doesn't change put "final"
	private int direction= 0; 
	private String name;  // this means that when you create this object you set name once. THen you don't change it. 
	
	

public void setName (String name2) {

name = name2; 	

	
}

public String getName() {
	
	
 return name;
}

public int getCurrentSpeed() {
	return currentSpeed;
}

public int getDirection() {
	return direction;

}
	
public static int getMaximumSpeed() {
	return maximumSpeed;
}
	
public  void TurningRobot () {
	name = "none";
	currentSpeed = 0;
	direction=0;
	
	
}

public void speedUp(int increase){
	
	
	currentSpeed = Math.min ((currentSpeed + increase), maximumSpeed);
	
	
	
	
}

public void slowDown (int decrease){
	
	currentSpeed = Math.max ((currentSpeed- decrease),0);
	

	
}

public void emergencyStop() {
	
	currentSpeed = 0;
	
	

	
	
	}
	
public String toString() {
	
	return  name + " is currently travelling at speed " + currentSpeed + " in the direction" + direction + " from true north.";
	
	
	
	
	}

	
	 
 }

