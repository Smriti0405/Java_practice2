public class Outer {
    public void display() {
        System.out.println("Class Outer");
    }

    class Inner {
        public void display() {
            System.out.println("Class Inner");
        }
    }
}
class aaa
{
    public static void main(String[] args) {
        Outer obj1 = new Outer();
        obj1.display();
        Outer.Inner obj2 = obj1.new Inner();
        obj2.display();
    }
}
