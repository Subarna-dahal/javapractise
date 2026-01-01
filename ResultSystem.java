class Person{
    private String name;
    private int age;
    Person(String name,int age){
        setName(name);
        setAge(age);
    }
   public void setName(String name){
        if(name==null||name.trim().isEmpty()){
            this.name="Unknown";
        }else {
            this.name=name.trim();

        }
    }
    public String getName(){
        return name;
    }
   public void setAge(int age){
        if(age<=0){
            System.out.println("Name cannot be less than 0 :Default age is 18");
            this.age=18;
        }else {
            this.age=age;
        }
   }

void showdetails() {
    System.out.println("Name is " + name+" age is "+age);
}
}
class Student extends Person{
    private  int rollno;
    Student(String name,int age,int rollno){
    super(name,age);
    setRollno(rollno);
    }
    public void setRollno(int rollno){
        if(rollno<=0){
            System.out.println("Invalid roll no this cannot be accepted:)");
            this.rollno=100;
        }else {
            this.rollno=rollno;
        }
    }
    public int getRollno(){
        return rollno;
    }
    void showdetails(){
        super.showdetails();
        System.out.println("The roll no is "+rollno);
    }
}
class Result extends Student{
    private int marks;
    Result(String name,int age,int rollno,int marks){
        super(name,age,rollno);
        setMarks(marks);
    }
    public void setMarks(int marks){
        if(marks<0||marks>100){
            System.out.println("Invalid marks given");
            this.marks=0;
        }
        else {
            this.marks=marks;
        }
    }
    public int getMarks(){
        return marks;
    }
    void showdetails(){
        super.showdetails();
        System.out.println("The marks of the Student are :"+marks);
    }
}
public class ResultSystem{
public static void main(String[] args){
Result obj1=new Result("Subarna",22,4,55);
obj1.showdetails();
}
}