
import java.util.Scanner; 
public class age {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String myname = scan.nextLine();
        
   
    int age= scan.nextInt();
    age = 2021 - age;
    
    
    if (age>=40)
    System.out.println();
    
    else if  (age>=30 && age<=39 )
    System.out.println(myname+age);
    
    else;
    System.out.println(myname+age);
  }}
