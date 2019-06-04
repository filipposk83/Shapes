package circleexample;

public class Circle {

    private int x, y;//instant variable
    private int radius;//instant variable

    public int getX() {
        return x;
    }
    //pos dimiourgo sosta sxolia se methods oste na anagnorizetai apo Javadoc
    /**
     * set value to instant variable x
     * @param x will go to this.x
     */
    public void setX(int x) {
        if (x >= 0) {
            this.x = x;
        }
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if (y >= 0) {
            this.y = y;
        }
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius >= 0) {
            this.radius = radius;
        }
    }

    public double getPerimeter() {
        double result = 2 * Math.PI * radius;
        return result;
    }

    public double getArea() {
        double result = Math.PI * Math.pow(radius, 2);
        return result;
    }
}
