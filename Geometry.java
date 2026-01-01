class Shape {
    private String color;

    Shape(String color) {
        setColor(color);
    }

    public void setColor(String color) {
        if (color == null || color.trim().isEmpty()) {
            this.color = "NoColor";
        } else {
            this.color = color.trim();
        }
    }

    public String getColor() {
        return color;
    }

    double Area() {
        return 0;
    }

     void display() {
        System.out.println("the color:" + color);
    }
}

class Rectangle extends Shape {
    private double length;
    private double breath;

    Rectangle(double length, double breath, String color) {
        super(color);
        setLength(length);
        setBreath(breath);
    }

    public void setLength(double length) {
        if (length <= 0) {
            System.out.println("Length cannot be zero oe less than zero");
            this.length = 1;
        } else {
            this.length = length;
        }
    }

    public double getLength() {
        return length;
    }

    public void setBreath(double breath) {
        if (breath <= 0) {
            System.out.println("Breath cannot be less or less than zero");
            this.breath = 1;
        } else {
            this.breath = breath;
        }
    }

    public double getBreath() {
        return breath;
    }

    double Area() {
        return length * breath;
    }

    void display() {
        super.display();
        System.out.println("The Are for rectangle is:" + Area());
    }
}

class Circle extends Shape {
    private double radius;

    Circle(String color,double radius) {
        super(color);
        setRadius(radius);

    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            System.out.println("radius cannot be less than zero");
            this.radius = 1;
        } else {
            this.radius = radius;
        }
    }


    double Area() {
        return Math.PI*(radius*radius);
    }
     void display(){
        super.display();
        System.out.println("The area for Circle is:"+Area());
    }
}

class Geometry {
    public static void main(String[] args) {
       Rectangle obj1=new Rectangle(13,10,"Red");
       obj1.display();
       Circle obj2=new Circle("Black",2);
       obj2.display();
    }
}