interface Shapess {
    void area();
}

class Rectangless implements Shapess {
    private double length;
    private double breadth;

    // Setter for length
    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            System.out.println("Error: Length must be positive!");
        }
    }

    // Setter for breadth with validation
    public void setBreadth(double breadth) {
        if (breadth > 0) {
            this.breadth = breadth;
        } else {
            System.out.println("Error: Breadth must be positive!");
        }
    }

    @Override
    public void area() {
        if (length > 0 && breadth > 0) {
            System.out.println("Area of Rectangle: " + (length * breadth));
        } else {
            System.out.println("Cannot calculate area: Invalid dimensions for Rectangle");
        }
    }
}

class Circless implements Shapess {
    private double radius;

    // Setter for radius with validation
    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Error: Radius must be positive!");
        }
    }

    @Override
    public void area() {
        if (radius > 0) {
            System.out.printf("Area of Circle: %.2f\n", (3.14 * radius * radius));
        } else {
            System.out.println("Cannot calculate area: Invalid radius for Circle");
        }
    }
}

public class Interface {
    public static void main(String[] args) {
        // Create objects
        Rectangless rect = new Rectangless();
        Circless cir = new Circless();

        // Set valid values
        rect.setLength(10);
        rect.setBreadth(5);

        cir.setRadius(7);

        // Call area methods
        rect.area();



    }
}