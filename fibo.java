
import java.util.Scanner;

class fibo{
    public static int fibo(int n){
        return switch (n) {
            case 0 -> 0;
            case 1 -> 1;
            default -> fibo(n-1) + fibo(n-2);
        };
    }
    public static void main(String[] args) {
        int a;
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        for(int i = 0; i < a; i++){
            System.out.print(fibo(i) + " ");
        }
    }
}