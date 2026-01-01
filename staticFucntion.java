class Students{
   static String name;
    int rollno;
    int marks;
    static{
        name="subarna";
    }

    public static void show(Students obj1,Students obj2){
        System.out.println(name+obj1.rollno+ obj1.marks );
    }
}
public class staticFucntion {
    public static void main(String[] args){
        Students obj1=new Students();
        Students obj2=new Students();
        Students.name="Subarna";
        obj1.rollno=18;
        obj1.marks=64;
        obj2.rollno=1;
        obj2.marks=78;
        Students.show(obj1,obj2);

    }
}
