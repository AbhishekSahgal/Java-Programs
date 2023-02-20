// Factorial number program by for Loop
import java.util.Scanner;
public class Example_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact,i,n;
        System.out.print("Enter Your Number:- ");
        n = sc.nextInt();
        fact = 1;
        for(i=1;i<=n;i++){
            fact = fact*i; 
        }
        System.out.println("Factorial is:- "+fact);
    }
}
