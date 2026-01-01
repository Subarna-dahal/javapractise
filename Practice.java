abstract class Shapes {
    abstract void area();

    void display() {
        System.out.println("This is a Shape");
    }
}

class Rectangles extends Shapes {
    private double length;
    private double breadth;

    public void setLength(double length) {
        if (length <= 0) {
            System.out.println("Invalid length. Setting default = 1");
            this.length = 1;
        } else {
            this.length = length;
        }
    }

    public void setBreadth(double breadth) {
        if (breadth <= 0) {
            System.out.println("Invalid breadth. Setting default = 1");
            this.breadth = 1;
        } else {
            this.breadth = breadth;
        }
    }

    @Override
    void area() {
        double result = length * breadth;
        System.out.println("Rectangle Area = " + result);
    }
}
class Cirlcles extends Shapes{
    private double radius;
    public void setRadius(double radius){
        if(radius<=0){
            System.out.println("Invalid radius:");
            this.radius=1;
        }
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    void area(){
        double area=Math.PI*(radius*radius);
        System.out.println("The area of Circle is:"+area);
    }
}

public class Practice {
    public static void main(String[] args) {
        Rectangles r = new Rectangles();
        r.setLength(20);
        r.setBreadth(-22);

        r.display();
        r.area();
        Cirlcles c=new Cirlcles();
        c.setRadius(2);
        c.display();
        c.area();
    }
}
