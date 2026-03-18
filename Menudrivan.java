import java.util.Scanner;
class reverse  {
    protected int d;
    public  void   reverse(int a){
        int b= a;
        d =0;
        while(b>0)
        { 
            int e=b%10;
            d =d *10 + e; 
            b= b/10;
        }
      System.out.println("reverse is"+d);
    }
}
class pallindrome extends reverse
{
    public void  pallindrome(int a){
            if(d==a)
            {
                System.out.println("pallindrome");
            }
            else
            {
                System.out.println("not pallindrome");
            }   
        }
}
class Armstrong 
{
    public  void  armstrong(int a) {
            int b= a;
            int d =0;
            while(b>0)
            { 
                a=b%10;
                d =d + (a*a*a); 
                b= b/10;
            }
            if(d==a)
            {
                System.out.println("armstrong");
            }
            else
            {
                System.out.println("not armstrong");
            }   
      }
}   
class Menudrivan{
        public static void main(String[] args) {
            System.out.println("1.reverse");
            System.out.println("2.pallindrome");
            System.out.println("3.armstrong");
            System.out.println("4.exit");
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the choice");
            int b = sc.nextInt();
            while(b!=4)
            {
                if(b==1)
                {
                    System.out.println("enter the number");
                    int input = sc.nextInt();
                    reverse r = new reverse();
                    r.reverse(input);
                }
                else if(b==2)
                {
                    System.out.println("enter the number");
                    int input = sc.nextInt();
                    pallindrome p = new pallindrome();
                    p.pallindrome(input);
                }
                else if(b==3)
                {
                    System.out.println("enter the number");
                    int input = sc.nextInt();
                    Armstrong a = new Armstrong();
                    a.armstrong(input);
                }
                else if(b==4)
                {
                    System.out.println("exit");
                }
                else
                {
                    System.out.println("invalid choice");   
                }
            }
        }
}
