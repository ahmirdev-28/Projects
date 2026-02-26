import java.util.Scanner;

/**
 * 
 *
 * @Ahmir Devezub
 * @2/25/26
 */
public class Tests
{
   private int count;
   private double average;
   
public Tests(){
    //private fields
    count = 0;
    average = 0.0;
}

public void getAverage(){
    Scanner scnr = new Scanner(System.in);
    
    double sum = 0.0;
    int localCount = 0;
    
    System.out.println("Enter test scores (press -1 to quit):");
    
    double score = scnr.nextDouble();
    
    while(score != -1) {
        sum += score;
        localCount++;
        
        System.out.println("Enter test scores (press -1 to quit):");
        score = scnr.nextDouble();
    }
    
    count = localCount;
    average = sum / localCount;
}

public String toString() {
    return "The average of the " + count +
    " scores entered is " + 
    String.format("%2.f", average) + ".";
}
}
