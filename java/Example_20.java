import java.util.Scanner;
class AdmissionForm{
    String name;
    String fname;
    int age;
    Scanner myObj= new Scanner(System.in);

    public void FillTheForm(){
        System.out.print("Enter Your Name:- ");
        name = myObj.nextLine();
        
        System.out.print("Enter Your Father Name:- ");
        fname = myObj.nextLine();

        System.out.print("Enter Your age:- ");
        age = myObj.nextInt();
    }
    public void showinfo(){
        System.out.println("Your name is:- "+name);
        System.out.println("Your father name is:- "+fname);
        System.out.println("Your age is:- "+age);
    }
}
public class Example_20{
    public static void main(String[] args){
        AdmissionForm obj = new AdmissionForm();
        obj.FillTheForm();
        obj.showinfo();
        
    }
}
