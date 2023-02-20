import java.io.FileOutputStream;
public class Example_24 {
    public static void main(String[] args){
        try{
            FileOutputStream obj = new FileOutputStream("E:\\text\\textout.txt");
        String s = "Hello my name is Abhishek sahgal";
        byte b[] = s.getBytes();
        obj.write(b);
        obj.close();
        System.out.println("Success");
        }catch(Exception e){
            System.out.println(e);
        }

    }
}
