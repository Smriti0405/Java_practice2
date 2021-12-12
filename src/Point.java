public class Point {
    private int x;
    private int y;

    Point() {
        x = 10;
        y = 20;
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
        System.out.println(x);
    }

    public void setY(int y) {
        this.y = y;
        System.out.println(y);
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println(x+" "+y);
    }
}
class Show1 {
    public static void main(String[] args) {
        Point obj1 = new Point();
        obj1.setXY(45, 67);
        Point obj2 = new Point(30, 40);
        obj2.setX(90);
        obj2.setY(78);
    }
}
