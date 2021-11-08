import java.util.Random;
import java.util.Scanner;

public class RockPaperSe{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String computerPlays = "rps";
        Random rnd = new Random();
        do{
            System.out.println("If you want to play enter:\n(r or R) for rock,\n(p or P) for paper,\n(s or S) for scissors\nor Enter any key to exit");
           
              String xyz = scan.nextLine(); 
               xyz = (xyz.toLowerCase());
               char moner = xyz.charAt(0);
            if (moner!= 's'&& moner!='r'&& moner!='p' ){
                break;
            }
            
             char computerChoice = computerPlays.charAt(rnd.nextInt(computerPlays.length()));
            
             if (moner == computerChoice){
                 System.out.println("is tie: user choice:   " +moner+"   computerChoice:   "+computerChoice);
             }

            else if((moner=='s'&& computerChoice=='p')||(moner=='p'&&computerChoice=='r')||(moner=='r'&&computerChoice=='s')){
                System.out.println("user wins: computerChoice:   "  +computerChoice+"   xyz choice:   "+xyz);
            }
            
            else{
                System.out.println("computer wins computerChoice:   "+computerChoice+"   xyz choice:   "+moner);
            }
            
            System.out.println("\n\n");
        }while(true);
    }
}
