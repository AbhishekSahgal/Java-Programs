class A{
    public int x,y,z;
    public void sub(int a,int b){
        x = a;
        y = b;
        z = x+y;
        System.out.println(z);
    }
}
class B extends A{
    public void mul(int a,int b){
        x = a;
        y = b;
        z = x*y;
        System.out.println(z);
    }
}
public class Example_21 {
    public static void main(String[] args) {
        B obj = new B();
        obj.sub(10,20);
        obj.mul(10,2);
    }
}
