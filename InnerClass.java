////class Outer {
////    class Inner {
////        void show() {
////            System.out.println("Inside Inner Class");
////        }
////    }
////}
////
////public class InnerClass {
////    public static void main(String[] args) {
////        Outer obj1=new Outer();
////        Outer.Inner obj2=obj1.new Inner();
////        obj2.show();
////    }
////}
//class Outer{
//    static class inner{
//        void show(){
//            System.out.println("hello bro...");
//        }
//
//    }
//}
//public class InnerClass {
//    public static void main(String[] args){
//        Outer.inner obj1=new Outer.inner();
//        obj1.show();
//
//    }
//}
interface Hello{
    void show();
    void hero();
}
public class InnerClass{
    public static void main(String[] args){
        Hello obj1=new Hello(){
            public void show(){
                System.out.println("Hello from Annomyous class");
            }
            public void hero(){
                System.out.println("Hello bro hero subarna");
            }
        };
        obj1.show();
        obj1.hero();
        //use only when there will be uses of class once at a time
    }
}