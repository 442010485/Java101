import java.util.Scanner;
public class IfcirculeAndavaSquare{
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter num 1 or 2");
     int var = scan.nextInt();
     if(var ==1){
     System.out.println("Radivs");
     float r = scan.nextFloat();
     System.out.println(r*r*3.14);
     }else if (var ==2){
     System.out.println("h");
     float h = scan.nextFloat();
     System.out.println("w");
     float w = scan.nextFloat();
     System.out.println(h*w);
     }else
     System.out.println("error");
    }}
