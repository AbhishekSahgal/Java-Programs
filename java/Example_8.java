// Customer care Program
import java.util.Scanner;
public class Example_8 {
    public static void main(String[] args) {
        System.out.println("Press 1 for Hindi");
        System.out.println("Press 2 for English");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Choice:- ");
        int choice = sc.nextInt();

        switch(choice){
            case 1: System.out.println("You are selected Hindi language");
            break;
            case 2: System.out.println("You are selected English Language");
            break;
            default: System.out.println("you are selected a wrong Input plz Select a valid input");
        } 
    }
}
