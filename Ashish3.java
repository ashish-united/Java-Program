import java.util.Scanner;
class Ashish3
{
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Enter any Integer Number");
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        System.err.println("Enter any another Number");
        b=sc.nextInt();
         c=a+b ;
        System.out.println("Sum of 1st two number "+c);
    }
}