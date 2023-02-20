import javax.swing.*;
public class Example_18 {
    public static void main(String[] args){
        int sum = 0;
        int arrayBlocks;
        arrayBlocks = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter size of array blocks: "));
        int[] marks = new int[arrayBlocks];
        for(int i=0;i<marks.length;i++){
            marks[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Marks: "));  
        }
        for(int i=0;i<marks.length;i++){
            sum = sum + marks[i];
        }
        JOptionPane.showMessageDialog(null,"The total marks is:-"+sum);
    }
}
