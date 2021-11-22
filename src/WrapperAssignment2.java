import java.util.Scanner;

public class WrapperAssignment2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println("Binary equivalent: "+ Integer.toBinaryString(num));
        System.out.println("Octal equivalent: "+ Integer.toOctalString(num));
        System.out.println("Hexadecimal equivalent: "+ Integer.toHexString(num));
    }
}
