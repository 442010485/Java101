import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
     
     
     System.out.println("Number1");
     float Number1= scan.nextFloat();
     
     
     if (Number1>0)
     System.out.println(Number1 - 1);
       
       else if (Number1<0)
      System.out.println(Number1 + 1);
      
      else 
      System.out.println(Number1);
      
    }}
