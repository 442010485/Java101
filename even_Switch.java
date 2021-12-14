import java.util.Scanner;

public class even_Switch.java{
public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number 1");

        int moner1= scan.nextInt();
        switch (moner1){
        case 1:

        int n;
        System.out.print("Enter a Number");
        n = scan.nextInt();
        n %=2;
        if (n==0){
        System.out.print("even");
        }
        else {
        System.out.print("odd");
        }


        }}}
