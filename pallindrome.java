import java.util.Scanner;
    class pallindrome{
        public static void main(String[] args)
         {
            int b,c,d=0;
            System.out.println("Enter any number");
            Scanner br =new Scanner(System.in);
           b=br.nextInt();
           int f=b;
            while(b>0)
            {
                c=b%10;
                d=d*10+c;
                b=b/10;
            }
            if(d==f)
            {
                System.out.println("Number is pallindrome no .");
            }
            else
            {
                System.out.println("Number is not pallindrome no.");
            }
         }
    }
    