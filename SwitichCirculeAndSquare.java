import java.util.Scanner;

public class SwitichCirculeAndSquare.java
{
	public static void main(String[] args) {
	    	Scanner scan = new Scanner(System.in);
		System.out.println("Enter number 1 or 2");
	
	   	int var= scan.nextInt();
	    switch (var){
		case 1:
		    

		System.out.println("Enter semicircle");
	
		int var2= scan.nextInt();
		System.out.println(3.14*var2*var2);
		break;
		
	     case 2:
		System.out.println("Enter  height");
	
		int var3 = scan.nextInt();
		System.out.println("Enter number offer");
	
		int var4 = scan.nextInt();
		System.out.println(var3 * var4);
	     break;
	
		    default:
		System.out.println("Error, enter either 1 or 2");
		}}}
	
