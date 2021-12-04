public class Point {
    private int x;
    private int y;

    public Point() {
        x = 10;
        y = 20;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
class Show1 {
    public static void main(String[] args) {
        Point obj1 = new Point();
        System.out.println(obj1);
        Point obj2 = new Point(30, 40);
        System.out.println(obj2);
    }
}
