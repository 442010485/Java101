import java.util.Scanner;
public class PositiveAndNegative.java {
    public static void main(String[] args) {
        Scanner sacn = new Scanner(System.in);
        float n1;
        System.out.println("Enter the number");
        n1 = sacn.nextFloat();
        if(n1 < 0) {
            System.out.println("the number negative");
        }
        else {
            System.out.println("the number postive");
        }
    }
}
