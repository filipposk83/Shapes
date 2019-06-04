package circleexample;

public class CircleExample {

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();

//        circle1.x = 1;//instant variable has default value
//        circle1.y = 2;//instant variable has default value
//        circle1.radius = 5;//instant variable has default value
//
//        System.out.println(circle1.x);
//        System.out.println(circle1.y);
//        System.out.println(circle1.radius);
//        System.out.println(circle2.x);// 0--> default value
//        System.out.println(circle2.y);// 0--> default value
//        System.out.println(circle2.radius);// 0--> default value
//        System.out.println("Perimeter of circle2 is "+circle2.getPerimeter());
//        int x;//local variable has not default value --> need initilization
//        System.out.println(x);
        circle1.setX(5);
        circle1.setY(5);
        circle1.setRadius(10);
        circle2.setX(1);
        circle2.setY(1);
        circle2.setRadius(3);
        System.out.println(circle1.getX());
        System.out.println(circle1.getY());
        System.out.println(circle1.getRadius());

        double tempPer = circle1.getPerimeter();
        System.out.println("Perimeter of circle1 is " + tempPer);
        System.out.println("Area of circle1 is " + circle1.getArea());

        Circle[] cycles = {circle1, circle2};
        for (int i = 0; i < 2; i++) {
            System.out.println(cycles[i].getX());
            System.out.println(cycles[i].getY());
            System.out.println(cycles[i].getRadius());
            System.out.println(cycles[i].getPerimeter());
            System.out.println(cycles[i].getArea());
        }

    }

}
