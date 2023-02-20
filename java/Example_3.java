// Graphical Method To user input , The sum of two Numbers
import javax.swing.JOptionPane;
public class Example_3 {
    public static void main(String[] args){
        int a = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Your First Number:- "));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Your Second Number:- "));
                // typecasting         (class.method)            (contain two arguments 1- null, 2- Show Massage)
        int c = a+b;
        JOptionPane.showMessageDialog(null,"The Total sum is:- "+c);  // show massage in GUI form
    }
}
