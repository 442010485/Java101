import java.util.Scanner;
public class Q1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int Num1 = scan.nextInt();
        Num1 = Num1 %2;
        
        if (Num1 == 0){
        System.out.println("even");           
        }
        else{
            System.out.println("Odd");
        }}}

