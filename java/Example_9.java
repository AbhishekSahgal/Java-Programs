// Calculater Program BY switch Statement
import java.util.Scanner;
public class Example_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 For Addition");
        System.out.println("Press 2 For Substraction");
        System.out.println("Press 3 For Multiplication");
        System.out.println("Press 4 For Division");

        System.out.print("Enter Your Choice:- ");
        int choice = sc.nextInt();

        double a,b,c;
        System.out.print("Enter Your first Number:- ");
        a = sc.nextDouble();

        System.out.print("Enter Your Second Number:- ");
        b = sc.nextDouble();

        switch(choice){
            case 1: c=a+b;
            System.out.print("Result is:- "+c);
            break;
            case 2: c=a-b;
            System.out.print("Result is:- "+c);
            break;  
            case 3: c=a*b;
            System.out.print("Result is:- "+c);
            break; 
            case 4: c=a/b;
            System.out.print("Result is:- "+c);
            break;
            default: System.out.print("Wrong Input");
        }
    }
}
