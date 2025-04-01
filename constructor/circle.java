public class circle {
    private int radius;

    public circle() {

        radius = 5;

    }

    public circle(int radius) {

        this.radius = radius;
    }

    public void display() {

        System.out.println("the radius of circle:" + radius);

    }

    public int calculate() {
        return  2 * radius* radius;
    }

    public static void main(String[] args) {
        circle first = new circle();
        System.out.println("the first circle:");
        first.display();
        circle second = new circle(2);
        System.out.println("second circle:");
        second.display();
        System.out.println("the circumference of circle:"+first.calculate());
        System.out.println("the circumference of circle:"+second.calculate());


    }
}


