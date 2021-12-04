public class Box {
    int l, b, h;

    Box(int length, int breadth, int height) {
        l = length;
        b = breadth ;
        h = height;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }
}

class Box3d extends Box {

        Box3d(int length, int breadth, int height) {
            super(length, breadth, height);
        }


        public void value() {
            System.out.println(l * b);
            System.out.println(l * b * h);
        }
    }

    class Show{
        public static void main(String[] args) {
            Box3d obj = new Box3d(2, 3, 4);
            obj.value();
        }
    }

