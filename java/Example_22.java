abstract class A{
        public void f1(){
            System.out.println("This is f1 function");
        }
}
class B extends A{
    public void f2(){
        System.out.println("This is f2 Fucction");
    }
}
public class Example_22 {
    public static void main(String[] args) {
        B object = new B();
        object.f2();
    }
}
