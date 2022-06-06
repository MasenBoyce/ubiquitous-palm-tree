package Offset;



//Add Phidgets Library
import com.phidget22.*;

public class Offset {
  public static void main(String[] args) throws Exception{

      //Create
      VoltageRatioInput scale = new VoltageRatioInput();
      
      //Open
      scale.open(1000);
      
      //Use your Offset Value
      double offsetValue = 0;
      int counter = 0;
      double avgValue = 0;
      
      //Use your Phidgets
      
      for (int i = 0; i < 64; i++) 
      {
    	  System.out.println("Averaging Offset...");
    	  counter +=1;
    	  
    	  offsetValue += scale.getVoltageRatio();
    	  
    	  avgValue = offsetValue / counter;
      }
      
      
      while(true)
      {

          //Calculate Weight (kg)
          double weight = 24500 * (scale.getVoltageRatio() - avgValue);
          
          //Display Weight
          System.out.println(String.format("%.3f kg", weight));      
          
          Thread.sleep(250);
      }
  }    
}

