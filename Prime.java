import java.util.Scanner;
public class Prime{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int a= sc.nextInt();
       int i,f;
       f=0;
       for(i=2;i<a;i++)
       {
        if(a%i==0)
        {
            f=1;
            break;
        }
       }
       if(f==1)
       {
        System.out.println("Number is composite");
       }
        else
        {
         System.out.println("Number is prime");
       }
    }
}


