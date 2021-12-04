package Multithreading;

public class Count {
    public int num;
    public void number() throws InterruptedException {
        for (int i= 0; i<= 10; i++){
            if(i == 6){
                Thread.sleep(5000);
                System.out.println(i);
            }
            else
                System.out.println(i);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Count obj = new Count();
        obj.number();
    }
}
