public class WrapperClass {
    public static void main(String[] args) {
        int a = 20;
        Integer obj1 = a;//autoboxing
        int b = obj1.intValue();//unboxing
        System.out.println(b);
    }
}
