class A{
    public void show(){
        System.out.println("Show in A");
    }
}
class B extends A{
    public void show1(){
        System.out.println("In the Show B");
    }
}
public class upcastAndDownCasting {
    public static void main(String[] args){
        A obj=(A)new B();
        obj.show();
    }
}
