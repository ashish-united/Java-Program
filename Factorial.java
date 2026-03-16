import java.util.Scanner;
    class Factorial{
        public static void main(String[] args)
         {
            int b;
            System.out.println("Enter any number");
            Scanner br =new Scanner(System.in);
            b=br.nextInt();
            int fact=1;
            while(b>0)
            {
                fact=fact*b;
                b--;
            }
            System.out.println("factorial is "+fact);  
         }
    }
