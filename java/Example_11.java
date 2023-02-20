// Square any number by Do while loop
import java.util.Scanner;
public class Example_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        do{
            System.out.print("Ennter Your Number:- ");
            i = sc.nextInt();
            int b = i*i;
            System.out.println(b); 
        }while(i!=0);
    }
}
