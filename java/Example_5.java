import java.util.Scanner;
public class Example_5 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter your age:- ");
        int a = obj.nextInt();

        if(a>=18)
        System.out.println("You are a valid voter");
        else 
        System.out.println("You are not a valid voter");
    }
}
