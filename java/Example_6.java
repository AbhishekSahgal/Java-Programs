// even and odd number program
import java.util.Scanner;
public class Example_6 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("enter your Number:- ");
        int a = obj.nextInt();

        if(a%2==0){
        System.out.println("The number is even");
        }
        else{
        System.out.println("The Number is odd");
        }
    }
}
