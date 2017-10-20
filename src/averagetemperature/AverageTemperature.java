package averagetemperature;
 import java.util.Scanner;
  public class AverageTemperature{
      
    public static void AverageTemp(){
     
     Scanner input = new Scanner(System.in);
     
    double[] temp = new double[7];
    int higher, day = 0, sum = 0;
    double average;
    
      for(int i = 0; i < 7; ++i){
          System.out.print("Enter the "+(i+1)+"º temperature: ");
          temp[i] = input.nextDouble();
          sum += temp[i]; 
    }
           average = sum/7;
    
      for(int i = 0; i < 7; ++i){
       if(temp[i] > average){
          day = day + 1;
     }
    }
      System.out.println(day+" days had a higher than average temperature "+average);
   }
      
    public static void main(String[] args){
        
        System.out.println("Average Temperature program"
                           +"\n");
     
                AverageTemp();
    }     
   } 
      
      
      
      
      
      
      
      
      
      
      
      
      
      
  