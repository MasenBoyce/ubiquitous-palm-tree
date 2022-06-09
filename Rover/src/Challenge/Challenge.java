package Challenge;


import com.phidget22.*;

public class Challenge {
	
  public static void main(String[] args) throws Exception {

      //Connect to wireless rover
      Net.addServer("", "192.168.100.1", 5661, "", 0);

      //Create
      DCMotor leftMotors = new DCMotor();
      DCMotor rightMotors = new DCMotor();

      //Address
      leftMotors.setChannel(0);
      rightMotors.setChannel(1);

      //Open
      leftMotors.open(5000);
      rightMotors.open(5000);

      //Move forward
      leftMotors.setTargetVelocity(-1);
      rightMotors.setTargetVelocity(-1);

      //Wait for 1 second
      Thread.sleep(1575);
      
      //Stop motors
      leftMotors.setTargetVelocity(0);
      rightMotors.setTargetVelocity(0);
      
      //Wait for 2 second
      Thread.sleep(2000);
      
      //Turn 
      leftMotors.setTargetVelocity(-1);
      rightMotors.setTargetVelocity(1);

      
      Thread.sleep(585);
      
      //Stop motors
      leftMotors.setTargetVelocity(0);
      rightMotors.setTargetVelocity(0);
      
      //Wait for 2 second
      Thread.sleep(2000);
      
      
      //Move forward
      leftMotors.setTargetVelocity(-1);
      rightMotors.setTargetVelocity(-1);

      //Wait for 1.8 second
      Thread.sleep(1560);
      
      //Stop motors
      leftMotors.setTargetVelocity(0);
      rightMotors.setTargetVelocity(0);
      
      //Wait for 2 second
      Thread.sleep(2000);
      
      //Turn
      leftMotors.setTargetVelocity(-1);
      rightMotors.setTargetVelocity(1);

      //Wait for 2 second
      Thread.sleep(585);
      
      //Stop motors
      leftMotors.setTargetVelocity(0);
      rightMotors.setTargetVelocity(0);
      
      //Wait for 2 second
      Thread.sleep(2000);
      
      
      //Move forward
      leftMotors.setTargetVelocity(-1);
      rightMotors.setTargetVelocity(-1);

      //Wait for 1.7 second
      Thread.sleep(1800);
      
      //Stop motors
      leftMotors.setTargetVelocity(0);
      rightMotors.setTargetVelocity(0);
      
      //Wait for 2 second
      Thread.sleep(2000);
      
      //Turn
      leftMotors.setTargetVelocity(-1);
      rightMotors.setTargetVelocity(1);


      Thread.sleep(585);
      
      //Stop motors
      leftMotors.setTargetVelocity(0);
      rightMotors.setTargetVelocity(0); 
      
      
      //Wait for 2 second
      Thread.sleep(2250);
      
      
      //Move forward
      leftMotors.setTargetVelocity(-1);
      rightMotors.setTargetVelocity(-1);

      //Wait for 2 second
      Thread.sleep(1575);
      
      //Stop motors
      leftMotors.setTargetVelocity(0);
      rightMotors.setTargetVelocity(0);
      
  }

}
