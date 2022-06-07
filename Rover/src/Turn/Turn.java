package Turn;


//Add Phidgets Library
import com.phidget22.*;

public class Turn {
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

      //Turn in one direction
      leftMotors.setTargetVelocity(-1);
      rightMotors.setTargetVelocity(-1);

      //Wait for 1 second
      Thread.sleep(1000);

      //Stop motors
      leftMotors.setTargetVelocity(0);
      rightMotors.setTargetVelocity(0);
      
      Thread.sleep(1000);
      
      
      leftMotors.setTargetVelocity(1);
      rightMotors.setTargetVelocity(-1);
      
      Thread.sleep(835);
      
      
      leftMotors.setTargetVelocity(0);
      rightMotors.setTargetVelocity(0);
      
      Thread.sleep(1000);
      
      
      leftMotors.setTargetVelocity(-1);
      rightMotors.setTargetVelocity(-1);
      
      Thread.sleep(1000);
      
  }
}

