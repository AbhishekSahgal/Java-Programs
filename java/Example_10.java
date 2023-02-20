//  print Fabnoci Series program
import java.util.Scanner;
public class Example_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Term:- ");
        int num = sc.nextInt();
        
        int a=0;
        int b=1;
        int c;
        int i=3;
        if(num==1){
            System.out.println(a);
        }

        if(num>=2){
            System.out.println(a);
            System.out.println(b);
        }

        while(i<=num){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
            i++;
        }
    }
}
