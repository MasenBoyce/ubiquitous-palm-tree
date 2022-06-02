package SmartPhidgets;

import com.phidget22.DigitalInput;
import com.phidget22.DigitalOutput;
import com.phidget22.TemperatureSensor;

public class Thermometer 
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
		redButton.open(10000);
		redLED.open(10000);
		greenButton.open(10000);
		greenLED.open(10000);
		
		//Create | Here you have created a TemperatureSensor object. TemperatureSensor is a class in your Phidgets library that gathers temperature data from your Phidget. 
	    TemperatureSensor temperatureSensor = new TemperatureSensor();

	    //Open | Open establishes a connection between your object and your physical Phidget. You provide a timeout value of 1000  to give the program 1000 milliseconds (1 second) to locate your Phidget. If your Phidget can't be found, an exception will be thrown.
	    temperatureSensor.open(10000);
		
		double temp = 21;
		boolean buttonState = false;
		
		
		while (true) 
		{
			if (greenButton.getState() && !buttonState) 
			{
				temp += 1;
			}
			
			if (redButton.getState() && !buttonState) 
			{
				temp -= 1;
			}
			
			
			Thread.sleep(500);
			
			
			if (((temperatureSensor.getTemperature() - temp) <= 2) && ((temp - temperatureSensor.getTemperature()) <= 2)){
                greenLED.setState(true);
                redLED.setState(false);
                
            }
			
            else 
            {
                redLED.setState(true);
                greenLED.setState(false);
            }
            
            System.out.println("Temperature: " + temperatureSensor.getTemperature() + "°C" + "\n Your set temperature is: "+ temp + "°C");
            Thread.sleep(10000);
		}
	}
}
