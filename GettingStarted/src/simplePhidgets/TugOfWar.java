package simplePhidgets;

import com.phidget22.DigitalInput;
import com.phidget22.DigitalOutput;

public class TugOfWar 
{
	public static void main(String[] args) throws Exception 
	{
		//Create | Create objects for your buttons and LEDs.
	      DigitalInput redButton = new DigitalInput();
	      DigitalOutput redLED = new DigitalOutput();
	      DigitalInput greenButton = new DigitalInput();
	      DigitalOutput greenLED = new DigitalOutput();

	      //Address | Address your four objects which lets your program know where to find them.
	      redButton.setHubPort(0);
	      redButton.setIsHubPortDevice(true);
	      redLED.setHubPort(1);
	      redLED.setIsHubPortDevice(true);
	      greenButton.setHubPort(5);
	      greenButton.setIsHubPortDevice(true);
	      greenLED.setHubPort(4);
	      greenLED.setIsHubPortDevice(true);

	      //Open | Connect your program to your physical devices.
	      redButton.open(5000);
	      redLED.open(1000);
	      greenButton.open(5000);
	      greenLED.open(1000);

	      
	      int redScore = 0;
	      int greenScore = 0;
	      
	      
	      while (redScore < 10 && greenScore < 10) 
	      {
	    	  if (redButton.getState() == true)
	          {
	             redScore += 1;
	          }
	    	  
	    	  
	    	  if (greenButton.getState() == true)
	          {
	               greenScore += 1;
	          }
	    	  
	    	  
	    	  Thread.sleep(100);
	      }
	      
	      
	      if (redScore == 10 && redScore > greenScore) 
	      {
	    	  System.out.println("Red wins!");
	    	  redLED.setState(true);
	      }
	      
	      if (greenScore == 10 && greenScore > redScore) 
	      {
	    	  System.out.println("Green wins!");
	    	  greenLED.setState(true);
	      }
	}
}
