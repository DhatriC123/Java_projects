import java.util.Random;
import java.util.Scanner;

public class rockpaper {
public static void main(String[] args) {
   Random rand=new Random();
   int no = rand.nextInt(3);
   String comp;
   if(no==0) {
    comp="rock";

   }
   else if(no==1){
    comp="paper";
   }
   else{
    comp="scissors";
   }
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter rock or paper or scissors");
    String choice=scanner.nextLine();
    if(choice==comp){
        System.err.println("draw");
    }
    else if ((choice.equals("rock") && comp.equals("paper")) ||
    (choice.equals("paper") && comp.equals("scissors")) ||
    (choice.equals("scissors") && comp.equals("rock"))) {
    
    // Print the choice and comp
    System.out.println("u lose. u chose "+choice+"system chose "+comp);
}


    else{
        System.out.println("you win.u chose "+choice+" system chose "+comp);
    }





}
    
}
