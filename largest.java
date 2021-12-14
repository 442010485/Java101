import java.util.Scanner;
public class largest.java {
public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float m1;
        float h1;
        float r1;
        System.out.println("Enter Number1");
        m1 = scan.nextFloat();
        System.out.println("Enter Number2");
        h1 = scan.nextInt();
        System.out.println("Enter Number3");
        r1 = scan.nextFloat();

        if(m1>h1 && m1>r1 ){
        System.out.println("The largest score is" + m1);
        }
        else if(h1>m1 && h1>r1 ){
        System.out.println("The largest score is  " + h1);
        }
        else if(r1>m1 && r1>h1 ){
        System.out.println("The largest score is"+r1);
        }
        
        }
        }
