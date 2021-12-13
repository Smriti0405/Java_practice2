import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_check {
    public static void main(String[] args) {


        int a;
        int b;
        int[] arr = {12, 39, 45, 32};
        int index;
        try (Scanner s = new Scanner(System.in);) {
            a = s.nextInt();
            b= s.nextInt();
            index = s.nextInt();
            System.out.println(a/b);
            System.out.println(arr[index]);
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException | InputMismatchException obj){
            System.out.println(obj);
        }
        finally{
            System.out.println("Finally block");
        }
        System.out.println("End of exception");
    }
}
