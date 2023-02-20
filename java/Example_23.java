import java.util.Scanner;
public class Example_23 {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        try{int a,b,c;
        System.out.print("Enter Your first number:- ");
        a = myobj.nextInt();

        
        System.out.print("Enter Your Second number:- ");
        b = myobj.nextInt();

        c = a/b;
        System.out.print(c);
        }catch(ArithmeticException e){
            System.out.println("Please put positive number");
        }
    }
}
