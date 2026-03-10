import java.util.Scanner;

/**
 * 
 *
 * @Ahmir Devezub
 * @2/25/26
 */
public class Tests
{
    // private fields
  private int numScores;
  private double average;
  
  //constructors
  public Tests(){
      numScores = 0;
      average = 0.0;
  }
  
  //acessors
  public int getNumScores(){
      return numScores;
  }
  
  public void getAverage(){
      
      Scanner scnr = new Scanner(System.in);
      
      double sum = 0.0;
      int localCount = 0;
      
      System.out.println("Enter test scores (press -1 to quit):");
      double score = scnr.nextDouble();
      
      while (score != -1){
          
          sum +=score;
          localCount++;
          
          System.out.println("Enter test scores (press -1 to quit:");
          score = scnr.nextDouble();
          
         
          
          
      }
       numScores = localCount;
          average = sum / localCount;
        }
        public String toString(){
              return "The average of the " + numScores +
              " scores entered is " + 
              String.format("%.2f", average) + ".";
      }
  }
