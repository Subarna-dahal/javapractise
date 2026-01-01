class Schools{
   static String name;
    static int rollno;
    int marks;
    void show(){
        System.out.println(name+" has roll no "+rollno+ " with the marks of "+marks);
    }
}
public class StaticVariable {
    public static void main(String[] args){
        Schools obj1=new Schools();
        obj1.name="subarna";
        obj1.rollno=18;
        obj1.marks=48;
        Schools obj2=new Schools();
        obj2.rollno=1;
        obj2.marks=78;
        Schools.name="sub";
        Schools.rollno=1;
        obj1.show();
        obj2.show();
    }
}
