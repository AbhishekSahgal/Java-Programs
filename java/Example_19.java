import javax.swing.*;
public class Example_19 {
    public static void main(String[] args){
        int r = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of rows:- "));
        int c = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of column:- "));
        int a[][] = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter ur values:- "));
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(+a[i][j]);
            }
            System.out.print("\n");
        }
    }
    
}
