// ATM loggic Program
import java.util.Scanner;
public class example_7 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter your Amount:- ");
        int a = obj.nextInt();

        if(a>=500){
            if(a<=20000){
                System.out.println("Withdrawal Successfull.");
            }
            else{
                System.out.println("You cross your daily limit to withdraw try again after sometime.");
            }
        }
        else{
            System.out.println("Withdrawal amount Should be greater than 500 !");
        }
    }
}
