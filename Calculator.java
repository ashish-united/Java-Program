import java.util.Scanner;
public class Calculator{
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the first number");
        a= sc.nextInt();
        System.out.println("Enter the Second number");
        b= sc.nextInt();
        System.out.println("1.Add 2.Sub 3.Mul 4.div 5.exit");
        c=sc.nextInt();
        switch (c) {
            case 1 -> System.out.println("Adttion of two number "+(a+b));
            case 2 -> System.out.println("Subtraction of 1st - 2nd "+(a-b));
            case 3 -> System.out.println("Multiplication of two number "+(a*b));
            case 4 -> System.out.println("Division "+(a/b));
            default -> {}
        }
    }
}