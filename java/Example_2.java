// user Input and sum of two numbers 
import java.util.Scanner;
public class Example_2 {
    public static void main(String[] args){
    Scanner MyObj = new Scanner(System.in);
    System.out.println("Enter Your first Number:- ");
    int a = MyObj.nextInt(); 

    System.out.println("Enter Your Second Number:- ");
    int b = MyObj.nextInt();
    
    int c = a+b;
    System.out.println("Tatal is:- "+c);
    }
}
