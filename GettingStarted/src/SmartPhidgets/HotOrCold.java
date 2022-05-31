package SmartPhidgets;

//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file. 
import com.phidget22.*;

public class HotOrCold {
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
    redButton.open(1000);
    redLED.open(1000);
    greenButton.open(1000);
    greenLED.open(1000);
    

    //Create | Here you have created a TemperatureSensor object. TemperatureSensor is a class in your Phidgets library that gathers temperature data from your Phidget. 
    TemperatureSensor temperatureSensor = new TemperatureSensor();

    //Open | Open establishes a connection between your object and your physical Phidget. You provide a timeout value of 1000  to give the program 1000 milliseconds (1 second) to locate your Phidget. If your Phidget can't be found, an exception will be thrown.
    temperatureSensor.open(1000);

    //Use your Phidgets | This code will print the temperature every 150ms
    while (true) {
        
    	System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °c" );
    	
    	
    	if (temperatureSensor.getTemperature() > 20 && temperatureSensor.getTemperature() < 24) 
    	{
    		greenLED.setState(true);
    		redLED.setState(false);
    	}
    	
    	else
    	{
    		redLED.setState(true);
    		greenLED.setState(false);
    	}
        Thread.sleep(150);
    }
}
}